/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package entities;

/**
 *
 * @author rczgr
 */
public class Persona {

//    nombre, apellido, edad, documento y Perro.
    private String nombre;
    private String apellido;
    private int edad;
    private int documento;
    private Perro perro;

    public Persona(String nombre, String apellido, int edad, int documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public int getDocumento() {
        return documento;
    }

    public Perro getPerro() {
        return perro;
    }

    public void adoptarPerro(Perro perro) {
        this.perro = perro;
    }

    public void mostrarInfoPerro() {
        System.out.println("El perro de " + nombre + " es: " + perro);
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", documento=" + documento + ", perro=" + perro + '}';
    }

}
