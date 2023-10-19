package cl.duocuc.aerolinea.Service;

import cl.duocuc.aerolinea.DTO.AvionDTO;
import java.util.List;

public interface IAvionService{
    public void CrearAvion(AvionDTO obj);
    public void EditarAvion(AvionDTO obj, int indice);
    public void EliminarAvion(int indice);
    public void MostrarAvion(int indice);
    public List<AvionDTO> ListarAvion();
}