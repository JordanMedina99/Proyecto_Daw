-- Llenamiento de las tablas distrito
INSERT INTO distrito (nombre, especializacion, puestos_trabajo, juegos_ganados, cantidad_habitantes, ubicacion, clima, porcentaje_hombres, porcentaje_mujeres, lider_nombre)
VALUES ('Distrito 1', 'Producción de artículos de lujo.', 2200, 5, 10000, 'Ubicación 1', 'Frio', 50.0, 50.0, 'Líder 1'),
       ('Distrito 2', 'Masonería y producción de armas', 2050, 3, 15000, 'Ubicación 2', 'Fresco', 60.0, 40.0, 'Líder 2'),
       ('Distrito 3', 'Tecnología y electrónicos', 3050, 2, 12000, 'Ubicación 3', 'Templado', 45.0, 55.0, 'Líder 3'),
       ('Distrito 4', 'Pesca y productos del mar', 4020, 5, 10000, 'Ubicación 4', 'Calido', 50.0, 50.0, 'Líder 4  '),
       ('Distrito 5', 'Energía y electricidad', 2000, 3, 15000, 'Ubicación 5', 'Caluroso', 60.0, 40.0, 'Líder 5'),
       ('Distrito 6', 'Transporte y vehículos', 1050, 2, 12000, 'Ubicación 6', 'Frio', 45.0, 55.0, 'Líder 6'),
       ('Distrito 7', 'Madera y productos de madera', 1220, 5, 10000, 'Ubicación 7', 'Caluroso', 50.0, 50.0, 'Líder 7'),
       ('Distrito 8', 'Textiles y producción de ropa', 450, 3, 15000, 'Ubicación 8', 'Frio', 60.0, 40.0, 'Líder 8'),
       ('Distrito 9', 'Agricultura y producción de alimentos', 5550, 2, 12000, 'Ubicación 9', 'Calido', 45.0, 55.0, 'Líder 9'),
       ('Distrito 10','Ganadería y producción de carne', 780, 5, 10000, 'Ubicación 10', 'Calido', 50.0, 50.0, 'Líder 10'),
       ('Distrito 11','Agricultura y cultivo de cosechas', 200, 3, 15000, 'Ubicación 11', 'Calido ', 60.0, 40.0, 'Líder 11'),
       ('Distrito 12','Minería y producción de carbón', 950, 2, 12000, 'Ubicación 12', 'Caluroso ', 45.0, 55.0, 'Líder 12');




-- Llenamiento de las tablas tributo

INSERT INTO tributo (curp, nombre, sexo, edad, habilidad, espectaculo_puntuacion, distrito_id)
VALUES ('ABCD010101HDFGHLA1', 'Katniss', 'F', 18, 'Supervivencia', 8, 1),
       ('EFGH020202MTYJKLB2', 'Peeta', 'M', 17, 'Panadero', 7, 2),
       ('IJKL030303GDLFIMC3', 'Johanna', 'F', 16, 'Fuerza', 9, 3),
       ('MNOP040404TIJOGND4', 'Rue', 'M', 13, 'Arqueria', 8, 4),
       ('QRST050505PUEHOMC5', 'Primrose', 'F', 14, 'Lucha', 7, 5),
       ('UVWX060606MTYJALP6', 'Haymitch', 'M', 15, 'Escalada 3', 9, 6),
       ('YZAB070707HDFGQRO7', 'Cato', 'M', 16, 'Supervivencia', 8, 7),
       ('CDEF080808GDLLOFP8', 'Glimmer', 'F', 17, 'Natacion', 7, 8),
       ('GHIJ090909TIJHINQ9', 'Marvelios', 'M', 12, 'Habilidad Lanzas', 9, 9),
       ('KLMO101010MTYPUNR0', 'Clove', 'M', 18, 'Fuerza', 8, 10),
       ('PQRS111111PUECUND1', 'Foxface', 'F', 15, 'Velocidad', 7, 11),
       ('UVWX121212HDFJQTO2', 'Thresh', 'F', 16, 'Estrategas', 9, 12),
       ('YZAB131313GDLHMEU3', 'Wiress', 'M', 18, 'Camuflaje', 8, 12),
       ('CDEF141414TILIROV4', 'Beetee', 'F', 13, 'Herbolaria', 7, 11),
       ('GHIJ151515PUEKXWX5', 'Cashmere', 'M', 16, 'Tactico', 9, 10),
       ('MNOP161616HDFBZVY6', 'Gloss', 'M', 13, 'Manipulacion', 8, 9),
       ('QRST171717GDLSDXA7', 'Enobaria', 'F', 14, 'Trampas', 7, 8),
       ('IJKL181818TIJSRQW8', 'Mags', 'F', 16, 'Cazador', 9, 7),
       ('UVWX191919MTYUXTZ9', 'Annie ', 'F', 18, 'Pescador', 8, 6),
       ('PQRS202020PUEVDMA0', 'Boggs', 'F', 15, 'Defensa', 7, 5),
       ('YZAB212121HDFKNEB1', 'Lyme', 'M', 16, 'Camuflaje 3', 9, 4),
       ('CDEF222222GDLJGOI2', 'Chaff', 'M', 18, 'Arqueria', 8, 3),
       ('KLMO232323TILHPJN3', 'Seeder', 'F', 17, 'Lucha', 7, 2),
       ('QRST242424PUEIQKO4', 'Percy', 'M', 16, 'Escalada', 9, 1);

