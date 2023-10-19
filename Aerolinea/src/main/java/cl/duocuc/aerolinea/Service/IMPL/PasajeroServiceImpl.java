package cl.duocuc.aerolinea.Service.IMPL;

import cl.duocuc.aerolinea.DTO.PasajeroDTO;
import cl.duocuc.aerolinea.Service.IPasajeroService;
import java.util.ArrayList;
import java.util.List;

public class PasajeroServiceImpl implements IPasajeroService{

    List<PasajeroDTO> baseDatos;
    
    public PasajeroServiceImpl(){
        baseDatos = new ArrayList<>();
    }
    
    @Override
    public void CrearPasajero(PasajeroDTO obj) {
        baseDatos.add(obj);
        System.out.println("Pasajero Creado...");
    }

    @Override
    public void EliminarPasajero(int indice) {
        baseDatos.remove(indice);
        System.out.println("Pasajero Eliminado...");
    }

    @Override
    public void ActualizarPasajero(PasajeroDTO obj, int indice) {
        baseDatos.set(indice, obj);
        System.out.println("Pasajero Actualizado...");
    }

    @Override
    public void MostrarPasajero(int indice) {
        System.out.println("Datos Del Pasajero");
        System.out.println(baseDatos.get(indice));
    }

    @Override
    public List<PasajeroDTO> ListarPasajero() {
        System.out.println("La Lista De Pasajeros");
        int i = 0;
        for(PasajeroDTO elementos: baseDatos){
            System.out.println((i+1) + ") " + elementos.toString());
            i++;
        }
        return baseDatos;
    }
}