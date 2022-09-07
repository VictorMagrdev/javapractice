package models;

public class Presentacion {
    private String id;
    private int puntaje;
    private Ronda miRonda;
    private Banda miBanda;

    public Presentacion(String id, int puntaje) {
        this.id = id;
        this.puntaje = puntaje;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
}
