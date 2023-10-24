package cl.duoc.ejercicioempleados.Utils.Service;

import cl.duoc.ejercicioempleados.DTO.EmpleadoDTO;
import java.util.List;

public interface IEmpleadoService {
    public void crearEmpleado(EmpleadoDTO obj);
    public void eliminarEmpleado(int indice);
    public void mostrar(int indice);
    public List<EmpleadoDTO> listaEmpleado();
    public void editarEmpleado(EmpleadoDTO obj, int indice);
    public void aumentoSalario(double porc, int indice);
    public void superviorEmpleado(EmpleadoDTO supervisor, int indice);
}
