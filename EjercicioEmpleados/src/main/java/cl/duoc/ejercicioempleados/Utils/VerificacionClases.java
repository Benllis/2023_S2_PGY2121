package cl.duoc.ejercicioempleados.Utils;

import cl.duoc.ejercicioempleados.DTO.EmpleadoDTO;

public class VerificacionClases {

    public VerificacionClases() {
    }
    
    public int verificarEmpleado(EmpleadoDTO obj){
        if("Jefe De Zona".equals(obj.getCargo())){
            return 3;
        }
        else{
            if("Vendedor".equals(obj.getCargo())){
                return 2;
            }
            else{
                if("Secretario".equals(obj.getCargo())){
                    return 1;
                }
            }
        }
        return 0;
    }
}
