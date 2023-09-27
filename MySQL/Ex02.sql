-- Consultas sobre una tabla
-- 1. Devuelve un listado con el código de oficina y la ciudad donde hay oficinas.
SELECT codigo_oficina, ciudad FROM oficina;

-- 2. Devuelve un listado con la ciudad y el teléfono de las oficinas de España.
SELECT ciudad, telefono FROM oficina WHERE pais = 'España';

-- 3. Devuelve un listado con el nombre, apellidos y email de los empleados cuyo jefe tiene un código de jefe igual a 7.
SELECT nombre, apellido1, apellido2, email FROM empleado WHERE codigo_jefe = 7;

-- 4. Devuelve el nombre del puesto, nombre, apellidos y email del jefe de la empresa.
SELECT puesto, nombre, apellido1, apellido2, email FROM empleado WHERE codigo_jefe IS NULL;

-- 5. Devuelve un listado con el nombre, apellidos y puesto de aquellos empleados que no sean
-- representantes de ventas.
SELECT nombre, apellido1, apellido2, puesto FROM empleado WHERE puesto <> 'Representante Ventas';

-- 6. Devuelve un listado con el nombre de los todos los clientes españoles.
SELECT nombre_cliente FROM cliente WHERE pais = 'Spain';

-- 7. Devuelve un listado con los distintos estados por los que puede pasar un pedido.
SELECT estado FROM pedido GROUP BY estado;
SELECT DISTINCT estado FROM pedido; /* Más eficiente */

-- 8. Devuelve un listado con el código de cliente de aquellos clientes que realizaron algún pago en 2008. Tenga en cuenta que deberá eliminar aquellos códigos de cliente que aparezcan
-- repetidos. Resuelva la consulta:
-- o Utilizando la función YEAR de MySQL.
-- o Utilizando la función DATE_FORMAT de MySQL.
-- o Sin utilizar ninguna de las funciones anteriores.

SELECT DISTINCT codigo_cliente FROM pago WHERE YEAR(fecha_pago) = 2008;
SELECT DISTINCT codigo_cliente FROM pago WHERE DATE_FORMAT(fecha_pago, '%Y') = '2008';
SELECT DISTINCT p.codigo_cliente FROM pago p 
	JOIN pedido pe ON p.codigo_cliente = pe.codigo_cliente
	WHERE pe.fecha_pedido BETWEEN '2008-01-01' AND '2008-12-31';

-- 9. Devuelve un listado con el código de pedido, código de cliente, fecha esperada y fecha de
-- entrega de los pedidos que no han sido entregados a tiempo.
SELECT codigo_pedido, codigo_cliente, fecha_esperada, fecha_entrega
	FROM pedido
	WHERE fecha_entrega > fecha_esperada;

-- 10. Devuelve un listado con el código de pedido, código de cliente, fecha esperada y fecha de
-- entrega de los pedidos cuya fecha de entrega ha sido al menos dos días antes de la fecha
-- esperada.
-- o Utilizando la función ADDDATE de MySQL.
-- o Utilizando la función DATEDIFF de MySQL.
SELECT codigo_pedido, codigo_cliente, fecha_esperada, fecha_entrega FROM pedido WHERE fecha_entrega < ADDDATE(fecha_esperada, -2);
SELECT codigo_pedido, codigo_cliente, fecha_esperada, fecha_entrega FROM pedido WHERE DATEDIFF(fecha_entrega, fecha_esperada) <= 2;

-- 11. Devuelve un listado de todos los pedidos que fueron rechazados en 2009.
SELECT * FROM pedido WHERE estado = 'Rechazado' AND YEAR(fecha_pedido) = 2009;

-- 12. Devuelve un listado de todos los pedidos que han sido entregados en el mes de enero de cualquier año.
SELECT * FROM pedido WHERE estado = 'Entregado' AND MONTH(fecha_pedido) = '1';

-- 13. Devuelve un listado con todos los pagos que se realizaron en el año 2008 mediante Paypal.
-- Ordene el resultado de mayor a menor.
SELECT * FROM pago WHERE YEAR(fecha_pago) AND forma_pago = 'PayPal';

-- 14. Devuelve un listado con todas las formas de pago que aparecen en la tabla pago. Tenga en
-- cuenta que no deben aparecer formas de pago repetidas.
SELECT DISTINCT forma_pago FROM pago;

-- 15. Devuelve un listado con todos los productos que pertenecen a la gama Ornamentales y que
-- tienen más de 100 unidades en stock. El listado deberá estar ordenado por su precio de
-- venta, mostrando en primer lugar los de mayor precio.
SELECT * FROM producto WHERE gama = 'Ornamentales' AND cantidad_en_stock > 100 ORDER BY precio_venta DESC;

-- 16. Devuelve un listado con todos los clientes que sean de la ciudad de Madrid y cuyo
-- representante de ventas tenga el código de empleado 11 o 30.
SELECT * FROM cliente WHERE ciudad = 'Madrid' AND codigo_empleado_rep_ventas IN (11, 30);

