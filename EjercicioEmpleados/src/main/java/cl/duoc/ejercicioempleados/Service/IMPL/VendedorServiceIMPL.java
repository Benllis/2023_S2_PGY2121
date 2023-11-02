package cl.duoc.ejercicioempleados.Service.IMPL;

import cl.duoc.ejercicioempleados.DTO.ClienteDTO;
import cl.duoc.ejercicioempleados.DTO.EmpleadoDTO;
import cl.duoc.ejercicioempleados.DTO.VehiculoDTO;
import cl.duoc.ejercicioempleados.DTO.VendedorDTO;
import cl.duoc.ejercicioempleados.Service.IVendedorService;
import java.util.ArrayList;


public class VendedorServiceIMPL implements IVendedorService{

    private ArrayList<VendedorDTO> baseDatoV; 

    public VendedorServiceIMPL() {
        baseDatoV = new ArrayList<>();
    }

    public VendedorServiceIMPL(ArrayList<VendedorDTO> baseDatoV) {
        this.baseDatoV = baseDatoV;
    }
    
    @Override
    public EmpleadoDTO agregarCliente(ArrayList<ClienteDTO> lista, VendedorDTO vende) {
        vende.setCliente(lista);
        EmpleadoDTO empleado = vende;
        return empleado;
    }

    @Override
    public EmpleadoDTO eliminarListaCliente(VendedorDTO obj) {
        obj.setCliente(null);
        EmpleadoDTO empleado = obj;
        return empleado;
    }

    @Override
    public EmpleadoDTO cambiarCoche(VehiculoDTO vehiculo, VendedorDTO obj) {
        obj.setVehiculo(vehiculo);
        EmpleadoDTO empleado = obj;
        return empleado;
    }

    @Override
    public void agregarLista(VendedorDTO obj) {
        baseDatoV.add(obj);
    }

    @Override
    public ArrayList<VendedorDTO> retornaBD() {
        return baseDatoV;
    }
    
    
}
