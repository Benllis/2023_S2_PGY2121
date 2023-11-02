package cl.duoc.ejercicioempleados.Utils.Service.IMPL;

import cl.duoc.ejercicioempleados.DTO.ClienteDTO;
import cl.duoc.ejercicioempleados.DTO.EmpleadoDTO;
import cl.duoc.ejercicioempleados.DTO.VehiculoDTO;
import cl.duoc.ejercicioempleados.DTO.VendedorDTO;
import cl.duoc.ejercicioempleados.Utils.Service.IVendedorService;
import cl.duoc.ejercicioempleados.Utils.Verificacion;
import java.util.ArrayList;


public class VendedorServiceIMPL implements IVendedorService{

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
    public ArrayList<VendedorDTO> mostrarLista(ArrayList<VendedorDTO> bd) {
        Verificacion ver = new Verificacion();
        for(VendedorDTO elemento: bd){
            System.out.println( elemento+ "\n");
        }
        return bd;
    }
}
