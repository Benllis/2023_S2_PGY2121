package cl.duoc.ejercicioempleados.DTO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class JefeDeZonaDTO extends EmpleadoDTO{
    private String despachoJefe;
    private boolean tieneSecre;
    private SecretarioDTO secretaria;
    private List<VendedorDTO> listaVendedor;
    private VehiculoDTO vehiculo;


    public JefeDeZonaDTO() {
        this.despachoJefe = "Sin despacho";
        this.tieneSecre = false;
        this.secretaria = null;
        this.listaVendedor = null;
        this.vehiculo = null;

    }

    public JefeDeZonaDTO(String nombre, String apellidos, int DNI, String dirección, LocalDate fechaContrato, int fono, int salario, String cargo, EmpleadoDTO supervisor) {
        super(nombre, apellidos, DNI, dirección, fechaContrato, fono, salario, cargo, supervisor);
    }

    public JefeDeZonaDTO(String despachoJefe, boolean tieneSecre, SecretarioDTO secretaria, ArrayList<VendedorDTO> listaVendedor, boolean coche, 
            String matricula, String marca, String modelo, VehiculoDTO vehiculo) {
        this.despachoJefe = despachoJefe;
        this.tieneSecre = tieneSecre;
        this.secretaria = secretaria;
        this.listaVendedor = listaVendedor;
        this.vehiculo = vehiculo;

    }

    public JefeDeZonaDTO(String despachoJefe, boolean tieneSecre, SecretarioDTO secretaria, ArrayList<VendedorDTO> listaVendedor, boolean coche, 
            String matricula, String marca, String modelo, String nombre, String apellidos, int DNI, String dirección, 
            LocalDate fechaContrato, int fono, int salario, String cargo, EmpleadoDTO supervisor, VehiculoDTO vehiculo) {
        
        super(nombre, apellidos, DNI, dirección, fechaContrato, fono, salario, cargo, supervisor);
        this.despachoJefe = despachoJefe;
        this.tieneSecre = tieneSecre;
        this.secretaria = secretaria;
        this.listaVendedor = listaVendedor;
        this.vehiculo = vehiculo;
    }

    public String getDespachoJefe() {
        return despachoJefe;
    }

    public VehiculoDTO getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(VehiculoDTO vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void setDespachoJefe(String despachoJefe) {
        this.despachoJefe = despachoJefe;
    }

    public boolean isTieneSecre() {
        return tieneSecre;
    }

    public void setTieneSecre(boolean tieneSecre) {
        this.tieneSecre = tieneSecre;
    }

    public SecretarioDTO getSecretaria() {
        return secretaria;
    }

    public void setSecretaria(SecretarioDTO secretaria) {
        this.secretaria = secretaria;
    }

    public List<VendedorDTO> getListaVendedor() {
        return listaVendedor;
    }

    public void setListaVendedor(VendedorDTO Vendedor) {
        this.listaVendedor.add(Vendedor);
    }

    @Override
    public String toString(){
        return super.toString() + "\nDespacho: " + this.despachoJefe
                + this.vehiculo.DatoVehiculo()
                + "\nSecretaria: " + this.tieneSecre + "\n" + this.secretaria
                + "\n\nVendedores A Cargo\n" +this.listaVendedor;
    }
}
