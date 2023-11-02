package cl.duoc.ejercicioempleados.Service.IMPL;

import cl.duoc.ejercicioempleados.DTO.EmpleadoDTO;
import cl.duoc.ejercicioempleados.DTO.JefeDeZonaDTO;
import cl.duoc.ejercicioempleados.DTO.SecretarioDTO;
import cl.duoc.ejercicioempleados.DTO.VehiculoDTO;
import cl.duoc.ejercicioempleados.DTO.VendedorDTO;
import java.util.ArrayList;
import cl.duoc.ejercicioempleados.Service.IJefeDeZonaService;

public class JefeDeZonaServiceIMPL implements IJefeDeZonaService{

    @Override
    public EmpleadoDTO cambiarSecretaria(EmpleadoDTO emp, SecretarioDTO secre) {
        JefeDeZonaDTO jefe = (JefeDeZonaDTO) emp;
        jefe.setSecretaria(secre);
        emp = jefe;
        return emp;
    }
    
    @Override
    public String listaVendedor(EmpleadoDTO emp, ArrayList<VendedorDTO> listaVendedor) {
        JefeDeZonaDTO jefe = (JefeDeZonaDTO) emp;
        int i = 1;
        System.out.println("Vendedores A Cargo\n\n");
        for(VendedorDTO elemento: jefe.getListaVendedor()){
            System.out.println(i + ") " + elemento.Dato() + "\n");
            i++;  
        }
        return "Esos Son Todos Los Vendedores A Cargo";
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
