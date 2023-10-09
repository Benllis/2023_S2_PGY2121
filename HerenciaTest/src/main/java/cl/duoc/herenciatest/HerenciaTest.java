package cl.duoc.herenciatest;

import cl.duoc.herenciatest.models.Dinosaurio;
import cl.duoc.herenciatest.models.Estegosaurio;
import cl.duoc.herenciatest.models.Velociraptor;

public class HerenciaTest {

    public static void main(String[] args) {
        Velociraptor dinodino = new Velociraptor();
        dinodino.setNombre("alibaba");
        System.out.println(dinodino.cantaDinosaurioCanta());
        
        Estegosaurio esto = new Estegosaurio();
        System.out.println(dinodino.cantaDinosaurioCanta());
        System.out.println(esto.cantaDinosaurioCanta());
    }
}
