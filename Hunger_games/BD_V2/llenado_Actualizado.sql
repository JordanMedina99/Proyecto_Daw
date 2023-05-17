-- Llenado de las tablas distrito

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


-- Llenado de las tablas tributo

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

-- Llenado la tabla mentor

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

-- Llenado de la tabla dificultad

INSERT INTO dificultad (ID_Dificultad, descripcion)
VALUES ('D1', 'Dificultad 1'),
       ('D2', 'Dificultad 2'),
       ('D3', 'Dificultad 3'),
       ('D4', 'Dificultad 1'),
       ('D5', 'Dificultad 2'),
       ('D6', 'Dificultad 1'),
       ('D7', 'Dificultad 1'),
       ('D8', 'Dificultad 4'),
       ('D9', 'Dificultad 2'),
       ('D10', 'Dificultad 1'),
       ('D11', 'Dificultad 1'),
       ('D12', 'Dificultad 2'),
       ('D13', 'Dificultad 3'),
       ('D14', 'Dificultad 1'),
       ('D15', 'Dificultad 2'),
       ('D16', 'Dificultad 1'),
       ('D17', 'Dificultad 1'),
       ('D18', 'Dificultad 2'),
       ('D19', 'Dificultad 2'),
       ('D20', 'Dificultad 1'),
       ('D21', 'Dificultad 2'),
       ('D22', 'Dificultad 1'),
       ('D23', 'Dificultad 2'),
       ('D24', 'Dificultad 1');





-- Llenado de la tabla prueba

INSERT INTO prueba (codigo, nombre, tipo, dificultad_id, vencedor_id, tiempo_empleado)
VALUES ('P1', 'Prueba 1', 'Tipo 1', 'D1', 1, '02:00:00'),
       ('P2', 'Prueba 1', 'Tipo 1', 'D2', 2, '02:00:00'),
       ('P3', 'Prueba 1', 'Tipo 1', 'D3', 3, '02:00:00'),
       ('P4', 'Prueba 1', 'Tipo 1', 'D4', 4, '02:00:00'),
       ('P5', 'Prueba 1', 'Tipo 1', 'D5', 5, '02:00:00'),
       ('P6', 'Prueba 1', 'Tipo 1', 'D6', 6, '02:00:00'),
       ('P7', 'Prueba 1', 'Tipo 1', 'D7', 7, '02:00:00'),
       ('P8', 'Prueba 1', 'Tipo 1', 'D8', 8, '02:00:00'),
       ('P9', 'Prueba 1', 'Tipo 1', 'D9', 9, '02:00:00'),
       ('P10', 'Prueba 1', 'Tipo 1', 'D10', 10, '02:00:00'),
       ('P11', 'Prueba 1', 'Tipo 1', 'D11', 11, '02:00:00'),
       ('P12', 'Prueba 1', 'Tipo 1', 'D12', 12, '02:00:00'),
       ('P13', 'Prueba 1', 'Tipo 1', 'D13', 13, '02:00:00'),
       ('P14', 'Prueba 1', 'Tipo 1', 'D14', 14, '02:00:00'),
       ('P15', 'Prueba 1', 'Tipo 1', 'D15', 15, '02:00:00'),
       ('P16', 'Prueba 1', 'Tipo 1', 'D16', 16, '02:00:00'),
       ('P17', 'Prueba 1', 'Tipo 1', 'D17', 17, '02:00:00'),
       ('P18', 'Prueba 1', 'Tipo 1', 'D18', 18, '02:00:00'),
       ('P19', 'Prueba 1', 'Tipo 1', 'D19', 19, '02:00:00'),
       ('P20', 'Prueba 1', 'Tipo 1', 'D20', 20, '02:00:00'),
       ('P21', 'Prueba 1', 'Tipo 1', 'D21', 21, '02:00:00'),
       ('P22', 'Prueba 1', 'Tipo 1', 'D22', 22, '02:00:00'),
       ('P23', 'Prueba 1', 'Tipo 1', 'D23', 23, '02:00:00'),
       ('P24', 'Prueba 1', 'Tipo 1', 'D24', 24, '02:00:00');




-- Llenado de la tabla puntuacion
INSERT INTO puntuacion (valor, tributo_id, prueba_id)
VALUES (10, 1, 1),
       (9, 2, 2),
       (7, 3, 3),
       (10, 4, 4),
       (3, 5, 5),
       (4, 6, 6),
       (5, 7, 7),
       (8, 8, 8),
       (10, 9, 9),
       (11, 10, 10),
       (1, 11, 11),
       (2, 12, 12),
       (2, 13, 13),
       (3, 14, 14),
       (4, 15, 15),
       (5, 16, 16),
       (7, 17, 17),
       (8, 18, 18),
       (8, 19, 19),
       (9, 20, 20),
       (9, 21, 21),
       (12, 22, 22),
       (9, 23, 23),
       (10, 24, 24);


-- Llenado de la tabla participacion
INSERT INTO participacion (fecha, tiempo_empleado, tributo_id, prueba_id)
VALUES ('2023-01-01', '00:30:00', 1, 1),
       ('2023-02-01', '00:25:00', 2, 2),
       ('2023-03-01', '00:10:00', 3, 3),
       ('2023-01-01', '00:15:00', 4, 4),
       ('2023-02-01', '00:18:00', 5, 5),
       ('2023-03-01', '00:27:00', 6, 6),
       ('2023-01-01', '00:32:00', 7, 7),
       ('2023-02-01', '00:35:00', 8, 8),
       ('2023-05-01', '00:38:00', 9, 9),
       ('2023-01-01', '00:40:00', 10, 10),
       ('2023-02-01', '00:42:00', 11, 11),
       ('2023-06-01', '00:50:00', 12, 12),
       ('2023-01-01', '00:12:00', 13, 13),
       ('2023-02-01', '00:22:00', 14, 14),
       ('2023-03-01', '00:23:00', 15, 15),
       ('2023-01-01', '00:33:00', 16, 16),
       ('2023-02-01', '00:37:00', 17, 17),
       ('2023-03-01', '00:44:00', 18, 18),
       ('2023-01-01', '00:52:00', 19, 19),
       ('2023-02-01', '00:57:00', 20, 20),
       ('2023-03-01', '00:48:00', 21, 21),
       ('2023-01-01', '00:36:00', 22, 22),
       ('2023-02-01', '00:41:00', 23, 23),
       ('2023-03-01', '00:58:00', 24, 24);

-- Llenado la tabla entrenamiento
INSERT INTO entrenamiento (tributo_id, prueba_id)
VALUES (1, 1),
       (2, 2),
       (3, 3),
       (4, 4),
       (5, 5),
       (6, 6),
       (7, 7),
       (8, 8),
       (9, 9),
       (10, 10),
       (11, 11),
       (12, 12),
       (13, 13),
       (14, 14),
       (15, 15),
       (16, 16),
       (17, 17),
       (18, 18),
       (19, 19),
       (20, 20),
       (21, 21),
       (22, 22),
       (23, 23),
       (24, 24);

-- Llenado la tabla capitolio
INSERT INTO capitolio (nombre_presidente, numero_habitantes, ubicacion, clima, porcentaje_hombres, porcentaje_mujeres, lugares_interes)
VALUES ('Coriolanus Snow', 1000000, 'Ubicación 1', 'Frio', 50.0, 50.0, 'Estadio de los Juegos del Hambre');
       