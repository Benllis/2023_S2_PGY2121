package cl.duocuc.aerolinea.DTO;

public class AvionDTO {
    private int id_Avion;
    private String tipoAvion;
    private int capacidadPasajeros;
    private int estanqueGas;
    private String modelo;

    public AvionDTO() {
        this.id_Avion = 0;
        this.tipoAvion = "Sin tipo";
        this.capacidadPasajeros = 0;
        this.estanqueGas = 0;
        this.modelo = "Sin modelo";
    }

    public AvionDTO(int id_Avion, String tipoAvion, int capacidadPasajeros, int estanqueGas, String modelo) {
        this.id_Avion = id_Avion;
        this.tipoAvion = tipoAvion;
        this.capacidadPasajeros = capacidadPasajeros;
        this.estanqueGas = estanqueGas;
        this.modelo = modelo;
    }

    public int getId_Avion() {
        return id_Avion;
    }

    public void setId_Avion(int id_Avion) {
        this.id_Avion = id_Avion;
    }

    public String getTipoAvion() {
        return tipoAvion;
    }

    public void setTipoAvion(String tipoAvion) {
        this.tipoAvion = tipoAvion;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public int getEstanqueGas() {
        return estanqueGas;
    }

    public void setEstanqueGas(int estanqueGas) {
        this.estanqueGas = estanqueGas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    @Override
    public String toString(){
        return "ID: " + this.id_Avion + "\nTipo Avion: " + this.tipoAvion +
               "\nModelo: " + this.modelo +
                "\nCapacidad Pasajeros: " + this.capacidadPasajeros
                + "\nCapacidad Estanque: " + this.estanqueGas;
    }
}
