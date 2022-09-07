package models;

import java.util.LinkedList;

public class Concurso {
    private String id;
    private String lema;
    private double presupuesto;
    private LinkedList<Banda> miBanda;
    private LinkedList<Ronda> miRonda;

    public Concurso(String id, String lema, double presupuesto) {
        this.id = id;
        this.lema = lema;
        this.presupuesto = presupuesto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLema() {
        return lema;
    }

    public void setLema(String lema) {
        this.lema = lema;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }
}
