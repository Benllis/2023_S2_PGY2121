package cl.duoc.ejercicioempleados.DTO;

import cl.duoc.ejercicioempleados.Utils.Verificacion;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class JefeDeZonaDTO extends EmpleadoDTO{
    private String despachoJefe;
    private SecretarioDTO secretaria;
    private ArrayList<VendedorDTO> listaVendedor;
    private VehiculoDTO vehiculo;


    public JefeDeZonaDTO() {
        this.despachoJefe = "Sin despacho";
        this.secretaria = null;
        this.listaVendedor = null;
        this.vehiculo = null;

    }

    public JefeDeZonaDTO(String nombre, String apellidos, int DNI, String dirección, LocalDate fechaContrato, int fono, int salario, String cargo, EmpleadoDTO supervisor) {
        super(nombre, apellidos, DNI, dirección, fechaContrato, fono, salario, cargo, supervisor);
    }

    public JefeDeZonaDTO(String despachoJefe, SecretarioDTO secretaria, ArrayList<VendedorDTO> listaVendedor, 
            String matricula, String marca, String modelo, VehiculoDTO vehiculo) {
        this.despachoJefe = despachoJefe;
        this.secretaria = secretaria;
        this.listaVendedor = listaVendedor;
        this.vehiculo = vehiculo;

    }

    public JefeDeZonaDTO(String despachoJefe, SecretarioDTO secretaria, ArrayList<VendedorDTO> listaVendedor, 
            String matricula, String marca, String modelo, String nombre, String apellidos, int DNI, String dirección, 
            LocalDate fechaContrato, int fono, int salario, String cargo, EmpleadoDTO supervisor, VehiculoDTO vehiculo) {
        
        super(nombre, apellidos, DNI, dirección, fechaContrato, fono, salario, cargo, supervisor);
        this.despachoJefe = despachoJefe;
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

    public SecretarioDTO getSecretaria() {
        return secretaria;
    }

    public void setSecretaria(SecretarioDTO secretaria) {
        this.secretaria = secretaria;
    }

    public List<VendedorDTO> getListaVendedor() {
        return listaVendedor;
    }

    public void setListaVendedor(ArrayList<VendedorDTO> vendedor) {
        this.listaVendedor = vendedor;
    }

    @Override 
    public String Dato(){
        VehiculoDTO auto = this.vehiculo;
        return super.Dato() + "\nDespacho: " + this.despachoJefe
                + "\n" + auto.DatoVehiculo();
    }
    
    @Override
    public String toString(){
        Verificacion val = new Verificacion ();
        VehiculoDTO auto = this.vehiculo;
        return super.toString() + "\nDespacho: " + this.despachoJefe
                + "\n" + auto.DatoVehiculo()
                + "\n\nDatos de Secretaria\n" + val.tieneSecretaria(this.secretaria)
                + "\n\nVendedores A Cargo\n" +this.listaVendedor;
    }
}
