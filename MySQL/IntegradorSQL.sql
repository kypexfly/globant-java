USE nba;

-- CANDADO A
-- Posición: El candado A está ubicado en la posición calculada a partir del número obtenido en la/s siguiente/s consulta/s:
-- Teniendo el máximo de asistencias por partido, muestre cuantas veces se logró dicho máximo.
-- Este resultado nos dará la posición del candado (1, 2, 3 o 4)

SELECT count(*) FROM estadisticas 
	WHERE Asistencias_por_partido = (SELECT MAX(Asistencias_por_partido) FROM estadisticas);
    
-- Clave: La clave del candado A estará con formada por la/s siguientes consulta/s a la base de datos:
-- Muestre la suma total del peso de los jugadores, donde la conferencia sea Este y la posición sea centro o esté comprendida en otras posiciones.

SELECT sum(Peso) FROM jugadores j JOIN equipos e ON  j.Nombre_equipo = e.Nombre WHERE e.Conferencia = 'East' and j.Posicion LIKE '%C%';

-- CANDADO B
-- Posición: El candado B está ubicado en la posición calculada a partir del número obtenido en la/s siguiente/s consulta/s:
-- Muestre la cantidad de jugadores que poseen más asistencias por partidos, que el numero de jugadores que tiene el equipo Heat.
-- Este resultado nos dará la posición del candado (1, 2, 3 o 4)

SELECT count(j.Nombre) FROM jugadores j
	JOIN estadisticas e ON e.jugador = j.codigo 
    WHERE e.Asistencias_por_partido >= ALL (SELECT count(*) FROM jugadores j WHERE j.Nombre_equipo = 'Heat' GROUP BY j.Nombre_equipo);

-- Clave: La clave del candado B estará con formada por la/s siguientes consulta/s a la base de datos:
-- La clave será igual al conteo de partidos jugados durante las temporadas del año 1999.

SELECT count(temporada) FROM partidos WHERE temporada LIKE '%99%';

-- CANDADO C
-- Posición: El candado C está ubicado en la posición calculada a partir del número obtenido en la/s siguiente/s consulta/s:
-- La posición del código será igual a la cantidad de jugadores que proceden de Michigan y forman parte de equipos de la conferencia oeste.
-- Al resultado obtenido lo dividiremos por la cantidad de jugadores cuyo peso es mayor o igual a 195, y a eso le vamos a sumar 0.9945.
-- Este resultado nos dará la posición del candado (1, 2, 3 o 4)

SELECT (SELECT count(j.Nombre) AS cantidad_jugadores 
	FROM jugadores j JOIN equipos e ON j.Nombre_equipo = e.Nombre 
    WHERE j.Procedencia = 'Michigan' AND e.Conferencia = 'West') /
    (SELECT count(Nombre) FROM jugadores WHERE Peso >= 195) + 0.9945 AS resultado;

-- Clave: La clave del candado B estará con formada por la/s siguientes consulta/s a la base de datos:
-- Para obtener el siguiente código deberás redondear hacia abajo el resultado que se devuelve de sumar: el promedio de puntos por partido, 
-- el conteo de asistencias por partido, y la suma de tapones por partido. Además, este resultado debe ser, donde la división sea central. 

SELECT floor(avg(e.Puntos_por_partido) + count(e.asistencias_por_partido) + sum(e.tapones_por_partido)) AS resultado
	FROM estadisticas e 
    JOIN jugadores j ON e.jugador=j.codigo 
    JOIN equipos eq ON j.Nombre_equipo=eq.Nombre 
    WHERE eq.Division='Central';

-- CANDADO D
-- Posición: El candado D está ubicado en la posición calculada a partir del número obtenido en la/s siguiente/s consulta/s:
-- Muestre los tapones por partido del jugador Corey Maggette durante la temporada 00/01. Este resultado debe ser redondeado. Nota: el resultado debe estar redondeado
-- Este resultado nos dará la posición del candado (1, 2, 3 o 4)

SELECT round(e.Tapones_por_partido) FROM estadisticas e JOIN jugadores j ON e.jugador = j.codigo WHERE j.Nombre = 'Corey Maggette' AND e.temporada = '00/01';

-- Clave: La clave del candado D estará con formada por la/s siguientes consulta/s a la base de datos:
-- Para obtener el siguiente código deberás redondear hacia abajo, la suma de puntos por partido de todos los jugadores de procedencia argentina.

SELECT floor(sum(Puntos_por_partido)) FROM estadisticas e JOIN jugadores j ON e.jugador = j.codigo WHERE j.Procedencia = 'Argentina';