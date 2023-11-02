package cl.duoc.ejercicioempleados.Service;

import cl.duoc.ejercicioempleados.DTO.EmpleadoDTO;

public interface ISecretarioService {
     public EmpleadoDTO editarSecretario(EmpleadoDTO obj, int fax, String despacho);
}
