import entity.Edificio;
import entity.EdificioDeOficinas;
import entity.Polideportivo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Edificio> edificios = new ArrayList<>();
        edificios.add(new Polideportivo(10, 20, 30, "Polideportivo A", "Techado"));
        edificios.add(new Polideportivo(15, 25, 35, "Polideportivo B", "Abierto"));
        edificios.add(new EdificioDeOficinas(20, 30, 40, 10, 5, 5));
        edificios.add(new EdificioDeOficinas(25, 35, 45, 15, 6, 6));

        int cantTechados = 0;
        int cantAbiertos = 0;

        for (Edificio edificio : edificios) {
            System.out.println("*EDIFICIO*");
            System.out.println("Superficie: " + edificio.calcularSuperficie());
            System.out.println("Volumen: " + edificio.calcularVolumen());

            if (edificio instanceof Polideportivo) {
                Polideportivo poli = (Polideportivo) edificio;
                if (poli.getTipoDeInstalacion().equals("Techado")) {
                    cantTechados++;
                } else {
                    cantAbiertos++;
                }
            }

            if (edificio instanceof EdificioDeOficinas) {
                EdificioDeOficinas edif = (EdificioDeOficinas) edificio;
                System.out.println("Cantidad de personas en un piso: " + edif.getcantidadDePersonasPorOficina() * edif.getNumeroDeOficinas());
                System.out.println("Cantidad de personas en todo el edificio: " + edif.cantPersonas());
            }
        }

        System.out.println("Cantidad de polideportivos techados: " + cantTechados);
        System.out.println("Cantidad de polideportivos abiertos: " + cantAbiertos);
    }
}