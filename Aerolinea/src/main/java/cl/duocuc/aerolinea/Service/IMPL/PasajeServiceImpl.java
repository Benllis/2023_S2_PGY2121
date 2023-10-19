package cl.duocuc.aerolinea.Service.IMPL;

import cl.duocuc.aerolinea.DTO.PasajeDTO;
import cl.duocuc.aerolinea.Service.IPasajeService;
import java.util.ArrayList;
import java.util.List;

public class PasajeServiceImpl implements IPasajeService{

    List<PasajeDTO> baseDatos;
    
    public PasajeServiceImpl(){
        baseDatos = new ArrayList<>();
    }
    
    @Override
    public void CrearPasaje(PasajeDTO obj) {
        baseDatos.add(obj);
        System.out.println("Pasaje Creado...");
    }

    @Override
    public void EliminarPasaje(int indice) {
        baseDatos.remove(indice);
        System.out.println("Pasaje Eliminado...");
    }

    @Override
    public void ActualizarPasaje(PasajeDTO obj, int indice) {
        baseDatos.set(indice, obj);
        System.out.println("Pasaje Actualizado...");
    }

    @Override
    public void MostrarPasaje(int indice) {
        System.out.println("Datos Del Pasaje");
        System.out.println(baseDatos.get(indice));
    }

    @Override
    public List<PasajeDTO> ListarPasaje() {
        System.out.println("La Lista De Pasajes");
        int i = 0;
        for(PasajeDTO elementos: baseDatos){
            System.out.println((i+1) + ") " + elementos.toString());
            i++;
        }
        return baseDatos;
    }
}
