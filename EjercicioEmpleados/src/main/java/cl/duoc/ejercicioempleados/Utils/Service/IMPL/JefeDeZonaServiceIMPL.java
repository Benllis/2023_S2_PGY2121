package cl.duoc.ejercicioempleados.Utils.Service.IMPL;

import cl.duoc.ejercicioempleados.DTO.EmpleadoDTO;
import cl.duoc.ejercicioempleados.DTO.JefeDeZonaDTO;
import cl.duoc.ejercicioempleados.DTO.SecretarioDTO;
import cl.duoc.ejercicioempleados.DTO.VehiculoDTO;
import cl.duoc.ejercicioempleados.DTO.VendedorDTO;
import cl.duoc.ejercicioempleados.Utils.Service.IJefeDeZona;
import java.util.ArrayList;

public class JefeDeZonaServiceIMPL implements IJefeDeZona{

    @Override
    public EmpleadoDTO cambiarSecretaria(EmpleadoDTO emp, SecretarioDTO secre) {
        JefeDeZonaDTO jefe = (JefeDeZonaDTO) emp;
        jefe.setSecretaria(secre);
        emp = jefe;
        return emp;
    }
    
    @Override
    public EmpleadoDTO listaVendedor(EmpleadoDTO emp, ArrayList<VendedorDTO> listaVendedor) {
        JefeDeZonaDTO jefe = (JefeDeZonaDTO) emp;
        jefe.setListaVendedor(listaVendedor);
        emp = jefe;
        return emp;
    }
    
    @Override
        public EmpleadoDTO cambiarDatosJefe(EmpleadoDTO emp, String despacho, ArrayList<VendedorDTO> listaVendedor, SecretarioDTO secre, VehiculoDTO vehiculo){
        JefeDeZonaDTO jefe = (JefeDeZonaDTO) emp;
        jefe.setDespachoJefe(despacho);
        jefe.setSecretaria(secre);
        jefe.setVehiculo(vehiculo);
        jefe.setListaVendedor(listaVendedor);
        emp = jefe;
        return emp;
    }

    @Override
    public ArrayList<VendedorDTO> agregarVendedor(ArrayList<VendedorDTO> listaVendedor, VendedorDTO obj) {
        listaVendedor.add(obj);
        return listaVendedor;
    }
}
