package cl.duocuc.aerolinea.DTO;

import java.time.LocalDate;

public class PasajeroDTO {
    private String nombre;
    private String apellido;
    private int edad;
    private LocalDate fechaNac;

    public PasajeroDTO() {
        this.nombre = "Sin nombre";
        this.apellido = "Sin apellido";
        this.edad = 0;
        this.fechaNac = LocalDate.now();
    }

    public PasajeroDTO(String nombre, String apellido, int edad, LocalDate fechaNac) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.fechaNac = fechaNac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(int dia, int mes, int anio) {
        this.fechaNac = LocalDate.of(anio, mes, dia);
        this.edad = 2023 - anio;
    }
    
    @Override
    public String toString(){
        return "Nombre: " + this.nombre + " " + this.apellido 
                + "\nFecha de nacimiento: " + this.fechaNac
                + "\nEdad: " + this.edad;
    }
}