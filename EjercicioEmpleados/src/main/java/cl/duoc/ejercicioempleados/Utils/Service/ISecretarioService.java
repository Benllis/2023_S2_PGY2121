package cl.duoc.ejercicioempleados.Utils.Service;

import cl.duoc.ejercicioempleados.DTO.EmpleadoDTO;

public interface ISecretarioService {
     public EmpleadoDTO editarSecretario(EmpleadoDTO obj, int fax, String despacho);
}
