package cl.duoc.ejercicioempleados.Utils.Service.IMPL;

import cl.duoc.ejercicioempleados.DTO.ClienteDTO;
import cl.duoc.ejercicioempleados.Utils.Service.IClienteService;
import java.util.ArrayList;

public class ClienteServiceIMPL implements IClienteService{
    
    private ArrayList<ClienteDTO> baseCliente;

    public ClienteServiceIMPL() {
        baseCliente = new ArrayList<>();
    }

    public ClienteServiceIMPL(ArrayList<ClienteDTO> baseCliente) {
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
    public ArrayList<ClienteDTO> listaCliente() {
        return baseCliente;
    }

    @Override
    public void limpiarLista() {
        baseCliente.clear();
    }
    
    @Override
     public ArrayList<ClienteDTO> mostrarClientes(){
        int i = 1;
        for(ClienteDTO elem: baseCliente){
            System.out.println(i + ") " + elem + "\n");
            i++;
        }
        return baseCliente;
     }
    
}
