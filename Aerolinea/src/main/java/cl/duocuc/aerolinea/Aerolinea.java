package cl.duocuc.aerolinea;

import cl.duocuc.aerolinea.DTO.PasajeDTO;
import cl.duocuc.aerolinea.DTO.PasajeroDTO;
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
    }
}
