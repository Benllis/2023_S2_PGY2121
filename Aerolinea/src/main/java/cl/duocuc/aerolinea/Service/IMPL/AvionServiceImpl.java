package cl.duocuc.aerolinea.Service.IMPL;

import cl.duocuc.aerolinea.DTO.AvionDTO;
import cl.duocuc.aerolinea.Service.IAvionService;
import java.util.ArrayList;
import java.util.List;

public class AvionServiceImpl implements IAvionService{

    List<AvionDTO> bd;

    public AvionServiceImpl() {
        this.bd = new ArrayList();
    }
    
    @Override
    public void CrearAvion(AvionDTO obj) {
        bd.add(obj);
        System.out.println("Creacion De Avion Exitosa");
    }

    @Override
    public void EditarAvion(AvionDTO obj, int indice) {
        System.out.println("Avion Editado");
        bd.set(indice, obj);
    }

    @Override
    public void EliminarAvion(int indice) {
        bd.remove(indice);
        System.out.println("Avion Eliminado");
    }

    @Override
    public void MostrarAvion(int indice) {
        System.out.println("Los Datos Del Avion Son:\n");
        System.out.println(bd.get(indice));
    }

    @Override
    public List<AvionDTO> ListarAvion() {
    int i = 1;
    System.out.println("La Lista de Aviones\n");
    for(AvionDTO elementos: bd){
        System.out.println("\n"+i + "\n" + elementos.toString());
        i++;
    }
        return bd;
    }
    
}
