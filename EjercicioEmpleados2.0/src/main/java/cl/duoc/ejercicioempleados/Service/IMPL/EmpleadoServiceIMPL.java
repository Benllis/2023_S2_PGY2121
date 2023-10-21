package cl.duoc.ejercicioempleados.Service.IMPL;

import cl.duoc.ejercicioempleados.DTO.EmpleadoDTO;
import cl.duoc.ejercicioempleados.Service.IEmpleadoService;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoServiceIMPL implements IEmpleadoService{
    
    private List<EmpleadoDTO> listaEmpleado;

    public EmpleadoServiceIMPL() {
        this.listaEmpleado = new ArrayList();
    }
    
    @Override
    public void crearEmpleado(EmpleadoDTO obj) {
        listaEmpleado.add(obj);
    }

    @Override
    public void editarEmpleado(EmpleadoDTO obj, int indice) {
        listaEmpleado.set(indice, obj);
    }

    @Override
    public void eliminarEmpleado(int indice) {
        listaEmpleado.remove(indice);
    }

    @Override
    public void mostrarEmpleado(int indice) {
        System.out.println(listaEmpleado.get(indice));
    }

    @Override
    public List<EmpleadoDTO> listaEmpleado() {
        int i = 1;
        for(EmpleadoDTO elementos: listaEmpleado){
            System.out.println(i + ") " + elementos.toString());
            i++;
        }
        return listaEmpleado;
    }
}
