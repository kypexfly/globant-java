package entity;

public class EdificioDeOficinas extends Edificio {

    private int numeroDeOficinas;
    private int cantidadDePersonasPorOficina;
    private int numeroDePisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(double ancho, double alto, double largo, int numeroDeOficinas, int cantidadDePersonasPorOficina, int numeroDePisos) {
        super(ancho, alto, largo);
        this.numeroDeOficinas = numeroDeOficinas;
        this.cantidadDePersonasPorOficina = cantidadDePersonasPorOficina;
        this.numeroDePisos = numeroDePisos;
    }

    public double calcularSuperficie() {
        return ancho * largo;
    }

    public double calcularVolumen() {
        return ancho * largo * alto;
    }

    public int cantPersonas() {
        return numeroDeOficinas * cantidadDePersonasPorOficina * numeroDePisos;
    }

    public int getNumeroDeOficinas() {
        return numeroDeOficinas;
    }

    public void setNumeroDeOficinas(int numeroDeOficinas) {
        this.numeroDeOficinas = numeroDeOficinas;
    }

    public int getcantidadDePersonasPorOficina() {
        return cantidadDePersonasPorOficina;
    }

    public void setcantidadDePersonasPorOficina(int cantidadDePersonasPorOficina) {
        this.cantidadDePersonasPorOficina = cantidadDePersonasPorOficina;
    }

    public int getNumeroDePisos() {
        return numeroDePisos;
    }

    public void setNumeroDePisos(int numeroDePisos) {
        this.numeroDePisos = numeroDePisos;
    }
}
