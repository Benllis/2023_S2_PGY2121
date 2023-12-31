package cl.duoc.ejercicioempleados.DTO;

import java.time.LocalDate;

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

    public SecretarioDTO(String nombre, String apellidos, int DNI, String dirección, int dia, int mes, int annio, int fono, int salario, EmpleadoDTO supervisor) {
        super(nombre, apellidos, DNI, dirección, LocalDate.of(dia, mes, annio), fono, salario, "Secretario", supervisor);
    }

    public SecretarioDTO(String despacho, int fax, String nombre, String apellidos, int DNI, String dirección, int dia, int mes, int annio, int fono, int salario, EmpleadoDTO supervisor) {
        super(nombre, apellidos, DNI, dirección, LocalDate.of(dia, mes, annio), fono, salario, "Secretario", supervisor);
        this.despacho = despacho;
        this.fax = fax;
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
    public String Dato(){
        return super.Dato() + "\n\nDatos Extras\nFAX: " + this.fax
                + "\nDespacho: " + this.despacho;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\n\nDatos Extras\nFAX: " + this.fax
                + "\nDespacho: " + this.despacho;
    }
}
