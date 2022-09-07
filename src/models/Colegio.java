package models;

public class Colegio {
    private String id;
    private String municipio;
    private int fundacion;
    private int titulos;
    private Banda miBanda;

    public Colegio(String id, String municipio, int fundacion, int titulos) {
        this.id = id;
        this.municipio = municipio;
        this.fundacion = fundacion;
        this.titulos = titulos;
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

    public int getTitulos() {
        return titulos;
    }

    public void setTitulos(int titulos) {
        this.titulos = titulos;
    }
}
