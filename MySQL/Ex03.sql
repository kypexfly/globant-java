-- 1. Mostrar el nombre de todos los pokemon.
SELECT nombre FROM pokemon;

-- 2. Mostrar los pokemon que pesen menos de 10k.
SELECT * FROM pokemon WHERE peso < 10;

-- 3. Mostrar los pokemon de tipo agua.
SELECT p.nombre
	FROM pokemon_tipo
	JOIN pokemon p ON pokemon_tipo.numero_pokedex = p.numero_pokedex
	JOIN tipo ON pokemon_tipo.id_tipo = tipo.id_tipo
	WHERE tipo.nombre = 'Agua';  

-- 4. Mostrar los pokemon de tipo agua, fuego o tierra ordenados por tipo.
SELECT p.nombre, t.nombre
	FROM pokemon_tipo
	JOIN pokemon p ON pokemon_tipo.numero_pokedex = p.numero_pokedex
	JOIN tipo t ON pokemon_tipo.id_tipo = t.id_tipo
	WHERE t.nombre IN ('Agua', 'Fuego', 'Tierra')
    ORDER BY t.nombre;  

-- 5. Mostrar los pokemon que son de tipo fuego y volador.
SELECT pokemon.nombre
	FROM pokemon_tipo
	JOIN pokemon ON pokemon_tipo.numero_pokedex = pokemon.numero_pokedex
	JOIN tipo ON pokemon_tipo.id_tipo = tipo.id_tipo
	WHERE tipo.nombre = 'Fuego' AND tipo.nombre = 'Volador';

-- 6. Mostrar los pokemon con una estadística base de ps mayor que 200.
SELECT pokemon.nombre
	FROM estadisticas_base
	JOIN pokemon ON estadisticas_base.numero_pokedex = pokemon.numero_pokedex
	WHERE estadisticas_base.ps > 200;

-- 7. Mostrar los datos (nombre, peso, altura) de la prevolución de Arbok.

-- 8. Mostrar aquellos pokemon que evolucionan por intercambio.
SELECT pokemon.nombre
	FROM pokemon
	JOIN pokemon_forma_evolucion ON pokemon.numero_pokedex = pokemon_forma_evolucion.numero_pokedex
	JOIN forma_evolucion ON pokemon_forma_evolucion.id_forma_evolucion = forma_evolucion.id_forma_evolucion
	JOIN tipo_evolucion ON forma_evolucion.tipo_evolucion = tipo_evolucion.id_tipo_evolucion
	WHERE tipo_evolucion.tipo_evolucion = 'Intercambio';

-- 9. Mostrar el nombre del movimiento con más prioridad.
SELECT nombre FROM movimiento ORDER BY prioridad DESC LIMIT 1;

-- 10. Mostrar el pokemon más pesado.
SELECT nombre FROM pokemon ORDER BY peso DESC LIMIT 1;

-- 11. Mostrar el nombre y tipo del ataque con más potencia.
SELECT movimiento.nombre, tipo.nombre
	FROM movimiento
	JOIN tipo ON movimiento.id_tipo = tipo.id_tipo
	ORDER BY movimiento.potencia DESC
	LIMIT 1;

-- 12. Mostrar el número de movimientos de cada tipo.
SELECT tipo.nombre, COUNT(*) AS num_movimientos
	FROM movimiento
	JOIN tipo ON movimiento.id_tipo = tipo.id_tipo
	GROUP BY tipo.nombre;

-- 13. Mostrar todos los movimientos que puedan envenenar.
SELECT movimiento.nombre
	FROM movimiento
	JOIN movimiento_efecto_secundario ON movimiento.id_movimiento = movimiento_efecto_secundario.id_movimiento
	JOIN efecto_secundario ON movimiento_efecto_secundario.id_efecto_secundario = efecto_secundario.id_efecto_secundario
	WHERE efecto_secundario.efecto_secundario = 'Envenenamiento leve';

