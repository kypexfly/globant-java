/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex03;

import ex03.entities.Alojamiento;
import ex03.entities.Camping;
import ex03.entities.Gimnasio;
import ex03.entities.Hotel4;
import ex03.entities.Hotel5;
import ex03.entities.Residencia;
import ex03.entities.TipoGimnasio;
import ex03.services.AlojamientoService;
import java.util.ArrayList;

/**
 *
 * @author rczgr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Alojamiento> alojamientos = new ArrayList<>();

        alojamientos.add(new Hotel4(
                new Gimnasio(TipoGimnasio.A),
                "Restarante 1",
                5,
                10,
                3,
                0,
                "Hotel El 4 estrellas",
                "Calle 137",
                "Nacional",
                "Andrew Nathe")
        );

        alojamientos.add(new Hotel5(
                2,
                2,
                5,
                new Gimnasio(TipoGimnasio.B),
                "Restaurante 2",
                4,
                2,
                3,
                10,
                "Hotel El 5 estrellas",
                "Calle 230",
                "Internacional",
                "Margaret Nadin")
        );

        alojamientos.add(new Camping(
                10,
                3, true,
                220,
                "Camping 1",
                "Calle 703",
                "Rocat",
                "Emily Tammer")
        );

        alojamientos.add(new Camping(
                5,
                1,
                false,
                500,
                "Camping 2",
                "Calle 900",
                "Mante",
                "David Cedeño")
        );

        alojamientos.add(new Residencia(
                3,
                true,
                true,
                100,
                "Residencia 1",
                "Calle 1000",
                "Queto",
                "Humberto Sénchez")
        );

        alojamientos.add(new Residencia(
                1,
                false,
                false,
                200,
                "Residencia 2",
                "Calle 1200",
                "Campita",
                "Adam Trevor")
        );

        AlojamientoService as = new AlojamientoService(alojamientos);

        as.consultarAlojamientos();

    }

}
