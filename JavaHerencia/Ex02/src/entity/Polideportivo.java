package entity;

public class Polideportivo extends Edificio {

    private String nombre;
    private String tipoDeInstalacion; // Techado o Abierto

    public Polideportivo() {
    }

    public Polideportivo(double ancho, double alto, double largo, String nombre, String tipoDeInstalacion) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoDeInstalacion = tipoDeInstalacion;
    }

    public double calcularSuperficie() {
        return ancho * largo;
    }

    public double calcularVolumen() {
        return ancho * largo * alto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDeInstalacion() {
        return tipoDeInstalacion;
    }

    public void setTipoDeInstalacion(String tipoDeInstalacion) {
        this.tipoDeInstalacion = tipoDeInstalacion;
    }
}