-- 14. Mostrar todos los movimientos que causan daño, ordenados alfabéticamente por nombre.
SELECT nombre FROM movimiento WHERE potencia IS NOT NULL ORDER BY nombre ASC;

-- 15. Mostrar todos los movimientos que aprende pikachu.
SELECT DISTINCT movimiento.nombre
	FROM pokemon
	JOIN pokemon_movimiento_forma ON pokemon.numero_pokedex = pokemon_movimiento_forma.numero_pokedex
	JOIN movimiento ON pokemon_movimiento_forma.id_movimiento = movimiento.id_movimiento
	JOIN forma_aprendizaje ON pokemon_movimiento_forma.id_forma_aprendizaje = forma_aprendizaje.id_forma_aprendizaje
	WHERE pokemon.nombre = 'Pikachu';

-- 16. Mostrar todos los movimientos que aprende pikachu por MT (tipo de aprendizaje).

-- 17. Mostrar todos los movimientos de tipo normal que aprende pikachu por nivel.
SELECT movimiento.nombre
	FROM pokemon
	JOIN pokemon_movimiento_forma ON pokemon.numero_pokedex = pokemon_movimiento_forma.numero_pokedex
	JOIN movimiento ON pokemon_movimiento_forma.id_movimiento = movimiento.id_movimiento
	JOIN forma_aprendizaje ON pokemon_movimiento_forma.id_forma_aprendizaje = forma_aprendizaje.id_forma_aprendizaje
	JOIN nivel_aprendizaje AS na ON forma_aprendizaje.id_forma_aprendizaje = na.id_forma_aprendizaje
	JOIN tipo ON movimiento.id_tipo = tipo.id_tipo
	JOIN tipo_forma_aprendizaje ON forma_aprendizaje.id_tipo_aprendizaje = tipo_forma_aprendizaje.id_tipo_aprendizaje
	WHERE pokemon.nombre = 'Pikachu' AND tipo_forma_aprendizaje.tipo_aprendizaje = 'Nivel' AND tipo.nombre = 'Normal';

-- 18. Mostrar todos los movimientos de efecto secundario cuya probabilidad sea mayor al 30%.
SELECT movimiento.nombre, efecto_secundario.efecto_secundario, movimiento_efecto_secundario.probabilidad
	FROM movimiento
	JOIN movimiento_efecto_secundario ON movimiento.id_movimiento = movimiento_efecto_secundario.id_movimiento
	JOIN efecto_secundario ON movimiento_efecto_secundario.id_efecto_secundario = efecto_secundario.id_efecto_secundario
	WHERE movimiento_efecto_secundario.probabilidad > 0.3;

-- 19. Mostrar todos los pokemon que evolucionan por piedra.
SELECT pokemon.nombre, tipo_piedra.nombre_piedra
	FROM pokemon
	JOIN forma_evolucion ON pokemon.numero_pokedex = forma_evolucion.id_forma_evolucion
	JOIN tipo_evolucion ON forma_evolucion.tipo_evolucion = tipo_evolucion.id_tipo_evolucion
	JOIN piedra ON forma_evolucion.id_forma_evolucion = piedra.id_forma_evolucion
	JOIN tipo_piedra ON piedra.id_tipo_piedra = tipo_piedra.id_tipo_piedra
	WHERE tipo_evolucion.tipo_evolucion = 'Piedra';

-- 20. Mostrar todos los pokemon que no pueden evolucionar.
SELECT nombre
	FROM pokemon
	WHERE numero_pokedex NOT IN (
		SELECT pokemon_evolucionado
		FROM evoluciona_de
	) AND numero_pokedex NOT IN (
		SELECT id_forma_evolucion
		FROM forma_evolucion
	);

-- 21. Mostrar la cantidad de los pokemon de cada tipo.
SELECT tipo.nombre, COUNT(*) AS cantidad
	FROM pokemon_tipo
	JOIN tipo ON pokemon_tipo.id_tipo = tipo.id_tipo
	GROUP BY tipo.nombre;