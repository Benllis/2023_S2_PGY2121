package cl.duoc.ejercicioempleados.Utils.Service;

import cl.duoc.ejercicioempleados.DTO.ClienteDTO;
import cl.duoc.ejercicioempleados.DTO.VendedorDTO;

public interface IVendedorService extends IEmpleadoService{
    public void cambiarVendedor(VendedorDTO obj, int indice);
    public void agregarCliente(ClienteDTO obj);
    public void eliminarCliente(int indice);
    public void cambiarCoche(String modelo, String marca, String matricula, int indice);
}
