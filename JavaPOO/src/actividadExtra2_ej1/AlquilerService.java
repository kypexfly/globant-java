/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadExtra2_ej1;

import static actividadExtra2_ej1.PeliculaService.sc;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rczgr
 */
public class AlquilerService {

    static Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Alquiler> alquileres = new ArrayList<Alquiler>();

    // https://stackoverflow.com/a/39689894
    static DateTimeFormatter formatters = DateTimeFormatter.ofPattern("d/MM/uuuu");
    static final double INTERES = 0.1;

    public void crearAlquiler() {
        Alquiler alquiler = new Alquiler();

        System.out.println("Ingrese el título de la película: ");
        alquiler.setTituloPelicula(sc.next());
        System.out.println("Ingrese la fecha de inicio del alquiler (d/MM/uuuu): ");
        alquiler.setFechaInicio(LocalDate.parse(sc.next(), formatters));
        System.out.println("Ingrese la fecha de fin del alquiler (d/MM/uuuu): ");
        alquiler.setFechaFin(LocalDate.parse(sc.next(), formatters));

        // TODO: calcular precio con el método calcularPrecioAlquiler()
        double precioAlquiler = calcularPrecioAlquiler(alquiler);
        alquiler.setPrecio(precioAlquiler);

        alquileres.add(alquiler);
    }

    public void listarAlquileres() {
        for (Alquiler a : alquileres) {
            System.out.println(a);
        }
    }

    public void buscarPorFecha() {
        System.out.println("Ingrese la fecha de inicio del alquiler (d/MM/uuuu): ");
        LocalDate fechaIngresada = LocalDate.parse(sc.next(), formatters);
        boolean encontrado = false;
        for (Alquiler a : alquileres) {
            // compareTo devuelve:
            // 0 si son iguales
            // > 0 si el objeto1 es mayor que el segundo
            // < 0 si el objeto1 es menor que el segundo
            if (a.getFechaInicio().compareTo(fechaIngresada) == 0) {
                encontrado = true;
                // * Pueden haber varios alquileres con la misma fecha de incio
                System.out.println("Sí existe: ");
                System.out.println(a);
            }

            if (!encontrado) {
                System.out.println("No existe :(");
            }

        }
    }

    public void mostrarIngresoTotalAlquileres() {
        double precioTotal = 0;

        for (Alquiler a : alquileres) {
            precioTotal += a.getPrecio();
        }

        System.out.println("El precio total de los alquieres es: " + precioTotal);
    }

    // Método privado dado que es para uso interno de la clase
    private double calcularPrecioAlquiler(Alquiler a) {
        int diasAlquilados = calcularDiasAlquilados(
                a.getFechaInicio(),
                a.getFechaFin()
        );

        if (diasAlquilados <= 3) {
            return 10;
        } else {
            // Interés compuesto a partir de diasAlquilados > 3
            // Fórmula interés compuesto: 
            // https://ikiwi.net.ar/interes-compuesto/
            return 10 * Math.pow(1 + INTERES, diasAlquilados);
        }

    }

    // Método privado dado que es para uso interno de la clase
    private int calcularDiasAlquilados(LocalDate fechaInicio, LocalDate fechaFin) {
        return Period.between(fechaInicio, fechaFin).getDays();
    }
}
