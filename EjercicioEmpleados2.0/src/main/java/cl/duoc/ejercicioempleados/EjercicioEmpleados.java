package cl.duoc.ejercicioempleados;

import cl.duoc.ejercicioempleados.DTO.*;
import java.util.ArrayList;
import java.util.List;

public class EjercicioEmpleados {

    public static void main(String[] args) {
        SecretarioDTO secre = new SecretarioDTO();
        VendedorDTO vende = new VendedorDTO();
        
        secre.setAnioAntiguo(5);
        secre.setNombre("Javier");
        secre.setApellidos("Gonzales");
        secre.setDNI(201989959);
        secre.setDirección("Avenida Siempre Viva");
        secre.setFono(965438967);
        secre.setSalario(150000);
        secre.setSalarioSecretario();
        secre.setCargoSecretario();
        secre.setDespacho("Admin");
        secre.setFax(200456);
        System.out.println(secre.toString());
        System.out.println("\n\n");
        
        vende.setAnioAntiguo(10);
        vende.setNombre("Monica");
        vende.setApellidos("Perez");
        vende.setDNI(18784627);
        vende.setDirección("Avenida Muerta");
        vende.setFono(223455123);
        vende.setSalario(300000);
        vende.setAreaVenta("Bienes Raices");
        vende.setMovil(987654768);
        vende.setCoche(true);
        vende.setMarca("Nizan");
        vende.setMatricula("GBDR42");
        vende.setModelo("Nizan susuki");
        vende.setPorcentajeVenta(10);
        vende.setSalarioVendedor();
        vende.setCargoVendedor();
        System.out.println(vende.toString());
    }
}
