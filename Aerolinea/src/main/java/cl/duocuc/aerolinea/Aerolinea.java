package cl.duocuc.aerolinea;

import cl.duocuc.aerolinea.DTO.AvionDTO;
import cl.duocuc.aerolinea.DTO.PasajeDTO;
import cl.duocuc.aerolinea.DTO.PasajeroDTO;
import cl.duocuc.aerolinea.Service.IAvionService;
import cl.duocuc.aerolinea.Service.IMPL.AvionServiceImpl;
import cl.duocuc.aerolinea.Service.IMPL.PasajeServiceImpl;
import cl.duocuc.aerolinea.Service.IMPL.PasajeroServiceImpl;
import cl.duocuc.aerolinea.Service.IPasajeService;
import cl.duocuc.aerolinea.Service.IPasajeroService;

public class Aerolinea {

    public static void main(String[] args) {
        PasajeDTO p1 = new PasajeDTO();
        PasajeDTO p2 = new PasajeDTO();
        PasajeDTO p3 = new PasajeDTO();
        
        PasajeroDTO pA = new PasajeroDTO();
        PasajeroDTO pB = new PasajeroDTO();
        PasajeroDTO pC = new PasajeroDTO();
        
        AvionDTO av1 = new AvionDTO();
        AvionDTO av2 = new AvionDTO();
        AvionDTO av3 = new AvionDTO();
        
        IAvionService avion = new AvionServiceImpl();
        IPasajeService pasaje = new PasajeServiceImpl();
        IPasajeroService pasajero = new PasajeroServiceImpl();
        
        p1.setId(10);
        p1.setNombreCompleto("Alma Marcela Gozo");
        p1.setNumAsiento(12);
        pasaje.CrearPasaje(p1);
        
        p2.setId(20);
        p2.setNombreCompleto("Aquiles Bailo");
        p2.setNumAsiento(24);
        pasaje.CrearPasaje(p2);
        
        p3.setId(40);
        p3.setNombreCompleto("Alan Brito");
        p3.setNumAsiento(50);
        
        pasaje.ListarPasaje();
        pasaje.EliminarPasaje(0);
        pasaje.ListarPasaje();        
        pasaje.CrearPasaje(p1);
        pasaje.MostrarPasaje(0);
        pasaje.ActualizarPasaje(p3, 0);
        pasaje.ListarPasaje();
        
        pA.setNombre("Alma Marcela");
        pA.setApellido("Gozo");
        pA.setFechaNac(12,4, 1999);
        
        pB.setNombre("Alan");
        pB.setApellido("Brito");
        pB.setFechaNac(4,2, 1985);
        
        pC.setNombre("Aquiles");
        pC.setApellido("Bailo");
        pC.setFechaNac(20,8, 2010);
        System.out.println("\n\n");
        pasajero.CrearPasajero(pA);
        pasajero.CrearPasajero(pB);
        pasajero.CrearPasajero(pC);
        pasajero.ListarPasajero();
        pasajero.EliminarPasajero(0);
        pasajero.ListarPasajero();        
        pasajero.CrearPasajero(pA);
        pasajero.MostrarPasajero(0);
        pasajero.ActualizarPasajero(pC, 0);
        pasajero.ListarPasajero();
        
        System.out.println("\n\n\n");
        
        av1.setId_Avion(10);
        av1.setModelo("AV20X3");
        av1.setTipoAvion("Avioneta");
        av1.setEstanqueGas(200000);
        av1.setCapacidadPasajeros(500);
        
        av2.setId_Avion(20);
        av2.setModelo("BF40VF");
        av2.setTipoAvion("Avion Comercian");
        av2.setEstanqueGas(450000);
        av2.setCapacidadPasajeros(1000);
        
        av3.setId_Avion(50);
        av3.setModelo("GN50F2");
        av3.setTipoAvion("Avion");
        av3.setEstanqueGas(750000);
        av3.setCapacidadPasajeros(2000);
        
        avion.CrearAvion(av1);
        avion.CrearAvion(av2);
        avion.CrearAvion(av3);
        System.out.println("\n\n");
        avion.ListarAvion();
        avion.EditarAvion(av3, 0);
        System.out.println("\n\n");
        avion.ListarAvion();
        avion.EliminarAvion(0);
        System.out.println("\n\n");
        avion.MostrarAvion(1);
        System.out.println("\n\n");
        avion.CrearAvion(av1);
        avion.ListarAvion();
    
    }
}
