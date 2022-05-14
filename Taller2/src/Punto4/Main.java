package Punto4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //definición de variables
    static Scanner input = new Scanner(System.in);
    static Scanner inString = new Scanner(System.in);
    static String Titulo;
    static Boolean disponible;
    static int opcion;
    static String opcionS;
    static ArrayList<Pelicula> listaPelis = new ArrayList<>();

    public static void main(String[] args){
        Pelicula pelicula1 = new Pelicula("Sonic 2",true,"sin novedades");
        Pelicula pelicula2 = new Pelicula("Batman",true, "sin novedades");
        Pelicula pelicula3 = new Pelicula("Fast and furious",true, "sin novedades");

        listaPelis.add(pelicula1);
        listaPelis.add(pelicula2);
        listaPelis.add(pelicula3);
        do{
            System.out.println("Digite la opción que desea elegir, luego presion enter \n" +
                    "1. Alquilar pelicula \n" +
                    "2. Consultar peliculas disponibles \n" +
                    "3. Devolución de pelicula \n" +
                    "9. Salir del sistema \n " +
                    "--------------------------------------------------------");
            opcion = input.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("");
                    opcion = 0;
                    System.out.println("Elija la pelicula que desea alquilar");
                    for(int i = 0; i < 3; i++){
                        if(listaPelis.get(i).getDisponible()){
                            System.out.println(i+": "+listaPelis.get(i).getTitulo());
                        }
                    }
                    opcion = input.nextInt();
                    System.out.println("\nUsted alquiló la pelicula: "+listaPelis.get(opcion).getTitulo());
                    listaPelis.get(opcion).setDisponible(false);
                    System.out.println("--------------------------------------------------------");
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("\nLas peliculas disponibles son: ");
                    for(int i = 0; i < 3; i++){
                        if(listaPelis.get(i).getDisponible()){
                            System.out.println(i+": "+listaPelis.get(i).getTitulo()+", "+listaPelis.get(i).getNovedad());
                        }
                    }
                    System.out.println("\nLas peliculas NO disponibles son: ");
                    for(int i = 0; i < 3; i++){
                        if(!(listaPelis.get(i).getDisponible())){
                            System.out.println(i+": "+listaPelis.get(i).getTitulo());
                        }
                    }
                    System.out.println("--------------------------------------------------------");
                    break;
                case 3:
                    System.out.println("\nElija la pelicula que desea devolver");
                    System.out.println("Peliculas a devolver: ");
                    for(int i = 0; i < 3; i++){
                        if(!(listaPelis.get(i).getDisponible())){
                            System.out.println(i+": "+listaPelis.get(i).getTitulo());
                        }
                    }
                    opcion = input.nextInt();
                    System.out.println("Usted va a devolver la pelicula: "+listaPelis.get(opcion).getTitulo());
                    listaPelis.get(opcion).setDisponible(true);
                    System.out.println("\n ¿Desea agregar una novedad? \n1.si \n2.no");
                    if(input.nextInt()==1) {
                        System.out.println("\n Ingrese la novedad: ");
                        listaPelis.get(opcion).setNovedad(inString.nextLine());
                        System.out.println("\n Usted regresó la pelicula: " + listaPelis.get(opcion).getTitulo() + ", con la novedad: " + listaPelis.get(opcion).getNovedad());
                    }else{
                        System.out.println("\n No se registró novedad, por lo tanto se regresó la pelicula sin esta");
                    }
                    System.out.println("--------------------------------------------------------");
                    break;
                case 9:
                    System.out.println("\nGracias por usar el sistema");
                    break;
                default:
                    throw new IllegalStateException("No existe la opción: " + opcion);
            }
        }while(opcion != 9);
    }
}