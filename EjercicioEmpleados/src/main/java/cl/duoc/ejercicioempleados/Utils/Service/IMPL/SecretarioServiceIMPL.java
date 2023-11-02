package cl.duoc.ejercicioempleados.Utils.Service.IMPL;

import cl.duoc.ejercicioempleados.DTO.EmpleadoDTO;
import cl.duoc.ejercicioempleados.DTO.SecretarioDTO;
import cl.duoc.ejercicioempleados.Utils.Service.ISecretarioService;

public class SecretarioServiceIMPL implements ISecretarioService{

    @Override
    public EmpleadoDTO editarSecretario(EmpleadoDTO obj, int fax, String despacho) {
        SecretarioDTO secre = (SecretarioDTO) obj;
        secre.setDespacho(despacho);
        secre.setFax(fax);
        return obj;
    }
}