hasta aqui aun no modificamos con los datos que deben de ser

-- Llenar la tabla mentor
INSERT INTO mentor (curp, nombre, edad, puesto, especialidad, tributo_id)
VALUES ('ABCD252525MTYPGHR5', 'Liam', 30, 'Puesto 1', 'Especialidad 1', 1),
       ('EFGH262626GDLAFSI6', 'Isabella', 28, 'Puesto 2', 'Especialidad 2', 2),
       ('IJKL272727HDFROEQ7', 'Gabriel', 35, 'Puesto 3', 'Especialidad 3', 3),
       ('MNOP282828TILWNHT8', 'Olivia', 30, 'Puesto 1', 'Especialidad 1', 4),
       ('QRST292929PUELDVG9', 'Ethan', 28, 'Puesto 2', 'Especialidad 2', 5),
       ('UVWX303030MTYZESI0', 'Sophia', 35, 'Puesto 3', 'Especialidad 3', 6),
       ('YZAB313131GDLRFWP1', 'Ava', 30, 'Puesto 1', 'Especialidad 1', 7),
       ('CDEF323232HDFXOKQ2', 'Benjamin', 28, 'Puesto 2', 'Especialidad 2', 8),
       ('GHIJ333333TILKDYR3', 'Emma', 35, 'Puesto 3', 'Especialidad 3', 9),
       ('KLMO343434MTYBUZS4', 'Samuel', 30, 'Puesto 1', 'Especialidad 1', 10),
       ('PQRS353535PUEHOFI5', 'Mia', 28, 'Puesto 2', 'Especialidad 2', 11),
       ('UVWX363636GDLIJTG6', 'Alexander', 35, 'Puesto 3', 'Especialidad 3', 12),
       ('YZAB373737HDFPWEH7', 'Charlotte', 30, 'Puesto 1', 'Especialidad 1', 13),
       ('CDEF383838TILKFRM8', 'William', 28, 'Puesto 2', 'Especialidad 2', 14),
       ('GHIJ393939MTYJIPL9', 'Harper ', 35, 'Puesto 3', 'Especialidad 3', 15),
       ('MNOP404040PUEBTRN0', 'Daniel', 30, 'Puesto 1', 'Especialidad 1', 16),
       ('QRST414141GDLNUIQ1', 'Amelia', 28, 'Puesto 2', 'Especialidad 2', 17),
       ('IJKL424242HDFDMOZ2', 'James', 35, 'Puesto 3', 'Especialidad 3', 18),
       ('UVWX434343TILGHNY3', 'Evelyn', 30, 'Puesto 1', 'Especialidad 1', 19),
       ('PQRS444444MTYKLRX4', 'Michael', 28, 'Puesto 2', 'Especialidad 2', 20),
       ('YZAB454545PUEZWTS5', 'Abigail', 35, 'Puesto 3', 'Especialidad 3', 21),
       ('CDEF464646GDLBPXU6', 'David', 30, 'Puesto 1', 'Especialidad 1', 22),
       ('KLMO474747HDFSNQV7', 'Grace', 28, 'Puesto 2', 'Especialidad 2', 23),
       ('QRST484848TILALMR8', 'Sophia', 35, 'Puesto 3', 'Especialidad 3', 24);

-- Llenar la tabla puntuacion
INSERT INTO puntuacion (valor, tributo_id)
VALUES (10, 1),
       (8, 2),
       (9, 3),
       (10, 4),
       (8, 5),
       (9, 6),
       (10, 7),
       (1, 8),
       (9, 9),
       (10, 10),
       (8, 11),
       (9, 12),
       (10, 13),
       (8, 14),
       (9, 15),
       (10, 16),
       (8, 17),
       (9, 18),
       (10, 19),
       (8, 20),
       (9, 21),
       (12, 22),
       (8, 23),
       (9, 24);

