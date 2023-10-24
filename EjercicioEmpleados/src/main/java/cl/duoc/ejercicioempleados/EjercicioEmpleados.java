package cl.duoc.ejercicioempleados;

import cl.duoc.ejercicioempleados.DTO.*;
import cl.duoc.ejercicioempleados.Utils.Service.IEmpleadoService;
import cl.duoc.ejercicioempleados.Utils.Service.IMPL.EmpleadoServiceIMPL;
import cl.duoc.ejercicioempleados.Utils.Verificacion;

public class EjercicioEmpleados {

    public static void main(String[] args) {
        Verificacion ver = new Verificacion();
        IEmpleadoService empleado = new EmpleadoServiceIMPL();
        int idCargo;
        
        EmpleadoDTO emp1 = new EmpleadoDTO();
        EmpleadoDTO emp2 = new EmpleadoDTO();
        EmpleadoDTO emp3 = new EmpleadoDTO();
        EmpleadoDTO emp4 = new EmpleadoDTO();
        
        idCargo = 3;
        emp1.setNombre("Benjamin");
        emp1.setApellidos("Morales");
        emp1.setCargo(ver.nombreCargo(idCargo));
        emp1.setDNI(222222222);
        emp1.setDirección("Avenida Muerta 2123");
        emp1.setFechaContrato(02, 02,2002);
        emp1.setFono(89423123);
        emp1.setSalario(ver.getSalarioUtils(100000, idCargo));
        
        idCargo = 2;
        emp2.setNombre("Sebastian");
        emp2.setApellidos("Morales");
        emp2.setCargo(ver.nombreCargo(idCargo));
        emp2.setDNI(101010101);
        emp2.setDirección("Avenida Viva 1234");
        emp2.setFechaContrato(14, 12,2012);
        emp2.setFono(77441232);
        emp2.setSalario(ver.getSalarioUtils(100000, idCargo));
        emp2.setSupervisor(emp1);
        
        idCargo = 1;
        emp3.setNombre("Valentina");
        emp3.setApellidos("Morales");
        emp3.setCargo(ver.nombreCargo(idCargo));
        emp3.setDNI(2310213);
        emp3.setDirección("Avenida Loca 1234");
        emp3.setFechaContrato(03, 05,2013);
        emp3.setFono(1234567);
        emp3.setSalario(ver.getSalarioUtils(100000, idCargo));
        emp3.setSupervisor(emp1);

        idCargo = 3;
        emp4.setNombre("Aquiles");
        emp4.setApellidos("Bailo");
        emp4.setCargo(ver.nombreCargo(idCargo));
        emp4.setDNI(11111111);
        emp4.setDirección("Avenida Nunca Rie 123");
        emp4.setFechaContrato(12, 12,1998);
        emp4.setFono(112323);
        emp4.setSalario(ver.getSalarioUtils(100000, idCargo));
        
        empleado.crearEmpleado(emp1);
        empleado.crearEmpleado(emp2);
        empleado.crearEmpleado(emp3);
        empleado.listaEmpleado();
        empleado.crearEmpleado(emp4);
        empleado.eliminarEmpleado(1);
        empleado.crearEmpleado(emp2);
        empleado.superviorEmpleado(emp4, 1);
        empleado.listaEmpleado();
        
    }
}
