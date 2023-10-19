package cl.duocuc.aerolinea.DTO;

public class PasajeDTO {
    private String nombreCompleto;
    private int id;
    private int numAsiento;

    public PasajeDTO(String nombreCompleto, int id, int numAsiento) {
        this.nombreCompleto = nombreCompleto;
        this.id = id;
        this.numAsiento = numAsiento;
    }

    public PasajeDTO() {
        this.nombreCompleto = "";
        this.id = 0;
        this.numAsiento = 0;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumAsiento() {
        return numAsiento;
    }

    public void setNumAsiento(int numAsiento) {
        this.numAsiento = numAsiento;
    }
    
    @Override
    public String toString(){
        return  "ID: " + this.id +
                "\nNombre: " + this.nombreCompleto + 
                "\nNumero Asiento: " + this.numAsiento;
    }
}
