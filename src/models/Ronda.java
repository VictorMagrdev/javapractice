package models;

import java.util.LinkedList;

public class Ronda {
    private String id;
    private String dia;
    private int hora;
    private String direccion;
    private Concurso miConcurso;
    private LinkedList<Presentacion> miPresentacion;

    public Ronda(String id, String dia, int hora, String direccion) {
        this.miPresentacion = miPresentacion;
        this.setId(id);
        this.setDia(dia);
        this.setHora(hora);
        this.setDireccion(direccion);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
