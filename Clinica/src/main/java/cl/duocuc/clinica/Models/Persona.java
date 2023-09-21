package cl.duocuc.clinica.Models;

public class Persona {
    private String nombre;
    private String appaterno;
    private String apmaterno;
    private int run;
    private byte trabajador;
    
    public String ToString(){
        return "Nombre: " + this.nombre + this.appaterno + this.apmaterno
                + "\nRUT: " + this.run;
    }
    
    public Persona(){
        this.nombre = "Sin nombre";
        this.appaterno = " - ";
        this.apmaterno = " - ";
        this.run = 0;
        this.trabajador = 0;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getAppaterno(){
        return appaterno;
    }
    
    public String getApmaterno(){
        return apmaterno;
    }
    
    public int getRun(){
        return run;
    }
    
    public byte getTrabajador(){
        return trabajador;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setAppaterno(String appaterno){
        this.appaterno = appaterno;
    }
    
    public void setApmaterno(String apmaterno){
        this.apmaterno = apmaterno;
    }
    
    public void setRun(int run){
        this.run = run;
    }
    
    public void setTrabajador(byte trabajador){
        this.trabajador = trabajador;
    }
    
    public Persona(String nombre, String appaterno, String apmaterno, int run, byte trabajador){
        this.nombre = nombre;
        this.appaterno = appaterno;
        this.apmaterno = apmaterno;
        this.run = run;
        this.trabajador = trabajador;
    }
}
