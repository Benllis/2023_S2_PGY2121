package cl.duoc.ejercicioempleados.Utils.Service.IMPL;

import cl.duoc.ejercicioempleados.DTO.EmpleadoDTO;
import cl.duoc.ejercicioempleados.DTO.JefeDeZonaDTO;
import cl.duoc.ejercicioempleados.DTO.SecretarioDTO;
import cl.duoc.ejercicioempleados.DTO.VendedorDTO;
import cl.duoc.ejercicioempleados.Utils.Service.IEmpleadoService;
import cl.duoc.ejercicioempleados.Utils.VerificacionClases;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoServiceIMPL implements IEmpleadoService{
    
    private List<EmpleadoDTO> baseDato;

    public EmpleadoServiceIMPL() {
        baseDato = new ArrayList<>();
    }

    public List<EmpleadoDTO> getBaseDato() {
        return baseDato;
    }

    public void setBaseDato(List<EmpleadoDTO> baseDato) {
        this.baseDato = baseDato;
    }

    public EmpleadoServiceIMPL(ArrayList<EmpleadoDTO> baseDato) {
        this.baseDato = baseDato;
    }

    @Override
    public void agregarVendedor(VendedorDTO obj) {
        EmpleadoDTO union = obj;
        baseDato.add(union);
    }

    @Override
    public void agregarSecretario(SecretarioDTO obj) {        
        EmpleadoDTO union = obj;
        baseDato.add(union);
    }

    @Override
    public void agregarJefe(JefeDeZonaDTO obj) {    
        EmpleadoDTO union = obj;
        baseDato.add(union);
}
    
    @Override
    public void crearEmpleado(EmpleadoDTO obj) {
        baseDato.add(obj);
    }

    @Override
    public void eliminarEmpleado(int indice) {
        baseDato.remove(indice);
    }

    @Override
    public void mostrar(int indice) {
        System.out.println(baseDato.get(indice));
    }

    @Override
    public List<EmpleadoDTO> listaEmpleado() {
        int i = 1;
        for(EmpleadoDTO elemento:baseDato){
            System.out.println(i + ") " + elemento.toString());
            i++;
            System.out.println("\n\n");
        }
        return baseDato;
    }
    

    @Override
    public void editarEmpleado(EmpleadoDTO obj, int indice) {
        baseDato.set(indice, obj);
    }

    @Override
    public void aumentoSalario(float porc, int indice) {
        EmpleadoDTO obj = baseDato.get(indice);
        int salarioEmpleado;
        salarioEmpleado = (int) Math.round(obj.getSalario() * porc);
        obj.setSalario(salarioEmpleado);
        baseDato.set(indice, obj);
    }

    @Override
    public void superviorEmpleado(EmpleadoDTO supervisor, int indice) {
        EmpleadoDTO obj = baseDato.get(indice);
        obj.setSupervisor(supervisor);
        baseDato.set(indice, obj);
    }

    @Override
    public void mostarSOLOUnCargo(int indice) {
        VerificacionClases VC = new VerificacionClases();
        int i=1;
        for(EmpleadoDTO obj: baseDato){
            if(VC.verificarEmpleado(obj) == indice){
                System.out.println(i + ") " + obj.Dato());
                i++;
            }
        }
    }
}