-- Consultas multitabla (Composición interna)
-- Las consultas se deben resolver con INNER JOIN.
-- 1. Obtén un listado con el nombre de cada cliente y el nombre y apellido de su representante de ventas.
SELECT c.nombre_cliente, CONCAT(e.nombre, ' ', e.apellido1) AS nombre_representante_ventas FROM cliente c
	INNER JOIN empleado e ON c.codigo_empleado_rep_ventas = e.codigo_empleado;

-- 2. Muestra el nombre de los clientes que hayan realizado pagos junto con el nombre de sus representantes de ventas.
SELECT c.nombre_cliente, CONCAT(e.nombre, ' ', e.apellido1) AS nombre_representante
	FROM cliente c
	INNER JOIN pago p ON c.codigo_cliente = p.codigo_cliente
	INNER JOIN empleado e ON c.codigo_empleado_rep_ventas = e.codigo_empleado;

-- 3. Muestra el nombre de los clientes que no hayan realizado pagos junto con el nombre de sus representantes de ventas.
SELECT c.nombre_cliente, CONCAT(e.nombre, ' ', e.apellido1) AS nombre_representante
FROM cliente c
INNER JOIN empleado e ON c.codigo_empleado_rep_ventas = e.codigo_empleado
WHERE NOT EXISTS (
  SELECT *
  FROM pago p
  WHERE c.codigo_cliente = p.codigo_cliente
);

-- 4. Devuelve el nombre de los clientes que han hecho pagos y el nombre de sus representantes junto con la ciudad de la oficina a la que pertenece el representante.
SELECT c.nombre_cliente, CONCAT(e.nombre, ' ', e.apellido1) AS nombre_representante, o.ciudad
	FROM cliente c
	INNER JOIN pago p ON c.codigo_cliente = p.codigo_cliente
	INNER JOIN empleado e ON c.codigo_empleado_rep_ventas = e.codigo_empleado
	INNER JOIN oficina o ON e.codigo_oficina = o.codigo_oficina;

-- 5. Devuelve el nombre de los clientes que no hayan hecho pagos y el nombre de sus
-- representantes junto con la ciudad de la oficina a la que pertenece el representante.
SELECT c.nombre_cliente, CONCAT(e.nombre, ' ', e.apellido1) AS nombre_representante, o.ciudad
	FROM cliente c
	INNER JOIN empleado e ON c.codigo_empleado_rep_ventas = e.codigo_empleado
	INNER JOIN oficina o ON e.codigo_oficina = o.codigo_oficina
	WHERE NOT EXISTS (
	  SELECT *
	  FROM pago p
	  WHERE c.codigo_cliente = p.codigo_cliente
	);

-- 6. Lista la dirección de las oficinas que tengan clientes en Fuenlabrada.
SELECT DISTINCT o.linea_direccion1, o.linea_direccion2, o.ciudad, o.pais
	FROM cliente c
	JOIN empleado e ON c.codigo_empleado_rep_ventas = e.codigo_empleado
	JOIN oficina o ON e.codigo_oficina = o.codigo_oficina
	WHERE c.ciudad = 'Fuenlabrada';

-- 7. Devuelve el nombre de los clientes y el nombre de sus representantes junto con la ciudad
-- de la oficina a la que pertenece el representante.
SELECT c.nombre_cliente, CONCAT(e.nombre, ' ', e.apellido1) AS nombre_representante, o.ciudad
	FROM cliente c
	INNER JOIN empleado e ON c.codigo_empleado_rep_ventas = e.codigo_empleado
	INNER JOIN oficina o ON e.codigo_oficina = o.codigo_oficina;

-- 8. Devuelve un listado con el nombre de los empleados junto con el nombre de sus jefes.
SELECT e.nombre, e.apellido1, CONCAT(j.nombre, ' ', j.apellido1) AS nombre_jefe
	FROM empleado e
	INNER JOIN empleado j ON e.codigo_jefe = j.codigo_empleado;

-- 9. Devuelve el nombre de los clientes a los que no se les ha entregado a tiempo un pedido.
SELECT DISTINCT c.nombre_cliente
	FROM pedido p
	INNER JOIN cliente c ON p.codigo_cliente = c.codigo_cliente
	INNER JOIN detalle_pedido dp ON p.codigo_pedido = dp.codigo_pedido
	WHERE p.fecha_entrega > p.fecha_esperada;

-- 10. Devuelve un listado de las diferentes gamas de producto que ha comprado cada cliente.
SELECT c.nombre_cliente, GROUP_CONCAT(DISTINCT gp.gama ORDER BY gp.gama SEPARATOR ', ') AS gamas_compradas
	FROM cliente c
	INNER JOIN pedido p ON c.codigo_cliente = p.codigo_cliente
	INNER JOIN detalle_pedido dp ON p.codigo_pedido = dp.codigo_pedido
	INNER JOIN producto pr ON dp.codigo_producto = pr.codigo_producto
	INNER JOIN gama_producto gp ON pr.gama = gp.gama
	GROUP BY c.codigo_cliente;