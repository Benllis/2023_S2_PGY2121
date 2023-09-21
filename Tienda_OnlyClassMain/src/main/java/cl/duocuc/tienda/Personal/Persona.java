package cl.duocuc.tienda.Personal;

public class Persona {
    private String pnombre;
    private String appaterno;
    private String snombre;
    private String apmaterno;
    private int run;
    private int dv_run;
    private int fono;
    private int chip;
    
    public Persona(){
        this.pnombre = "Sin nombre";
        this.snombre = "Sin segundo nombre";
        this.appaterno = "Sin apellido";
        this.apmaterno = "Sin apellido";
        this.run = 0;
        this.dv_run = -1;
        this.fono = 0;
        this.chip = 0;
    }

    public int getChip(){
        return chip;
    }
    
    public String getPnombre() {
        return pnombre;
    }

    public void setChip(int chip){
        this.chip = chip;
    }
            

    public void setPnombre(String pnombre) {
        this.pnombre = pnombre;
    }

    public String getAppaterno() {
        return appaterno;
    }

    public void setAppaterno(String appaterno) {
        this.appaterno = appaterno;
    }

    public String getSnombre() {
        return snombre;
    }

    public void setSnombre(String snombre) {
        this.snombre = snombre;
    }

    public String getApmaterno() {
        return apmaterno;
    }

    public void setApmaterno(String apmaterno) {
        this.apmaterno = apmaterno;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getDv_run() {
        return dv_run;
    }

    public void setDv_run(int dv_run) {
        this.dv_run = dv_run;
    }

    public int getFono() {
        return fono;
    }

    public void setFono(int fono) {
        this.fono = fono;
    }

    public Persona(String pnombre, String appaterno, String snombre, String apmaterno, int run, int dv_run, int fono) {
        this.pnombre = pnombre;
        this.appaterno = appaterno;
        this.snombre = snombre;
        this.apmaterno = apmaterno;
        this.run = run;
        this.dv_run = dv_run;
        this.fono = fono;
        this.chip = chip;
    }
    
    public String ToString()
    {
        return "Nombre Completo: "+ this.pnombre + " " + this.snombre + " "  
                + this.appaterno + " " + this.apmaterno + "\nRUT: " 
                + this.run + "-" + this.dv_run + "\nFono: " + this.fono;
    }
}
