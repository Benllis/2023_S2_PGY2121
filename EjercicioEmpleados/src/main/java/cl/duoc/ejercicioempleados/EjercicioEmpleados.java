package cl.duoc.ejercicioempleados;

import cl.duoc.ejercicioempleados.DTO.ClienteDTO;
import cl.duoc.ejercicioempleados.DTO.EmpleadoDTO;
import cl.duoc.ejercicioempleados.DTO.JefeDeZonaDTO;
import cl.duoc.ejercicioempleados.DTO.SecretarioDTO;
import cl.duoc.ejercicioempleados.DTO.VehiculoDTO;
import cl.duoc.ejercicioempleados.DTO.VendedorDTO;
import cl.duoc.ejercicioempleados.Utils.Service.IClienteService;
import cl.duoc.ejercicioempleados.Utils.Service.IEmpleadoService;
import cl.duoc.ejercicioempleados.Utils.Service.IMPL.ClienteServiceIMPL;
import cl.duoc.ejercicioempleados.Utils.Service.IMPL.EmpleadoServiceIMPL;
import cl.duoc.ejercicioempleados.Utils.Service.IMPL.VendedorServiceIMPL;
import cl.duoc.ejercicioempleados.Utils.Service.IVendedorService;
import cl.duoc.ejercicioempleados.Utils.Verificacion;

public class EjercicioEmpleados {

    public static void main(String[] args) {
        Verificacion ver = new Verificacion();
        IEmpleadoService empleado = new EmpleadoServiceIMPL();
        IClienteService cliente = new ClienteServiceIMPL();
        //IVendedorService vendedor = new VendedorServiceIMPL();
        VehiculoDTO auto = new VehiculoDTO();
        JefeDeZonaDTO jdz = new JefeDeZonaDTO();
        EmpleadoDTO emp = new EmpleadoDTO();
        SecretarioDTO sec10 = new SecretarioDTO();
        SecretarioDTO sec1 = new SecretarioDTO();
        JefeDeZonaDTO jdz20 = new JefeDeZonaDTO();
        
        //Cliente
        ClienteDTO cli = new ClienteDTO(10,23);
        ClienteDTO cli2 = new ClienteDTO(20,30);
        ClienteDTO cli3 = new ClienteDTO(30,16);
        ClienteDTO cli4 = new ClienteDTO(40,68);
        
        cliente.crearCliente(cli);
        cliente.crearCliente(cli2);
        cliente.crearCliente(cli3);
        cliente.crearCliente(cli4);
        
        auto.setMarca("El Mas Veloz");
        auto.setMatricula("UWU2023");
        auto.setModelo("Elpre Cox23");
        
        //Jefe
        jdz.setNombre("Benjamin");
        jdz.setApellidos("Morales");
        jdz.setCargo(ver.nombreCargo(3));
        jdz.setDNI(222222222);
        jdz.setDirección("Avenida Muerta 2123");
        jdz.setFechaContrato(02, 02,2002);
        jdz.setFono(89423123);
        jdz.setVehiculo(auto);
        jdz.setSalario(ver.getSalarioUtils(100000, 3));
        jdz.setDespachoJefe("ADMIN");
        
        //Secretario
        sec1.setCargo(ver.nombreCargo(1));
        sec1.setNombre("Manolo");
        sec1.setApellidos("Gomez");
        sec1.setDNI(21230345);
        sec1.setDespacho("ADMIN");
        sec1.setDirección("La vencidad del Chavo");
        sec1.setFax(1001);
        sec1.setFechaContrato(10,04, 2019);
        sec1.setFono(2233444);
        sec1.setSalario(1000000);
        sec1.setSupervisor(jdz);
       
        jdz.setSecretaria(sec1);

        //Empleado
        emp.setNombre("Sebastian");
        emp.setApellidos("Morales");
        emp.setCargo(ver.nombreCargo(2));
        emp.setDNI(101010101);
        emp.setDirección("Avenida Viva 1234");
        emp.setFechaContrato(14, 12,2012);
        emp.setFono(77441232);
        emp.setSalario(ver.getSalarioUtils(100000, 2));
        
        //Empleado - Vendedor
        VendedorDTO vendedor = (VendedorDTO) emp;
        vendedor.setAreaVenta("Vehiculo");
        vendedor.setMovil(9876543);
        vendedor.setCliente(cliente.listaCliente());
        vendedor.setPorcentajeVenta(3);
        
        VehiculoDTO vehiculo = new VehiculoDTO("XD2020", "Algo", "Manco");
        vendedor.setVehiculo(vehiculo);
        vendedor.setSupervisor(jdz);

        //Secreatrio
        sec10.setNombre("Valentina");
        sec10.setApellidos("Morales");
        sec10.setCargo(ver.nombreCargo(1));
        sec10.setDNI(2310213);
        sec10.setDirección("Avenida Loca 1234");
        sec10.setFechaContrato(03, 05,2013);
        sec10.setFono(1234567);
        sec10.setSalario(ver.getSalarioUtils(100000, 1));
        sec10.setDespacho("Logistica");
        sec10.setFax(7777);
        
        //Jefe 
        jdz20.setNombre("Aquiles");
        jdz20.setApellidos("Bailo");
        jdz20.setCargo(ver.nombreCargo(3));
        jdz20.setDNI(11111111);
        jdz20.setDirección("Avenida Nunca Rie 123");
        jdz20.setFechaContrato(12, 12,1998);
        jdz20.setFono(112323);
        jdz20.setSalario(ver.getSalarioUtils(100000, 3));
        jdz20.setDespachoJefe("Logistica");
        jdz20.setSecretaria(sec10);
        jdz20.setVehiculo(auto);
       
        
        sec10.setSupervisor(jdz20);

        empleado.agregarJefe(jdz);
        empleado.agregarSecretario(sec1);
        empleado.agregarVendedor(vendedor);
        empleado.agregarSecretario(sec10);
        empleado.agregarJefe(jdz20);
        
        System.out.println("\n\nCargos\n\n");
        empleado.listaEmpleado();

    }
}
