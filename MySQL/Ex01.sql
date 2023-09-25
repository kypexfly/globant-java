-- 1. Mostrar el nombre de todos los jugadores ordenados alfabéticamente.
SELECT Nombre FROM jugadores ORDER BY nombre ASC;

-- 2. Mostrar el nombre de los jugadores que sean pivots (‘C’) y que pesen más de 200 libras, ordenados por nombre alfabéticamente.
SELECT Nombre FROM jugadores WHERE Posicion = 'C' AND Peso > 200 ORDER BY nombre ASC;

-- 3. Mostrar el nombre de todos los equipos ordenados alfabéticamente.
SELECT Nombre FROM equipos ORDER BY Nombre ASC;

-- 4. Mostrar el nombre de los equipos del este (East).
SELECT Nombre FROM equipos WHERE Conferencia = 'East';

-- 5. Mostrar los equipos donde su ciudad empieza con la letra ‘c’, ordenados por nombre.
SELECT * FROM equipos WHERE Ciudad LIKE 'C%' ORDER BY Nombre ASC;

-- 6. Mostrar todos los jugadores y su equipo ordenados por nombre del equipo.
SELECT j.Nombre, e.Nombre FROM jugadores j LEFT JOIN equipos e ON j.Nombre_equipo = e.Nombre ORDER BY e.Nombre ASC;

-- 7. Mostrar todos los jugadores del equipo “Raptors” ordenados por nombre.
SELECT Nombre FROM jugadores WHERE Nombre_equipo = 'Raptors'  ORDER BY Nombre ASC;

-- 8. Mostrar los puntos por partido del jugador ‘Pau Gasol’.
SELECT e.Puntos_por_partido FROM estadisticas e JOIN jugadores j ON e.jugador = j.codigo WHERE j.Nombre = 'Pau Gasol';

-- 9. Mostrar los puntos por partido del jugador ‘Pau Gasol’ en la temporada ’04/05′.
SELECT e.Puntos_por_partido FROM estadisticas e JOIN jugadores j ON e.jugador = j.codigo WHERE j.Nombre = 'Pau Gasol' AND e.temporada = '04/05';

-- 10. Mostrar el número de puntos de cada jugador en toda su carrera.
SELECT j.Nombre, ROUND(SUM(e.Puntos_por_partido)) AS Puntos_Carrera FROM estadisticas e JOIN jugadores j ON e.jugador = j.codigo GROUP BY j.Nombre;

-- 11. Mostrar el número de jugadores de cada equipo.
SELECT Nombre_equipo, COUNT(*) AS Numero_Jugadores FROM jugadores GROUP BY Nombre_equipo;

-- 12. Mostrar el jugador que más puntos ha realizado en toda su carrera.
SELECT j.Nombre, SUM(e.Puntos_por_partido) AS Puntos_Carrera 
	FROM jugadores j 
    JOIN estadisticas e ON j.codigo = e.jugador 
    GROUP BY j.Nombre 
    ORDER BY Puntos_Carrera DESC
    LIMIT 1;

-- 13. Mostrar el nombre del equipo, conferencia y división del jugador más alto de la NBA.
SELECT e.Nombre, e.Conferencia, e.Division 
	FROM jugadores j 
	JOIN equipos e 
	ON j.Nombre_equipo = e.Nombre 
	WHERE j.Altura = (SELECT MAX(Altura) FROM jugadores);

-- 14. Mostrar el partido o partidos (equipo_local, equipo_visitante y diferencia) con mayor diferencia de puntos.
SELECT equipo_local, equipo_visitante, ABS(puntos_local - puntos_visitante) AS Diferencia 
	FROM partidos 
	ORDER BY Diferencia DESC 
	LIMIT 1;

-- 15. Mostrar quien gana en cada partido (codigo, equipo_local, equipo_visitante, equipo_ganador), en caso de empate sera null.
SELECT codigo, equipo_local, equipo_visitante, 
  CASE 
    WHEN puntos_local > puntos_visitante THEN equipo_local 
    WHEN puntos_local < puntos_visitante THEN equipo_visitante 
    ELSE NULL 
  END AS equipo_ganador 
FROM partidos;