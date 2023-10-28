package cl.duoc.ejercicioempleados.DTO;

public class VehiculoDTO {
    private boolean coche;
    private String matricula; 
    private String marca;
    private String modelo; 

    public VehiculoDTO() {
        this.coche = false;
        this.matricula = "Sin matricula";
        this.marca = "Sin marca";
        this.modelo = "Sin modelo";

    }

    public VehiculoDTO(boolean coche, String matricula, String marca, String modelo) {
        this.coche = coche;
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    public boolean isCoche() {
        return coche;
    }

    public void setCoche(boolean coche) {
        this.coche = coche;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String DatoVehiculo(){
        return "\nMarca: " + this.marca + "\nModelo: " + this.modelo
                + "\nMatricula: " + this.matricula;
    }
}
