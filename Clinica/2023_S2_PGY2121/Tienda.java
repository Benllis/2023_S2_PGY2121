package cl.duocuc.tienda;
import java.util.Scanner;
import cl.duocuc.tienda.Mascota.Mascota;

public class Tienda {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcion;
        int contador = 0;
        Mascota[] arrMascota = new Mascota[15];
        
        do{
            System.out.println("Bienvenido al Sistema de Mascota");
            System.out.println("1. Crear Mascota");
            System.out.println("2. Editar Mascota");
            System.out.println("3. Eliminar Mascota");
            System.out.println("4. Lista Mascota");
            System.out.println("X. Salir");
            System.out.println("\nSeleccion una opcion");
            opcion = sc.nextLine().toUpperCase().trim();
            
            switch(opcion){
                case "1":
                    System.out.println("Ingrese Nombre Mascota");
                    String nombre = sc.nextLine();
                    System.out.println("Ingrese Numero de Chip");
                    int chip = sc.nextInt();
                    System.out.println("Ingrese Nombre Dueño");
                    String nombre_due = sc.nextLine();
                    System.out.println("Ingrese Fecha Nacimiento dd/mm/aaaa");
                    String fNac = sc.nextLine();
                    
                    
                    String[] fecha = fNac.split("/"); 
                    int dia = Integer.parseInt(fecha[0]);
                    int mes = Integer.parseInt(fecha[1]);
                    int anio = Integer.parseInt(fecha[2]);
                    
                    Mascota obj = new Mascota();
                    obj.setNombre(nombre);
                    obj.setNum_chip(chip);
                    obj.setNombre_due(nombre_due);
                    obj.setFecha_nac(dia, mes, anio);
                    arrMascota[contador] = obj;
                    contador++;
                    break;
                    
                case "2": 
                    System.out.println("2. Editar Mascota");
                    System.out.println("Ingrese Numero Chip de Mascota");

                    break;
                case "3":
                    System.out.println("3. Eliminar Mascota");
                    System.out.println("Ingrese Numero Chip de Mascota");

                    break;
                case "4":
                    System.out.println("4. Lista Mascota");
                    break;
                case "X":
                    System.out.println("Exit");
                    break;
            }
            
            
        }while(!"X".equals(opcion));
    }
}
