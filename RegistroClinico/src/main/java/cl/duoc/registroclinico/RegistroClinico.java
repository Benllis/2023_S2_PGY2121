package cl.duoc.registroclinico;

import cl.duoc.registroclinico.DTO.PacienteDTO;
import cl.duoc.registroclinico.Service.IPacienteService;
import cl.duoc.registroclinico.Service.Impl.PacienteServiceImpl;

public class RegistroClinico {

    public static void main(String[] args) {
        PacienteDTO p = new PacienteDTO();
        p.setId(10);
        p.setFechaNacimiento(3,5,1992);
        p.setNombreCompleto("David de la Cruz Manolito");
        
        PacienteDTO p2 = new PacienteDTO();
        p2.setId(11);
        p2.setFechaNacimiento(30,4,1999);
        p2.setNombreCompleto("Alguien");
    
        
        IPacienteService servicio = new PacienteServiceImpl();
        servicio.CrearPaciente(p);
        servicio.CrearPaciente(p2);
        
        servicio.listarPacientes();
        
        servicio.EliminarPaciente(0);
        
        servicio.listarPacientes();
    
        servicio.CrearPaciente(p);
        servicio.listarPacientes();
    }
}
