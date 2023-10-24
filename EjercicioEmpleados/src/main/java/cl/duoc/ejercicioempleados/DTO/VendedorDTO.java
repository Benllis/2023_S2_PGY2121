package cl.duoc.ejercicioempleados.DTO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import cl.duoc.ejercicioempleados.DTO.ClienteDTO;


public class VendedorDTO extends EmpleadoDTO{
    private boolean coche;
    private String matricula; 
    private String marca;
    private String modelo;
    private int movil;
    private String areaVenta;
    private int porcentajeVenta;
    private List<ClienteDTO> cliente;

    public VendedorDTO() {
        this.coche = false;
        this.matricula = "Sin matricula";
        this.marca = "Sin marca";
        this.modelo = "Sin modelo";
        this.movil = 0;
        this.areaVenta = "Sin area";
        this.porcentajeVenta = 0;
        this.cliente = new ArrayList<>();
    }

    public VendedorDTO(boolean coche, String matricula, String marca, String modelo, int movil, String areaVenta, int porcentajeVenta, ArrayList cliente) {
        this.coche = coche;
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.movil = movil;
        this.areaVenta = areaVenta;
        this.porcentajeVenta = porcentajeVenta;
        this.cliente = cliente;
    }

    public VendedorDTO(String nombre, String apellidos, int DNI, String dirección, int dia, int mes, int annio, int fono, int salario, EmpleadoDTO supervisor) {
        super(nombre, apellidos, DNI, dirección, LocalDate.of(dia, mes, annio), fono, salario, "Vendedor", supervisor);
    }

    public VendedorDTO(ArrayList cliente, boolean coche, String matricula, String marca, String modelo, int movil, String areaVenta, int porcentajeVenta, String nombre, String apellidos, int DNI, String dirección, int dia, int mes, int annio, int fono, int salario, EmpleadoDTO supervisor) {
        super(nombre, apellidos, DNI, dirección, LocalDate.of(dia, mes, annio), fono, salario, "Vendedor", supervisor);
        this.coche = coche;
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.movil = movil;
        this.areaVenta = areaVenta;
        this.porcentajeVenta = porcentajeVenta;
        this.cliente = cliente;
    }

    public List<ClienteDTO> getCliente() {
        return cliente;
    }

    public void setCliente(List<ClienteDTO> cliente) {
        this.cliente = cliente;
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
                    + "\nArea de venta: " + this.areaVenta + "Porcentaje Venta: " 
                    + this.porcentajeVenta;
    }
}
