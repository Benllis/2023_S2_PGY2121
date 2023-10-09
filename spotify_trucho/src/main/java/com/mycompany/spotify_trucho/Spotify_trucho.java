package com.mycompany.spotify_trucho;

import java.util.Scanner;

public class Spotify_trucho
{
    public static void main(String[] args) 
    {
        Scanner tecla = new Scanner(System.in);
        Cancion cancion1 = new Cancion();
        int opcion;
        do{
            System.out.println("1) Mostrar Datos De La Cancion");
            System.out.println("2) Ingresar Datos De Una Cancion");
            System.out.println("3) Borrar Los Datos");
            System.out.println("4) Adelantar Cancion");
            System.out.println("5) Descargar Cancion O Borrar Cancion");
            System.out.println("6) Agregar A Favoritos O Quitar");
            System.out.println("0) Salir");
            System.out.println("Ingrese El Numero De La Opcion");
            opcion = tecla.nextInt();
            switch(opcion)
            {
                case 1:
                {
                    System.out.println("Datos De La Cancion");
                    System.out.println("Titulo: " + cancion1.getTitulo());
                    System.out.println("Artista: " + cancion1.getArtista());
                    System.out.println("Duracion: " + cancion1.getDuracion());
                    System.out.println("Descargada: " + cancion1.isDescargada());
                    System.out.println("Favorita: " + cancion1.isFavorita());
                    break;
                }
                case 2:
                {
                    System.out.println("Ingrese Los Datos De La Cancion");
                    System.out.println("Ingrese El Titulo");
                    cancion1.setTitulo(tecla.next());
                    System.out.println("Nombre Del Artista");
                    cancion1.setArtista(tecla.next());
                    System.out.println("Duracion De La Cancion");
                    cancion1.setDuracion(tecla.nextInt());
                    cancion1.setDescargada(false);
                    cancion1.setFavorita(false);
                    break;
                }
                case 3:
                {
                    cancion1.setTitulo("");
                    cancion1.setArtista("");
                    cancion1.setDuracion(0);
                    cancion1.setDescargada(false);
                    cancion1.setFavorita(false);
                    System.out.println("Cancion Eliminada");
                    break;
                }
                case 4:
                {
                    System.out.println("Ingrese Los Minutos Que Desea Adelantar");
                    break;
                }
                case 5:
                {
                    if(cancion1.isDescargada())
                    {   
                        System.out.println("Borrando Cancion...");
                        cancion1.setDescargada(false);
                    }
                    else
                    {
                        System.out.println("Descargando Cancion...");
                        cancion1.setDescargada(true);
                    }
                    break;
                }
                case 6:
                {
                    if(cancion1.isFavorita())
                    {
                        System.out.println("Quitando De Favoritos...");
                        cancion1.setFavorita(false);
                    }
                    else
                    {
                        System.out.println("Agregando A Favoritos...");
                        cancion1.setFavorita(true);
                    }
                    break;
                }
            }
        }while(opcion != 0);
    }
}
