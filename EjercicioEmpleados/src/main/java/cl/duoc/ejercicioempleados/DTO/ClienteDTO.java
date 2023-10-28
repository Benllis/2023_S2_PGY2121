package cl.duoc.ejercicioempleados.DTO;

public class ClienteDTO {

    private int idCli;
    private int edad;
    
    public ClienteDTO() {
        this.idCli = 0;
        this.edad = 0;
    }
    
    public ClienteDTO(int cliente, int edad) {
        this.idCli = cliente;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getIdCli() {
        return idCli;
    }

    public void setIdCli(int idCli) {
        this.idCli = idCli;
    }
}
