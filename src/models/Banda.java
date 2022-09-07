package models;

public class Banda {
    private String id;
    private String municipio;
    private int fundacion;
    private int titulo;

    private Colegio miColegio;
    private Concurso miConcurso;

    public Banda(String id, String municipio, int fundacion, int titulos, Colegio micolegio) {
        this.id = id;
        this.municipio = municipio;
        this.fundacion = fundacion;
        this.titulo = titulos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public int getFundacion() {
        return fundacion;
    }

    public void setFundacion(int fundacion) {
        this.fundacion = fundacion;
    }

    public int getTitulo() {
        return titulo;
    }

    public void setTitulo(int titulo) {
        this.titulo = titulo;
    }
}
