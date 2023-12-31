package cl.duoc.ejercicioempleados.Service;

import cl.duoc.ejercicioempleados.DTO.EmpleadoDTO;
import cl.duoc.ejercicioempleados.DTO.SecretarioDTO;
import cl.duoc.ejercicioempleados.DTO.VehiculoDTO;
import cl.duoc.ejercicioempleados.DTO.VendedorDTO;
import java.util.ArrayList;

public interface IJefeDeZonaService {
    public EmpleadoDTO cambiarSecretaria(EmpleadoDTO emp, SecretarioDTO secre);
    public String listaVendedor(EmpleadoDTO emp, ArrayList<VendedorDTO> listaVendedor);
    public EmpleadoDTO cambiarDatosJefe(EmpleadoDTO emp, String despacho, ArrayList<VendedorDTO> listaVendedor, SecretarioDTO secre, VehiculoDTO vehiculo);
    public ArrayList<VendedorDTO> agregarVendedor(ArrayList<VendedorDTO> listaVendedor, VendedorDTO obj);
}
