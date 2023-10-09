package cl.duoc.recursoshumanos;

import cl.duoc.recursoshumanos.utils.PersonaUtils;

public class RecursosHumanos {

    public static void main(String[] args) {
        /*objetivo:
        registrar personas en la aplicacion
        
        App:
        -Main
        -DTO(modelos y clases de transito)
        -utils (validaciones u otros)
        -services (servicios varios)
        -impl (implementaciones)
        */
        System.out.println(PersonaUtils.validaNombre("Leonardo"));
        
    }
}
