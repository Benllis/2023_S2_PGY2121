package cl.duoc.ejercicioempleados.Service;

import cl.duoc.ejercicioempleados.DTO.ClienteDTO;
import java.util.ArrayList;

public interface IClienteService {
    public void crearCliente(ClienteDTO obj);
    public void eliminarCliente(int indice);
    public ArrayList<ClienteDTO> listaCliente();
    public void limpiarLista();
    public ArrayList<ClienteDTO> mostrarClientes();
}
