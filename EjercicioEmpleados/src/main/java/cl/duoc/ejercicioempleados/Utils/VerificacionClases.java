package cl.duoc.ejercicioempleados.Utils;

import cl.duoc.ejercicioempleados.DTO.EmpleadoDTO;
import cl.duoc.ejercicioempleados.DTO.JefeDeZonaDTO;
import cl.duoc.ejercicioempleados.DTO.SecretarioDTO;
import cl.duoc.ejercicioempleados.DTO.VendedorDTO;

public class VerificacionClases {

    public VerificacionClases() {
    }
    
    public int verificarEmpleado(EmpleadoDTO obj){
        JefeDeZonaDTO jefe = (JefeDeZonaDTO) obj;
        if(jefe.getSecretaria() != null){
            return 3;
        }
        else{
            VendedorDTO vende = (VendedorDTO) obj;
            if(vende.getCliente() != null){
                return 2;
            }
            else{
                SecretarioDTO secre = (SecretarioDTO) obj;
                if(secre.getFax() != 0){
                    return 1;
                }
            }
        }
        return 0;
    }
}
