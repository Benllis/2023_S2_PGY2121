package cl.duoc.ejercicioempleados.Service;

import cl.duoc.ejercicioempleados.DTO.ClienteDTO;
import cl.duoc.ejercicioempleados.DTO.EmpleadoDTO;
import cl.duoc.ejercicioempleados.DTO.VehiculoDTO;
import cl.duoc.ejercicioempleados.DTO.VendedorDTO;
import java.util.ArrayList;

public interface IVendedorService{
    public EmpleadoDTO agregarCliente(ArrayList<ClienteDTO> lista, VendedorDTO vende);
    public EmpleadoDTO eliminarListaCliente(VendedorDTO obj);
    public EmpleadoDTO cambiarCoche(VehiculoDTO vehiculo, VendedorDTO obj);
    public void agregarLista(VendedorDTO obj);
    public ArrayList<VendedorDTO> retornaBD();
}
