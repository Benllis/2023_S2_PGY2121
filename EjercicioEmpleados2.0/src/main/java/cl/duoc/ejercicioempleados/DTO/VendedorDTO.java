package cl.duoc.ejercicioempleados.DTO;

//import java.util.List;

public class VendedorDTO extends EmpleadoDTO{
    private boolean coche;
    private String matricula; 
    private String marca;
    private String modelo;
    private int movil;
    private String areaVenta;
    private int porcentajeVenta;
    //private List<PersonaDTO> cliente;

    public VendedorDTO() {
        this.coche = false;
        this.matricula = "Sin matricula";
        this.marca = "Sin marca";
        this.modelo = "Sin modelo";
        this.movil = 0;
        this.areaVenta = "Sin area";
        this.porcentajeVenta = 0;
    }

    public VendedorDTO(boolean coche, String matricula, String marca, String modelo, int movil, String areaVenta, int porcentajeVenta) {
        this.coche = coche;
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.movil = movil;
        this.areaVenta = areaVenta;
        this.porcentajeVenta = porcentajeVenta;
    }

    public VendedorDTO(String nombre, String apellidos, int DNI, String dirección, int anioAntiguo, int fono){
        super(nombre, apellidos, DNI, dirección, anioAntiguo, fono);
    }

    public VendedorDTO(boolean coche, String matricula, String marca, String modelo, int movil, String areaVenta, int porcentajeVenta, String nombre, String apellidos, int DNI, String dirección, int anioAntiguo, int fono) {
        super(nombre, apellidos, DNI, dirección, anioAntiguo, fono);
        this.coche = coche;
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.movil = movil;
        this.areaVenta = areaVenta;
        this.porcentajeVenta = porcentajeVenta;
    }

    public boolean isCoche() {
        return coche;
    }

    public void setCoche(boolean coche) {
        this.coche = coche;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getMovil() {
        return movil;
    }

    public void setMovil(int movil) {
        this.movil = movil;
    }

    public String getAreaVenta() {
        return areaVenta;
    }

    public void setAreaVenta(String areaVenta) {
        this.areaVenta = areaVenta;
    }

    public int getPorcentajeVenta() {
        return porcentajeVenta;
    }

    public void setPorcentajeVenta(int porcentajeVenta) {
        this.porcentajeVenta = porcentajeVenta;
    }

    public void setCargoVendedor(){
        this.setCargo("Vendedor");
    }
    
    public void setSalarioVendedor(){
        int salarioVendedor = this.getSalario();
        salarioVendedor = (int) Math.round(salarioVendedor * 1.1);
        this.setSalario(salarioVendedor);
    }
    
    @Override
    public String toString(){
        if(this.coche){ 
            return super.toString() + "\nCelular: " + this.movil + "\nCoche: " 
                    + this.coche + " " + this.marca + " " + this.modelo + " " + this.matricula 
                    + "\nArea de venta: " + this.areaVenta + "Porcentaje Venta: " 
                    + this.porcentajeVenta;
        }
        else
            return super.toString() + "\nCelular: " + this.movil + "\nCoche: "
                    + "\nArea de venta: " + this.areaVenta 
                    + "\nPorcentaje Venta: "+ this.porcentajeVenta;
    }
}
