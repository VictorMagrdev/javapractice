package models;

public class Integrante {
    private String cedula;
    private String nombre;
    private int experiencia;
    private Instrumento miInstrumento;

    public Integrante(String cedula, String nombre, int experiencia) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.experiencia = experiencia;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
}
