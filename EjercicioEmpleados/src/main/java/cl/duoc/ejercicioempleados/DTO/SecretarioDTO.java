package cl.duoc.ejercicioempleados.DTO;

import static java.lang.Math.round;

public class SecretarioDTO extends EmpleadoDTO{
    private String despacho;
    private int fax;

    public SecretarioDTO() {
        this.despacho = "Sin despacho";
        this.fax = 0;
    }

    public SecretarioDTO(String despacho, int fax) {
        this.despacho = despacho;
        this.fax = fax;
    }

    public SecretarioDTO(String nombre, String apellidos, int DNI, String dirección, int anioAntiguo, int fono, int salario, int dniSupervisor) {
        super(nombre, apellidos, DNI, dirección, anioAntiguo, fono, salario, dniSupervisor, "Secretario");
    }

    public SecretarioDTO(String despacho, int fax, String nombre, String apellidos, int DNI, String dirección, int anioAntiguo, int fono, int salario, int dniSupervisor) {
        super(nombre, apellidos, DNI, dirección, anioAntiguo, fono, salario, dniSupervisor, "Secretario");
        this.despacho = despacho;
        this.fax = fax;
    }
    
    public void setSalarioSecretario(){
        int salarioSecre = this.getSalario();
        salarioSecre = (int) Math.round(salarioSecre * 1.05);
        this.setSalario(salarioSecre);
    }

    public void setCargoSecretario(){
        this.setCargo("Secretario");
    }
    
    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public int getFax() {
        return fax;
    }

    public void setFax(int fax) {
        this.fax = fax;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nFAX: " + this.fax
                + "\nDespacho: " + this.despacho;
    }
}