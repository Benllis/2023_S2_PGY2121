package cl.duocuc.tienda.Mascota;
import java.time.LocalDate;

public class Mascota {
    private String nombre;
    private LocalDate fecha_nac;
    private int num_chip;
    private String nombre_due;
    
    public Mascota(String nombre, LocalDate fecha_nac, int num_chip, String nombre_due) {
        this.nombre = nombre;
        this.fecha_nac = fecha_nac;
        this.num_chip = num_chip;
        this.nombre_due = nombre_due;
    }

    public LocalDate getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(LocalDate fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNum_chip() {
        return num_chip;
    }

    public void setNum_chip(int num_chip) {
        this.num_chip = num_chip;
    }

    public Mascota(int num_chip) {
        this.num_chip = num_chip;
    }

    public String getNombre_due() {
        return nombre_due;
    }

    public void setNombre_due(String nombre_due) {
        this.nombre_due = nombre_due;
    }


    public Mascota() {
        this.nombre = "Sin nombre";
        this.fecha_nac = LocalDate.now();
        this.nombre_due = "Sin nombre";
        this.num_chip = 1;
    }
    
     public void setFecha_nac(int dia, int mes, int anio) {
        this.fecha_nac = LocalDate.of(anio, mes, dia);
    }
    
    public String toString(){
        return "Nombre Mascota: " + this.nombre + "\nNumero Chip: " + this.num_chip 
                + "\nFecha Nacimiento: " + this.fecha_nac + "\nNombre Dueño: " + this.nombre_due;
    }

    public void num_chip(int nextInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