-- Llenar la tabla prueba
INSERT INTO prueba (codigo, nombre, tipo, dificultad, vencedor_nombre, tiempo_empleado)
VALUES ('CODIGO1', 'Prueba 1', 'Tipo 1', 'Difícil', 'Vencedor 1', '01:30:00'),
       ('CODIGO2', 'Prueba 2', 'Tipo 2', 'Fácil', 'Vencedor 2', '00:45:00'),
       ('CODIGO3', 'Prueba 3', 'Tipo 1', 'Difícil', 'Vencedor 1', '01:30:00'),
       ('CODIGO4', 'Prueba 4', 'Tipo 2', 'Fácil', 'Vencedor 2', '00:45:00'),
       ('CODIGO5', 'Prueba 5', 'Tipo 1', 'Difícil', 'Vencedor 1', '01:30:00'),
       ('CODIGO6', 'Prueba 6', 'Tipo 2', 'Fácil', 'Vencedor 2', '00:45:00'),
       ('CODIGO7', 'Prueba 7', 'Tipo 1', 'Difícil', 'Vencedor 1', '01:30:00'),
       ('CODIGO8', 'Prueba 8', 'Tipo 2', 'Fácil', 'Vencedor 2', '00:45:00'),
       ('CODIGO9', 'Prueba 9', 'Tipo 1', 'Difícil', 'Vencedor 1', '01:30:00'),
       ('CODIGO10', 'Prueba 10', 'Tipo 2', 'Fácil', 'Vencedor 2', '00:45:00'),
       ('CODIGO11', 'Prueba 11', 'Tipo 1', 'Difícil', 'Vencedor 1', '01:30:00'),
       ('CODIGO12', 'Prueba 12', 'Tipo 2', 'Fácil', 'Vencedor 2', '00:45:00'),
       ('CODIGO13', 'Prueba 13', 'Tipo 1', 'Difícil', 'Vencedor 1', '01:30:00'),
       ('CODIGO14', 'Prueba 14', 'Tipo 2', 'Fácil', 'Vencedor 2', '00:45:00'),
       ('CODIGO15', 'Prueba 15', 'Tipo 1', 'Difícil', 'Vencedor 1', '01:30:00'),
       ('CODIGO16', 'Prueba 16', 'Tipo 2', 'Fácil', 'Vencedor 2', '00:45:00'),
       ('CODIGO17', 'Prueba 17', 'Tipo 1', 'Difícil', 'Vencedor 1', '01:30:00'),
       ('CODIGO18', 'Prueba 18', 'Tipo 2', 'Fácil', 'Vencedor 2', '00:45:00'),
       ('CODIGO19', 'Prueba 19', 'Tipo 1', 'Difícil', 'Vencedor 1', '01:30:00'),
       ('CODIGO20', 'Prueba 20', 'Tipo 2', 'Fácil', 'Vencedor 2', '00:45:00'),
       ('CODIGO21', 'Prueba 21', 'Tipo 1', 'Difícil', 'Vencedor 1', '01:30:00'),
       ('CODIGO22', 'Prueba 22', 'Tipo 2', 'Fácil', 'Vencedor 2', '00:45:00'),
       ('CODIGO23', 'Prueba 23', 'Tipo 1', 'Difícil', 'Vencedor 1', '01:30:00'),
       ('CODIGO24', 'Prueba 24', 'Tipo 2', 'Fácil', 'Vencedor 2', '00:45:00');

-- Llenar la tabla participacion
INSERT INTO participacion (fecha, tiempo_empleado, tributo_id, prueba_id)
VALUES ('2023-01-01', '00:30:00', 1, 1),
       ('2023-02-01', '00:25:00', 2, 1),
       ('2023-03-01', '00:10:00', 3, 2),
       ('2023-01-01', '00:15:00', 4, 1),
       ('2023-02-01', '00:18:00', 5, 1),
       ('2023-03-01', '00:27:00', 6, 2),
       ('2023-01-01', '00:32:00', 7, 1),
       ('2023-02-01', '00:35:00', 8, 1),
       ('2023-03-01', '00:38:00', 9, 2),
       ('2023-01-01', '00:40:00', 10, 1),
       ('2023-02-01', '00:42:00', 11, 1),
       ('2023-03-01', '00:50:00', 12, 2),
       ('2023-01-01', '00:12:00', 13, 1),
       ('2023-02-01', '00:22:00', 14, 1),
       ('2023-03-01', '00:23:00', 15, 2),
       ('2023-01-01', '00:33:00', 16, 1),
       ('2023-02-01', '00:37:00', 17, 1),
       ('2023-03-01', '00:44:00', 18, 2),
       ('2023-01-01', '00:52:00', 19, 1),
       ('2023-02-01', '00:57:00', 20, 1),
       ('2023-03-01', '00:48:00', 21, 2),
       ('2023-01-01', '00:36:00', 22, 1),
       ('2023-02-01', '00:41:00', 23, 1),
       ('2023-03-01', '00:58:00', 24, 2);


-- Llenar la tabla entrenamiento
INSERT INTO entrenamiento (tributo_id, prueba_id)
VALUES (1, 1),
       (2, 2),
       (3, 1),
       (4, 1),
       (5, 2),
       (6, 1),
       (7, 1),
       (8, 2),
       (9, 1),
       (10, 1),
       (11, 2),
       (12, 1),
       (13, 1),
       (14, 2),
       (15, 1),
       (16, 1),
       (17, 2),
       (18, 1),
       (19, 1),
       (20, 2),
       (21, 1),
       (22, 1),
       (23, 2),
       (24, 1);


-- Llenar la tabla capitolio
INSERT INTO capitolio (nombre_presidente, numero_habitantes, ubicacion, clima, porcentaje_hombres, porcentaje_mujeres, lugares_interes)
VALUES ('Presidente 1', 1000000, 'Ubicación 1', 'Clima 1', 50.0, 50.0, 'Lugar de interés 1');
       
