package cl.duocuc.clinica.Models;

public class Medico {
    private String especialidad1;
    private String especialidad2;
    private int rut;
    private int horario;
    
    public Medico(){
        this.especialidad1 = "Sin especialidad";
        this.especialidad2 = "Sin especialidad";
        this.rut = 0;
        this.horario = 0;
    }
    
    public Medico(String especialida1, String especialidad2, int rut, int horario){
        this.especialidad1 = especialidad1;
        this.especialidad2 = especialidad2;
        this.rut = rut;
        this.horario = horario;
    }
    
    public void setEspecialidad1(String especialiad1){
        this.especialidad1 = especialidad1;
    }
    
    public void setESpecialidad2(String especialidad2){
        this.especialidad2 = especialidad2;
    }
    
    public void setRut(int rut){
        this.rut = rut;
    }
    
    public void setHorario(int horario){
        this.horario = horario;
    }
    
    public String getEspecialidad1(){
        return especialidad1;
    }
    
    public String getEspecialidad2(){
        return especialidad2;
    }
    
    public int getRut(){
        return rut;
    }
    
    public int horario(){
        return horario;
    }
    
    public String ToEspecialidad(){
        return "\nEspecialidad: " + this.especialidad1 + ", "
                + this.especialidad2 + "\nHorario: " + this.horario;
    }
}
