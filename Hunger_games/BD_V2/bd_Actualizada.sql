CREATE TABLE distrito (
    id_distrito SERIAL PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    especializacion VARCHAR(50) NOT NULL,
    puestos_trabajo INTEGER NOT NULL,
    juegos_ganados INTEGER NOT NULL,
    cantidad_habitantes INTEGER NOT NULL,
    ubicacion VARCHAR(50) NOT NULL,
    clima VARCHAR(50) NOT NULL,
    porcentaje_hombres FLOAT NOT NULL,
    porcentaje_mujeres FLOAT NOT NULL,
    lider_nombre VARCHAR(50) NOT NULL
);

CREATE TABLE tributo (
    id_tributo SERIAL PRIMARY KEY,
    curp VARCHAR(18) NOT NULL,
    nombre VARCHAR(50) NOT NULL,
    sexo VARCHAR(1) NOT NULL,
    edad INTEGER NOT NULL,
    habilidad VARCHAR(50) NOT NULL,
    espectaculo_puntuacion INTEGER NOT NULL,
    distrito_id INTEGER, 
    FOREIGN KEY (distrito_id) REFERENCES distrito(id_distrito) 
);

CREATE TABLE mentor (
    id_mentor SERIAL PRIMARY KEY,
    curp VARCHAR(18) NOT NULL,
    nombre VARCHAR(50) NOT NULL,
    edad INTEGER NOT NULL,
    puesto VARCHAR(50) NOT NULL,
    especialidad VARCHAR(50) NOT NULL,
    tributo_id INTEGER, 
    FOREIGN KEY (tributo_id) REFERENCES tributo(id_tributo) 
);

CREATE TABLE dificultad (
    ID_Dificultad VARCHAR(10) PRIMARY KEY,
    descripcion VARCHAR(50) NOT NULL
);

CREATE TABLE prueba (
    id_prueba SERIAL PRIMARY KEY,
    codigo VARCHAR(50) NOT NULL,
    nombre VARCHAR(50) NOT NULL,
    tipo VARCHAR(50) NOT NULL,
    dificultad_id VARCHAR(10) NOT NULL, 
    vencedor_id INTEGER, 
    tiempo_empleado TIME,
    FOREIGN KEY (dificultad_id) REFERENCES dificultad(ID_Dificultad), 
    FOREIGN KEY (vencedor_id) REFERENCES tributo(id_tributo) 
);

CREATE TABLE puntuacion (
    id_puntuacion SERIAL PRIMARY KEY,
    valor INTEGER NOT NULL,
    tributo_id INTEGER, 
    prueba_id INTEGER, 
    FOREIGN KEY (tributo_id) REFERENCES tributo(id_tributo), 
    FOREIGN KEY (prueba_id) REFERENCES prueba(id_prueba) 
);

CREATE TABLE participacion (
    id_participacion SERIAL PRIMARY KEY,
    fecha DATE NOT NULL,
    tiempo_empleado TIME NOT NULL,
    tributo_id INTEGER NOT NULL, 
    prueba_id INTEGER NOT NULL, 
    FOREIGN KEY (tributo_id) REFERENCES tributo(id_tributo), 
    FOREIGN KEY (prueba_id) REFERENCES prueba(id_prueba) 
);

CREATE TABLE entrenamiento (
    id_entrenamiento SERIAL PRIMARY KEY,
    tributo_id INTEGER NOT NULL, 
    prueba_id INTEGER NOT NULL, 
    FOREIGN KEY (tributo_id) REFERENCES tributo(id_tributo), 
    FOREIGN KEY (prueba_id) REFERENCES prueba(id_prueba) 
);

CREATE TABLE capitolio (
    id_capitolio SERIAL PRIMARY KEY,
    nombre_presidente VARCHAR(50) NOT NULL,
    numero_habitantes INTEGER NOT NULL,
    ubicacion VARCHAR(50) NOT NULL,
    clima VARCHAR(50) NOT NULL,
    porcentaje_hombres FLOAT NOT NULL,
    porcentaje_mujeres FLOAT NOT NULL,
    lugares_interes VARCHAR(50) NOT NULL
);
