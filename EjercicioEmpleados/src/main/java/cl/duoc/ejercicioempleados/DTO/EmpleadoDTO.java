package cl.duoc.ejercicioempleados.DTO;

public class EmpleadoDTO {
    private String nombre;
    private String apellidos;
    private int DNI;
    private String dirección;
    private int anioAntiguo;
    private int fono;
    private int salario;
    private int dniSupervisor;
    private String cargo;
    
    public EmpleadoDTO() {
        this.nombre = "Sin nombre";
        this.apellidos = "Sin apelldio";
        this.DNI = 0;
        this.dirección = "Sin direccion";
        this.anioAntiguo = 0;
        this.fono = 0;
        this.salario = 0;
        this.dniSupervisor = 0;
        this.cargo = "Sin cargo";
    }

    public EmpleadoDTO(String nombre, String apellidos, int DNI, String dirección, int anioAntiguo, int fono, int salario, int dniSupervisor, String cargo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.dirección = dirección;
        this.anioAntiguo = anioAntiguo;
        this.fono = fono;
        this.salario = salario;
        this.dniSupervisor = dniSupervisor;
        this.cargo = cargo;
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

    public int getAnioAntiguo() {
        return anioAntiguo;
    }

    public void setAnioAntiguo(int anioAntiguo) {
        this.anioAntiguo = anioAntiguo;
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

    public int getDniSupervisor() {
        return dniSupervisor;
    }

    public void setDniSupervisor(int dniSupervisor) {
        this.dniSupervisor = dniSupervisor;
    }
    
    public String toString(){
        return "Nombre: " + this.nombre + " " + this.apellidos + 
                "\nRUN: " + this.DNI + "\nDireccion: " + this.dirección
                + "\nAño Antiguedad: " + this.anioAntiguo + "\nFono: "
                + this.fono + "\nSalario: " + this.salario + 
                "\nCargo: " + this.cargo +
                "\nRUT Supervisor: " + this.dniSupervisor;
    }
   
}
