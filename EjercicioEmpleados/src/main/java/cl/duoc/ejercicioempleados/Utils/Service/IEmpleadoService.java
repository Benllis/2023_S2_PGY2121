package cl.duoc.ejercicioempleados.Utils.Service;

import cl.duoc.ejercicioempleados.DTO.EmpleadoDTO;
import cl.duoc.ejercicioempleados.DTO.JefeDeZonaDTO;
import cl.duoc.ejercicioempleados.DTO.SecretarioDTO;
import cl.duoc.ejercicioempleados.DTO.VendedorDTO;
import java.util.List;

public interface IEmpleadoService {
    public void agregarVendedor(VendedorDTO obj);
    public void agregarSecretario(SecretarioDTO obj);
    public void agregarJefe(JefeDeZonaDTO obj);
    public void crearEmpleado(EmpleadoDTO obj);
    public void eliminarEmpleado(int indice);
    public void mostrar(int indice);
    public List<EmpleadoDTO> listaEmpleado();
    public void editarEmpleado(EmpleadoDTO obj, int indice);
    public void aumentoSalario(float porc, int indice);
    public void superviorEmpleado(EmpleadoDTO supervisor, int indice);
    public void mostarSOLOUnCargo(int indice);
}
