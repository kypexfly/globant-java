/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadExtra2_ej1;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

/**
 *
 * @author rczgr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO: corregir al comparar los títulos, por ejemplo:
        // titulo: "El conjuro", al buscar "el conjuro" o "El conjuro"
        // sale que no existe.
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        PeliculaService ps = new PeliculaService();
        AlquilerService as = new AlquilerService();

        int opcion = 0;
        boolean salir = false;

        while (!salir) {
            System.out.println(
                    "***** MENÚ PRINCIPAL ***** \n"
                    + "1. Crear película \n"
                    + "2. Listar películas \n"
                    + "3. Crear alquiler \n"
                    + "4. Listar alquiler \n"
                    + "5. Buscar película por título \n"
                    + "6. Buscar película por género \n"
                    + "7. Buscar alquiler por fecha \n"
                    + "8. Mostrar ingreso total del servicio \n"
                    + "9. Salir"
            );

            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("- Opción 1: Crear película");
                    ps.crearPelicula();
                    break;
                case 2:
                    System.out.println("- Opción 2: Listar películas");
                    ps.listarPeliculas();
                    break;
                case 3:
                    System.out.println("- Opción 3: Crear alquiler");
                    as.crearAlquiler();
                    break;
                case 4:
                    System.out.println("- Opción 4: Listar alquiler");
                    as.listarAlquileres();
                    break;
                case 5:
                    System.out.println("- Opción 5: Buscar película por título");
                    ps.buscarPorTitulo();
                    break;
                case 6:
                    System.out.println("- Opción 6: Buscar película por género");
                    ps.buscarPorGenero();
                    break;
                case 7:
                    System.out.println("- Opción 7: Buscar alquiler por fecha");
                    as.buscarPorFecha();
                    break;
                case 8:
                    System.out.println("- Opción 8: Mostrar ingreso total del servicio");
                    as.mostrarIngresoTotalAlquileres();
                    break;
                case 9:
                    System.out.println("- Opción 9: Salir");
                    System.out.println("Saliendo...");
                    salir = true;
                    break;
                default:
                    System.out.println("- Opción inválida. Por favor, seleccione una opción válida.");
            }
        }
    }
}
