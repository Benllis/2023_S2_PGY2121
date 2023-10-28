package cl.duoc.ejercicioempleados.Utils.Service.IMPL;

import cl.duoc.ejercicioempleados.DTO.ClienteDTO;
import cl.duoc.ejercicioempleados.Utils.Service.IClienteService;
import java.util.ArrayList;
import java.util.List;

public class ClienteServiceIMPL implements IClienteService{
    
    private List<ClienteDTO> baseCliente;

    public ClienteServiceIMPL() {
        baseCliente = new ArrayList<>();
    }

    public ClienteServiceIMPL(List<ClienteDTO> baseCliente) {
        this.baseCliente = baseCliente;
    }

    @Override
    public void crearCliente(ClienteDTO obj) {
        baseCliente.add(obj);
    }

    @Override
    public void eliminarCliente(int indice) {
        baseCliente.remove(indice);
    }

    @Override
    public List<ClienteDTO> listaCliente() {
        return baseCliente;
    }

    @Override
    public void limpiarLista() {
        baseCliente.clear();
    }
    
    @Override
     public List<ClienteDTO> mostrarClientes(){
        int i = 1;
        for(ClienteDTO elem: baseCliente){
            System.out.println(i + ") " + elem + "\n");
            i++;
        }
        return baseCliente;
     }
    
}
