package cl.duocuc.clinica;
import java.util.Scanner;
import cl.duocuc.clinica.Models.Persona;
import cl.duocuc.clinica.Models.Medico;

public class Clinica {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner novo = new Scanner(System.in);
        Scanner opcion = new Scanner(System.in);
        String op;
        Persona[] arrPersona = new Persona[15];
        Medico[] arrMedico = new Medico[15];
        int contadorP = 0, contadorM = 0;
        do{
            System.out.println("Ingrese Opcion");
            op = sc.nextLine().toUpperCase().trim();
            switch(op){
                case "1":
                    Persona obj = new Persona();
                    Medico objM = new Medico();
                    
                    System.out.println("Ingrese Nombre");
                    String nombre = sc.nextLine();
                    System.out.println("Ingrese Apellido Paterno");
                    String appaterno = sc.nextLine();
                    System.out.println("Ingrese Apellido Materno");
                    String apmaterno = sc.nextLine();
                    System.out.println("Ingrese RUT");
                    String run =sc.nextLine();
                    int numrun = Integer.parseInt(run);
                    obj.setNombre(nombre);
                    obj.setAppaterno(appaterno);
                    obj.setApmaterno(apmaterno);
                    obj.setRun(numrun);
                    System.out.println("Trabajador 1- Si   2- No");
                    byte trabajador = sc.nextByte();
                    obj.setTrabajador(trabajador);
                    arrPersona[contadorP] = obj;
                    switch(trabajador){
                        case 1:
                            System.out.println("Especialidad");
                            String ESpecialidad1 = novo.nextLine();
                            System.out.println("Especialidad");
                            String ESpecialidad2 = novo.nextLine();
                            System.out.println("Horario");
                            String hora = novo.nextLine();
                            int numhora = Integer.parseInt(hora);
                            objM.setHorario(numhora);
                            objM.setEspecialidad1(ESpecialidad1);
                            objM.setESpecialidad2(ESpecialidad2);
                            objM.setRut(numrun);
                            arrMedico[contadorM] = objM;
                            contadorM++;
                            break;
                    }
                    contadorP++;
                    break;
                case "2":
                    for(int i = 0; i < contadorP; i++){
                        System.out.println(arrPersona[i].ToString());
                        if(arrPersona[i].getTrabajador() == 1){
                            for(int j = 0; j < contadorM; j++){
                                if(arrPersona[i].getRun() == arrMedico[j].getRut()){
                                    System.out.println(arrMedico[j].ToEspecialidad());   
                                }
                            }
                        }
                    }
                    break;
            }
        }while(!"X".equals(op));
    }
}
