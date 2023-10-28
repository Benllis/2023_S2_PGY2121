package cl.duoc.ejercicioempleados.Utils.Service.IMPL;

import cl.duoc.ejercicioempleados.DTO.ClienteDTO;
import cl.duoc.ejercicioempleados.DTO.EmpleadoDTO;
import cl.duoc.ejercicioempleados.DTO.VehiculoDTO;
import cl.duoc.ejercicioempleados.DTO.VendedorDTO;
import cl.duoc.ejercicioempleados.Utils.Service.IVendedorService;
import java.util.ArrayList;
import java.util.List;

public class VendedorServiceIMPL extends  EmpleadoServiceIMPL
        implements IVendedorService{

    /*private List<VendedorDTO> baseDatoV;
    
    public VendedorServiceIMPL(ArrayList<EmpleadoDTO> baseDato) {
        super(baseDato);
    }

    public VendedorServiceIMPL(List<VendedorDTO> baseDatoV, ArrayList<EmpleadoDTO> baseDato) {
        super(baseDato);
        this.baseDatoV = baseDatoV;
    }

    public VendedorServiceIMPL(List<VendedorDTO> baseDatoV) {
        this.baseDatoV = baseDatoV;
    }

    public VendedorServiceIMPL() {
        baseDatoV = (List<VendedorDTO>) (VendedorDTO) super.getBaseDato();
    }

    @Override
    public void agregarCliente(ClienteDTO obj, int indice) {
        VendedorDTO ven = baseDatoV.get(indice);
        List<ClienteDTO> listaCliente = ven.getCliente();
        listaCliente.add(obj);
        ven.setCliente(listaCliente);
        baseDatoV.set(indice, ven);
    }

    @Override
    public void eliminarCliente(int indiceBaseDato, int indiceCliente) {
        VendedorDTO ven = baseDatoV.get(indiceBaseDato);
        List<ClienteDTO> listaCliente = ven.getCliente();
        listaCliente.remove(indiceCliente);
        ven.setCliente(listaCliente);
        baseDatoV.set(indiceBaseDato, ven);
    }

    @Override
    public void cambiarCoche(VehiculoDTO obj, int indice) {
        VendedorDTO ven = baseDatoV.get(indice);
        ven.setVehiculo(obj);
        baseDatoV.set(indice, ven);
    }   */ 
}
