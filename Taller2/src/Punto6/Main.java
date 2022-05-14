package Punto6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //declarar variables
    static Scanner num = new Scanner(System.in);
    static Scanner text = new Scanner(System.in);

    static LocalDate ingresoTaller;
    static String obsCliente;
    static LocalDate salidaTaller;
    static String novedades;
    static int opcion;
    static String enter;
    static int cantidad = 0;
    static ArrayList<EntradaTaller> ingreso = new ArrayList<>();
    static ArrayList<SalidaTaller> salida = new ArrayList<>();

    //clase Main
    public static void main(String[] args){
        //Codigo menu
        do{
            System.out.println("""
                    --------------------Taller EL MAQUINISTA--------------------

                    1. Ingresar Motocicleta
                    2. Salida Motocilceta
                    9. Salir del sistema
                    """);
            opcion = num.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Bienvenido, primero ingrese la fecha del ingreso de la motocicleta: \nIngreselo de forma (AAAA-MM-DD)");
                    ingresoTaller = LocalDate.parse(text.nextLine(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                    System.out.println("Ingrese las observaciónes dadas por el cliente: ");
                    obsCliente = text.nextLine();
                    EntradaTaller inMoto = new EntradaTaller(ingresoTaller,obsCliente);
                    ingreso.add(inMoto);
                    cantidad ++;
                    System.out.println("\nUsted ingresó la motocicleta con fecha de: "+ingreso.get(cantidad-1).getIngresoTaller()+
                            " y con las siguientes observaciónes:\n"+ingreso.get(cantidad-1).getObsCliente()+"\n");
                    System.out.println("Presione enter para continuar");
                    enter = text.nextLine();
                    break;
                case 2:
                    if (cantidad == 0){
                        System.out.println("Debe ingresar al menos una motocicleta para poder registrar su salida");
                    }else{
                        System.out.println("Va a ingresar la salida de la motocicleta, primero ingrese la fecha de salida: \nIngreselo de forma (AAAA-MM-DD)");
                        salidaTaller = LocalDate.parse(text.nextLine(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                        System.out.println("Ingrese las novedades de la reparacion: ");
                        novedades = text.nextLine();
                        SalidaTaller outMoto = new SalidaTaller(salidaTaller,novedades);
                        salida.add(outMoto);
                        System.out.println("\nSe registró la salida de la motocicleta con fecha de: "+salida.get(cantidad-1).getSalidaTaller()+
                                " y con las siguientes novedades:\n"+salida.get(cantidad-1).getNovedades()+"\n");
                        System.out.println("Presione enter para continuar");
                        enter = text.nextLine();
                    }
                    break;
            }
        }while (opcion != 9);
    }
}
