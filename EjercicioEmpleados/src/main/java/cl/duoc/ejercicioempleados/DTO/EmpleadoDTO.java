package cl.duoc.ejercicioempleados.DTO;

import cl.duoc.ejercicioempleados.Utils.Verificacion;
import java.time.LocalDate;
import java.time.Period;

public class EmpleadoDTO {
    private String nombre;
    private String apellidos;
    private int DNI;
    private String dirección;
    private LocalDate fechaContrato;
    private int fono;
    private int salario;
    private EmpleadoDTO supervisor;
    private String cargo;
    private int annioAntiguo;
    private Period periodo;
    
    public EmpleadoDTO() {
        this.nombre = "Sin nombre";
        this.apellidos = "Sin apelldio";
        this.DNI = 0;
        this.dirección = "Sin direccion";
        this.fechaContrato = LocalDate.now();
        this.fono = 0;
        this.salario = 0;
        this.cargo = "Sin cargo";
    }

    public EmpleadoDTO(String nombre, String apellidos, int DNI, String dirección, LocalDate fechaContrato, int fono, int salario, String cargo, EmpleadoDTO supervisor) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.dirección = dirección;
        this.fechaContrato = fechaContrato;
        this.fono = fono;
        this.salario = salario;
        this.cargo = cargo;
        this.supervisor = supervisor;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public LocalDate getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(int dia, int mes, int annio) {
        this.fechaContrato = LocalDate.of(annio, mes, dia);
        this.periodo = Period.between(this.getFechaContrato(), LocalDate.now());
        this.annioAntiguo = periodo.getYears();
    }

    public int getFono() {
        return fono;
    }

    public void setFono(int fono) {
        this.fono = fono;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public EmpleadoDTO getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(EmpleadoDTO supervisor) {
        this.supervisor = supervisor;
    }
    
    public String Dato(){
        return "Cargo: " + this.cargo +
                    "\nNombre: " + this.nombre + " " + this.apellidos + 
                    "\nRUN: " + this.DNI + "\nDireccion: " + this.dirección
                    + "\nAño Antiguedad: " + this.annioAntiguo + "\nFono: "
                    + this.fono + "\nSalario: " + this.salario;
    }
    
    
    @Override
    public String toString(){
        Verificacion ver = new Verificacion();
        if(ver.supervisorVacio(supervisor)){
            return "Cargo: " + this.cargo +
                    "\nNombre: " + this.nombre + " " + this.apellidos + 
                    "\nRUN: " + this.DNI + "\nDireccion: " + this.dirección
                    + "\nAño Antiguedad: " + this.annioAntiguo + "\nFono: "
                    + this.fono + "\nSalario: " + this.salario + "\nSin Supervisor";
        } 
        else {
            return "Cargo: " + this.cargo +
                    "\nNombre: " + this.nombre + " " + this.apellidos + 
                    "\nRUN: " + this.DNI + "\nDireccion: " + this.dirección
                    + "\nAño Antiguedad: " + this.annioAntiguo + "\nFono: "
                    + this.fono + "\nSalario: " + this.salario +
                    "\n\nSupervisor\n" + this.supervisor;
        }
    }
}
