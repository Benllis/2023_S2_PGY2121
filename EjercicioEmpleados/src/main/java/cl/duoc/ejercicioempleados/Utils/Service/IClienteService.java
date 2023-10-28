package cl.duoc.ejercicioempleados.Utils.Service;

import cl.duoc.ejercicioempleados.DTO.ClienteDTO;
import java.util.List;

public interface IClienteService {
    public void crearCliente(ClienteDTO obj);
    public void eliminarCliente(int indice);
    public List<ClienteDTO> listaCliente();
    public void limpiarLista();
    public List<ClienteDTO> mostrarClientes();
}
