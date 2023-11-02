package cl.duoc.ejercicioempleados.DTO;

public class VehiculoDTO {
    private String matricula; 
    private String marca;
    private String modelo; 

    public VehiculoDTO() {
        this.matricula = "Sin matricula";
        this.marca = "Sin marca";
        this.modelo = "Sin modelo";

    }

    public VehiculoDTO(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
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
        return "\nVehiculo\nMarca: " + this.marca + "\nModelo: " + this.modelo
                + "\nMatricula: " + this.matricula;
    }
}
