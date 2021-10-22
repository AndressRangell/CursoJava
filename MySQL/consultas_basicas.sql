-- ************** --
-- **  LIBROS  ** --
-- ************** --

-- SELECT * FROM libros
-- WHERE autor_id IN (
--     SELECT autor_id FROM autores
--     WHERE seudonimo IS NOT NULL
-- );


-- SELECT titulo FROM libros
-- WHERE fecha_publicacion BETWEEN '2004-01-01' AND '2004-12-31'
-- AND autor_id IN(
--     SELECT autor_id FROM autores
--     WHERE seudonimo IS NOT NULL
-- );


-- SELECT * FROM libros
-- WHERE autor_id IN(
--     SELECT autor_id FROM autores
--     WHERE seudonimo IS NOT NULL
--     AND fecha_nacimiento < '1965-01-01'
-- );


-- UPDATE libros SET descripcion = "No disponible"
-- WHERE fecha_publicacion < '2000-01-01';


-- SELECT libro_id FROM libros
-- WHERE descripcion != 'No disponible';


-- SELECT titulo FROM libros
-- WHERE autor_id = 2 LIMIT 3;


-- SELECT sum(case when a.seudonimo IS NOT NULL then 1 else 0 end) AS con_seudonimo,
--     sum(case when a.seudonimo IS  NULL then 1 else 0 end) AS sin_seudonimo
-- FROM libros l, autores a
-- WHERE l.autor_id = a.autor_id;


-- SELECT COUNT(*) AS cantidad_libros FROM libros
-- WHERE fecha_publicacion BETWEEN '2000-01-01' AND '2005-01-01';


-- SELECT titulo, ventas FROM libros
-- ORDER BY ventas DESC LIMIT 5;


-- SELECT titulo, ventas FROM libros
-- WHERE fecha_publicacion > CURRENT_DATE() - INTERVAL 10 YEAR
-- ORDER BY ventas DESC LIMIT 5;


-- SELECT autor_id, SUM(ventas) FROM libros
-- WHERE autor_id IN(1, 2, 3)
-- GROUP BY autor_id;


-- SELECT titulo FROM libros
-- ORDER BY paginas DESC LIMIT 1;


-- SELECT * FROM libros
-- WHERE titulo LIKE 'La%';


-- SELECT * FROM libros
-- WHERE titulo LIKE 'La%a';


-- UPDATE libros SET stock = 0
-- WHERE fecha_publicacion < '1995-01-01';


-- SELECT IF(stock > 5, 'Disponible', 'No disponible') AS stock FROM libros
-- WHERE libro_id = 1;


-- SELECT titulo FROM libros
-- ORDER BY fecha_publicacion DESC;




-- *************** --
-- **  AUTORES  ** --
-- *************** --

-- SELECT nombre FROM autores
-- WHERE fecha_nacimiento > '1950-12-31';


-- SELECT CONCAT(nombre, ' ', apellido) AS nombre_completo, 
-- TIMESTAMPDIFF(YEAR, fecha_nacimiento, CURRENT_DATE()) AS edad
-- FROM autores;


-- SELECT CONCAT(nombre, ' ', apellido) AS nombre_completo FROM autores
-- WHERE fecha_creacion > '2005-12-31'
-- GROUP BY nombre_completo;


-- SELECT DISTINCT autor_id FROM autores
-- WHERE autor_id IN (
--     SELECT DISTINCT autor_id FROM libros
--     WHERE ventas > (
--         SELECT AVG(ventas) FROM libros
--     )
-- );


-- SELECT a.autor_id FROM autores a, libros l
-- WHERE a.autor_id = l.autor_id
-- AND l.ventas > 5
-- GROUP BY autor_id;


-- DELIMITER //
-- CREATE FUNCTION candidato_prestamo(id INT)
-- RETURNS VARCHAR(15)
-- BEGIN
--     DECLARE salida VARCHAR(15);
--     SELECT IF(stock >= 1, 'Disponible', 'No disponible')
--     INTO salida FROM libros
--     WHERE libro_id = id;
--     RETURN salida;
-- END //