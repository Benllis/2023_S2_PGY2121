package cl.duoc.ejercicioempleados.Service;

import cl.duoc.ejercicioempleados.DTO.EmpleadoDTO;
import java.util.List;

public interface IEmpleadoService {
    public void crearEmpleado(EmpleadoDTO obj);
    public void editarEmpleado(EmpleadoDTO obj, int indice);
    public void eliminarEmpleado(int indice);
    public void mostrarEmpleado(int indice);
    public List<EmpleadoDTO> listaEmpleado();
}