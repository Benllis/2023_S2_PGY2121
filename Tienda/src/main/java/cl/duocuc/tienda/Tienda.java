package cl.duocuc.tienda;
import java.util.Scanner;
import cl.duocuc.tienda.Mascota.Mascota;
import cl.duocuc.tienda.Personal.Persona;

public class Tienda {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcion, edit, fNac;
        int contador = 0;
        Mascota[] arrMascota = new Mascota[15];
        Persona[] arrDueño = new Persona[15];
        
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
                    String chip = sc.nextLine();
                    System.out.println("Ingrese Fecha Nacimiento dd/mm/aaaa");
                    fNac = sc.nextLine();
                    int numchip = Integer.parseInt(chip);
                    String[] fecha = fNac.split("/"); 
                    int dia = Integer.parseInt(fecha[0]);
                    int mes = Integer.parseInt(fecha[1]);
                    int anio = Integer.parseInt(fecha[2]);
                    
                    Mascota obj = new Mascota();
                    obj.setNombre(nombre);
                    obj.setNum_chip(numchip);
                    obj.setFecha_nac(dia, mes, anio);
                    Persona dueño = new Persona();
                    System.out.println("Ingrese Nombre completo del Dueño(Si le falta algun nombre o apellido escriba X)");
                    nombre = sc.nextLine();
                    String [] Nc = nombre.split(" ");
                    String pnombre = Nc[0];
                    String snombre = Nc[1];
                    String appaterno = Nc[2];
                    String apmaterno = Nc[3];
                    System.out.println("Ingrese RUT");
                    String run = sc.nextLine();
                    int numrun = Integer.parseInt(run);
                    System.out.println("Ingrese DV RUT");
                    String dv_run = sc.nextLine();
                    int num_dv = Integer.parseInt(dv_run);
                    System.out.println("Ingrese Numero de Fono");
                    String fono = sc.nextLine();
                    int numfono = Integer.parseInt(fono);
                    
                    dueño.setPnombre(pnombre);
                    dueño.setSnombre(snombre);
                    dueño.setAppaterno(appaterno);
                    dueño.setApmaterno(apmaterno);
                    dueño.setRun(numrun);
                    dueño.setDv_run(num_dv);
                    dueño.setFono(numfono);
                    dueño.setChip(numchip);                   
                    obj.setNombre_due(pnombre + " " + appaterno);
                    arrMascota[contador] = obj;
                    arrDueño[contador] = dueño;
                    contador++;
                    break;
                    
                case "2": 
                    System.out.println("Ingrese Numero Chip de Mascota");
                    chip = sc.nextLine();
                    numchip = Integer.parseInt(chip);
                    for(int i = 0; i < contador; i++)
                    {
                        if (arrMascota[i].getNum_chip() == numchip)
                        {
                            Mascota obj2 = arrMascota[i];
                            System.out.println("Los Datos Actuales Son:");
                            System.out.println(arrMascota[i].toString());
                            System.out.println("\nPara Cambiar Un Dato Ingrese");
                            System.out.println("1- Nombre Mascota");
                            System.out.println("2- Fecha Nacimiento");
                            System.out.println("Seleccion una opcion");
                            edit = sc.nextLine().toUpperCase().trim();
                            switch (edit){    
                                case "1":
                                    System.out.println("Ingrese Nombre Mascota");
                                    nombre = sc.nextLine();
                                    obj2.setNombre(nombre);
                                    break;

                                case "2":
                                    System.out.println("Ingrese Fecha Nacimiento dd/mm/aaaa");
                                    fNac = sc.nextLine();
                                    numchip = Integer.parseInt(chip);
                                    fecha = fNac.split("/"); 
                                    dia = Integer.parseInt(fecha[0]);
                                    mes = Integer.parseInt(fecha[1]);
                                    anio = Integer.parseInt(fecha[2]);
                                    obj2.setFecha_nac(dia, mes, anio);
                                    break;
                            }
                            arrMascota[i] = obj2;
                        } 
                    }
                    break;
                    
                case "3":
                    System.out.println("Ingrese Numero Chip de Mascota");
                    chip = sc.nextLine();
                    numchip = Integer.parseInt(chip);
                    for(int i = 0; i < contador; i++)
                    {
                        if (arrDueño[i].getChip() == numchip)
                        {
                            for(int j = i; j < contador; j++)
                            {
                                arrDueño[j] = arrDueño[j+1];
                            }
                        }
                        if (arrMascota[i].getNum_chip() == numchip)
                        {
                            for(int j = i; j < contador; j++)
                            {
                                arrMascota[j] = arrMascota[j+1];
                            }
                            System.out.println("Eliminacion De Dato Correcto");
                            contador --;
                            break;
                        }
                    }
                    break;
                    
                case "4":
                    for(int i = 0; i < contador; i++)
                    {
                        System.out.println("Mascota " + (i+1) + "-\n" 
                                + arrMascota[i].toString()+ "\n");
                        System.out.println("Dueño\n" + arrDueño[i].ToString());
                    }
                    break; 
            }
            
            
        }while(!"X".equals(opcion));
        System.out.println("Ha Salido Exitasamente Del Programa");
    }
}
