package cl.duoc.ejercicioempleados;

import cl.duoc.ejercicioempleados.DTO.*;
import cl.duoc.ejercicioempleados.Utils.Service.IClienteService;
import cl.duoc.ejercicioempleados.Utils.Service.IEmpleadoService;
import cl.duoc.ejercicioempleados.Utils.Service.IMPL.ClienteServiceIMPL;
import cl.duoc.ejercicioempleados.Utils.Service.IMPL.EmpleadoServiceIMPL;
import cl.duoc.ejercicioempleados.Utils.Service.IMPL.VendedorServiceIMPL;
import cl.duoc.ejercicioempleados.Utils.Service.IVendedorService;
import cl.duoc.ejercicioempleados.Utils.Verificacion;
import java.util.List;

public class EjercicioEmpleados {

    public static void main(String[] args) {
        Verificacion ver = new Verificacion();
        IEmpleadoService empleado = new EmpleadoServiceIMPL();
        IClienteService cliente = new ClienteServiceIMPL();
        //IVendedorService vendedor = new VendedorServiceIMPL();
        int idCargo;
        
        EmpleadoDTO emp1 = new EmpleadoDTO();
        VendedorDTO emp2 = new VendedorDTO();
        EmpleadoDTO emp3 = new EmpleadoDTO();
        EmpleadoDTO emp4 = new EmpleadoDTO();
        ClienteDTO cli = new ClienteDTO(10,23);
        ClienteDTO cli2 = new ClienteDTO(20,30);
        ClienteDTO cli3 = new ClienteDTO(30,16);
        ClienteDTO cli4 = new ClienteDTO(40,68);
        SecretarioDTO sec1 = new SecretarioDTO();
        /*cliente.crearCliente(cli);
        cliente.crearCliente(cli2);
        cliente.crearCliente(cli3);
        cliente.crearCliente(cli4);
        */cliente.mostrarClientes();
        
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
        emp2.setAreaVenta("Vehiculo");
        emp2.setMovil(9876543);
        emp2.setCliente(cliente.listaCliente());
        emp2.setPorcentajeVenta(3);
        
        VehiculoDTO vehiculo = new VehiculoDTO(true, "XD2020", "Algo", "Manco");
        emp2.setVehiculo(vehiculo);
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
        
        idCargo = 1;
        sec1.setCargo(ver.nombreCargo(idCargo));
        sec1.setNombre("Manolo");
        sec1.setApellidos("Gomez");
        sec1.setDNI(21230345);
        sec1.setDespacho("ADMIN");
        sec1.setDirección("La vencidad del Chavo");
        sec1.setFax(1001);
        sec1.setFechaContrato(10,04, 2019);
        sec1.setFono(2233444);
        sec1.setSalario(1000000);
        sec1.setSupervisor(emp1);
        
        System.out.println(emp2.toString());
        System.out.println(emp2.mostrar());
        /*vendedor.agregarCliente(cli, 1);
        empleado.crearEmpleado(emp1);
        empleado.crearEmpleado(emp2);
        empleado.crearEmpleado(emp3);
        empleado.crearEmpleado(emp4);
        empleado.superviorEmpleado(emp4, 1);
        empleado.aumentoSalario(2,0);
        empleado.agregarSecretario(sec1);
        empleado.listaEmpleado();
        */
    }
}
