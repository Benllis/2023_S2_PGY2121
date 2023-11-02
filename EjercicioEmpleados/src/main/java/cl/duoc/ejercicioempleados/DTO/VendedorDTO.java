package cl.duoc.ejercicioempleados.DTO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class VendedorDTO extends EmpleadoDTO{
    private VehiculoDTO vehiculo;
    private int movil;
    private String areaVenta;
    private int porcentajeVenta;
    private ArrayList<ClienteDTO> cliente;

    public VendedorDTO() {
        this.vehiculo = null;
        this.movil = 0;
        this.areaVenta = "Sin area";
        this.porcentajeVenta = 0;
        this.cliente = null;
    }

    public VendedorDTO(VehiculoDTO vehiculo, int movil, String areaVenta, int porcentajeVenta, ArrayList<ClienteDTO> cliente) {
        this.vehiculo = vehiculo;
        this.movil = movil;
        this.areaVenta = areaVenta;
        this.porcentajeVenta = porcentajeVenta;
        this.cliente = cliente;
    }

    public VendedorDTO(String nombre, String apellidos, int DNI, String dirección, LocalDate fechaContrato, int fono, int salario, String cargo, EmpleadoDTO supervisor) {
        super(nombre, apellidos, DNI, dirección, fechaContrato, fono, salario, cargo, supervisor);
    }

    public VendedorDTO(VehiculoDTO vehiculo, int movil, String areaVenta, int porcentajeVenta, ArrayList<ClienteDTO> cliente, String nombre, String apellidos, int DNI, String dirección, LocalDate fechaContrato, int fono, int salario, String cargo, EmpleadoDTO supervisor) {
        super(nombre, apellidos, DNI, dirección, fechaContrato, fono, salario, cargo, supervisor);
        this.vehiculo = vehiculo;
        this.movil = movil;
        this.areaVenta = areaVenta;
        this.porcentajeVenta = porcentajeVenta;
        this.cliente = cliente;
    }

    public List<ClienteDTO> getCliente() {
        return cliente;
    }

    public void setCliente(ArrayList<ClienteDTO> cliente) {
    this.cliente = cliente;
    }

    public VehiculoDTO getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(VehiculoDTO vehiculo) {
        this.vehiculo = vehiculo;
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
    public String Dato(){
       return super.Dato() + "\n\nDatos Extras De Vendedor\nCelular: " + this.movil 
                    + this.vehiculo.DatoVehiculo()
                    + "\nArea de venta: " + this.areaVenta + "\nPorcentaje Venta: " 
                    + this.porcentajeVenta; 
    }
    
    @Override
    public String toString(){ 
            return super.toString() + "\n\nDatos Extras De Vendedor\nCelular: " + this.movil 
                    + this.vehiculo.DatoVehiculo()
                    + "\nArea de venta: " + this.areaVenta + "\nPorcentaje Venta: " 
                    + this.porcentajeVenta;
    }
    

}
