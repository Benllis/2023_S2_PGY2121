package cl.duocuc.aerolinea.Service;

import cl.duocuc.aerolinea.DTO.PasajeroDTO;
import java.util.List;

public interface IPasajeroService {
    public void CrearPasajero(PasajeroDTO obj);
    public void EliminarPasajero(int indice);
    public void ActualizarPasajero(PasajeroDTO obj, int indice);
    public void MostrarPasajero(int indice);
    public List<PasajeroDTO> ListarPasajero();
}
