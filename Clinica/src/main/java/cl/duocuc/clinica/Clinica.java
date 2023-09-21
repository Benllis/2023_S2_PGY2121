package cl.duocuc.clinica;
import java.util.Scanner;
import cl.duocuc.clinica.Models.Persona;
import cl.duocuc.clinica.Models.Medico;

public class Clinica {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Persona[] arrPersona = new Persona[15];
        Medico[] arrMedico = new Medico[15];
        String op;
        int contadorP = 0, contadorM = 0;
        do{
            System.out.println("Ingrese Opcion");
            op = sc.nextLine().toUpperCase().trim();
            switch(op){
                case "1":
                    Persona obj = new Persona();
                    Medico objM = new Medico();
                    
                    System.out.println("Ingrese Nombre");
                    obj.setNombre(sc.nextLine());
                    System.out.println("Ingrese Apellido Paterno");
                    obj.setAppaterno(sc.nextLine());
                    System.out.println("Ingrese Apellido Materno");
                    obj.setApmaterno(sc.nextLine());
                    System.out.println("Ingrese RUT");
                    String run =sc.nextLine();
                    int numrun = Integer.parseInt(run);
                    obj.setRun(numrun);
                    System.out.println("Trabajador 1- Si   2- No");
                    byte trabajador = sc.nextByte();
                    obj.setTrabajador(trabajador);
                    arrPersona[contadorP] = obj;
                    switch(trabajador){
                        case 1:
                            System.out.println("Especialidad");
                            String ESpecialidad2 = sc.nextLine();
                            System.out.println("Horario");
                            String hora = sc.nextLine();
                            int numhora = Integer.parseInt(hora);
                            objM.setHorario(numhora);
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
