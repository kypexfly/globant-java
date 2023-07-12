/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafioGrupal1_ej1;

import java.util.ArrayList;
import java.util.Scanner;
import desafioGrupal1_ej1.Cliente;

/**
 *
 * @author rczgr
 */
public class ClienteService {

    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    {
        clientes.add(new Cliente(1, "Ricardo", 50, 1.80, 65, "Aumentar de peso"));
    }

    private static Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public void registrarCliente() {
        Cliente cliente = new Cliente();

        System.out.println("Ingrese el ID: ");
        cliente.setId(sc.nextInt());
        System.out.println("Ingrese su nombre: ");
        cliente.setNombre(sc.next());
        System.out.println("Ingrese su edad: ");
        cliente.setEdad(sc.nextInt());
        System.out.println("Ingrese su altura (metros): ");
        cliente.setAltura(sc.nextDouble());
        System.out.println("Ingrese su peso (Kg): ");
        cliente.setPeso(sc.nextDouble());
        System.out.println("Ingrese su objetivo: ");
        cliente.setObjetivo(sc.next());

        // Registrar cliente en el ArrayList
        clientes.add(cliente);
    }

    public void obtenerClientes() {
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

    public void actualizarCliente(int id, String nombre, int edad, double altura, double peso, String objetivo) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                cliente.setNombre(nombre);
                cliente.setEdad(edad);
                cliente.setAltura(altura);
                cliente.setPeso(peso);
                cliente.setObjetivo(objetivo);
                break;
            }
        }
        System.out.println("Cliente con el id " + id + " no encontrado.");
    }

    public void eliminarCliente(int id) {
        for (int i = 0; i < clientes.size(); i++) {
            Cliente cliente = clientes.get(i);
            if (cliente.getId() == id) {
                clientes.remove(i);
                break;
            }
        }
        System.out.println("No se puede eliminar. Cliente con el id " + id + " no encontrado.");
    }

}
