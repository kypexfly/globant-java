package ex04;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import ex04.NIF;
import java.util.Scanner;

/**
 *
 * @author rczgr
 */
public class NIFService {

    private static final Scanner sc = new Scanner(System.in);

    private static final char[] charTable = new char[]{
        'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F',
        'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S',
        'Q', 'V', 'H', 'L', 'C', 'K', 'E'
    };

    public NIF createNIF() {

        NIF nif = new NIF();

        System.out.println("Ingrese su DNI: ");
        nif.setDNI(sc.nextLong());

        nif.setLetra(
                calcularLetra(nif.getDNI())
        );

        return nif;
    }

    public void mostrar(NIF nif) {
        System.out.println(
                String.format("%d-%c", nif.getDNI(), nif.getLetra())
        );
    }

    private char calcularLetra(long DNI) {
        int resto = (int) (DNI % 23);
        return charTable[resto];
    }
}
