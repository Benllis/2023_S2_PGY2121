package cl.duocuc.aerolinea.Service;

import cl.duocuc.aerolinea.DTO.PasajeDTO;
import java.util.List;

public interface IPasajeService {
    public void CrearPasaje(PasajeDTO obj);
    public void EliminarPasaje(int indice);
    public void ActualizarPasaje(PasajeDTO obj, int indice);
    public void MostrarPasaje(int indice);
    public List<PasajeDTO> ListarPasaje();
}
