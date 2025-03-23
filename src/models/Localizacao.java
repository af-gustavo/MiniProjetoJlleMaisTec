package models;

public class Localizacao extends AreaVerde {

    private int locId;
    private Double latitude;
    private Double longitude;
    private int identificador;

    public Localizacao() {
    }

    @Override
    public String toString() {
        return String.format("ID: %d%nCoordenadas: %s%n",
                this.locId, this.getCoordenadas());
    }

    public void setLocId(int novoLocId) {
        this.locId = novoLocId;
    }

    public int getLocId() {
        return this.locId;
    }

    public void setCoordenadas(Double novaLatitude, Double novaLongitude) {
        this.latitude = novaLatitude;
        this.longitude = novaLongitude;
    }

    public String getCoordenadas() {
        return latitude.toString() + " (latitude) e " + longitude.toString() + " (longitude).";
    }

    public void setIdentificador(int novoIdentificador) {
        this.identificador = novoIdentificador;
    }

    public int getIdentificador() {
        return this.identificador;
    }

}
