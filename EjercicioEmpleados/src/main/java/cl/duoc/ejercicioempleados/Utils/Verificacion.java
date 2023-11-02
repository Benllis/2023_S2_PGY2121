package cl.duoc.ejercicioempleados.Utils;

import cl.duoc.ejercicioempleados.DTO.EmpleadoDTO;
import cl.duoc.ejercicioempleados.DTO.SecretarioDTO;
import cl.duoc.ejercicioempleados.DTO.VehiculoDTO;

public class Verificacion {

    public Verificacion() {
    }
    
    public String tieneVehiculo(VehiculoDTO vehiculo){
        if(vehiculo == null)
            return vehiculo.toString();
        
        return "El empleado no tiene vehiculo a su nombre";
    }
    
    public String tieneSecretaria(SecretarioDTO secretaria){
        if(secretaria == null)
            return "No Tiene Secretaria";
        
        return secretaria.Dato();
    }
    
    public String nombreCargo(int idCargo){
        if(idCargo == 1)
            return "Secretario";
        if(idCargo == 2)
            return "Vendedor";
        if(idCargo == 3)
            return "Jefe De Zona";
        else
            return "Sin Cargo";
    }
    
    public int getSalarioUtils(int salarioEmpleado, int cargoEmpleado){
        int salarioFinal = 0;
        if(cargoEmpleado == 1)
            salarioFinal = (int) Math.round(salarioEmpleado * 1.05);
        if(cargoEmpleado == 2)
            salarioFinal = (int) Math.round(salarioEmpleado * 1.1);
        if(cargoEmpleado == 3)
            salarioFinal = (int) Math.round(salarioEmpleado * 1.2);

        return salarioFinal;
    }
    
    public boolean tieneSupervisor(EmpleadoDTO obj){
        EmpleadoDTO supervisor = obj.getSupervisor();
        if(supervisor.getDNI() != 0 && supervisor.getCargo() == "Jefe De Zona")    
            return true;
        
        return false;
    }
    
    public boolean supervisorVacio(EmpleadoDTO obj){
        if(obj == null || obj.getDNI() == 0)
        {
            return true;
        }
        return false;
    }
}
