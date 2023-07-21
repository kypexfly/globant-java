/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej04;

/**
 *
 * @author rczgr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PeliculaService ps = new PeliculaService();

        ps.mostrarPeliculas();
        ps.mostrarPeliculasMasDeUnaHora();
        ps.ordenarPeliculasPorDuracionMayorAMenor();
        ps.ordenarPeliculasPorDuracionMenorAMayor();
        ps.ordenarPeliculasPorTitulo();
        ps.ordenarPeliculasPorDirector();
        ps.mostrarPeliculas();

    }

}
