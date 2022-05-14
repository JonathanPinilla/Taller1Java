package Punto8;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //variables globales
    public static Scanner num = new Scanner(System.in);
    public static Scanner text = new Scanner(System.in);

    public static Pastel torta;
    public static int disponibilidad = 10;
    public static int opcion;
    public static String enter;
    public static ArrayList<Pastel> ventas = new ArrayList<>();

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {  //metodo menu
        do {
            System.out.println("""
                    ----------Pastelero Don Carlos----------
                                        
                    Menú
                    1. Registrar pedido
                    2. Tortas disponibles
                    3. Ventas del día
                    9. Salir (terminar día)
                                        
                    """);
            opcion = num.nextInt();
            switch (opcion) {
                case 1:
                    ventas.add(pasteles());
                    break;
                case 2:
                    System.out.println("\nEn el momento quedan disponibles " + disponibilidad + " pasteles para pedidos el dia de hoy\n" +
                            "\nPresione enter para continuar");
                    enter = text.nextLine();
                    break;
                case 3:
                    if (ventas.size() < 1) {
                        System.out.println("Aún no ha registrado ningún pedido" +
                                "\nPresione enter para continuar");
                        enter = text.nextLine();
                    } else {
                        System.out.println("Pedidos del día");
                        System.out.println("\nSe han vendido " + ventas.size() + " pasteles el día de hoy");
                        for (int i = 0; i < ventas.size(); i++) {
                            System.out.println("_________________________________________________________");
                            System.out.println((i + 1) + ". Sabor: " + ventas.get(i).getSabor()
                                    + " || porciones: " + ventas.get(i).getPorciones()
                                    + " || decoración: " + ventas.get(i).getDecoracion());
                            System.out.println("_________________________________________________________");
                        }
                        System.out.println("\nPresione enter para continuar");
                        enter = text.nextLine();
                    }
                    break;
                case 9:
                    System.out.println("----------Pastelero Don Carlos----------" +
                            "\n\n_______Día Finalizado_______");
                    break;
            }
        } while (opcion != 9);
    }

    public static Pastel pasteles() {    //metodo pasteles
        String sabor;
        int porciones;
        String decoracion;

        System.out.print("\nIngrese el sabor de la torta: ");
        sabor = text.nextLine();
        System.out.print("\nDigite cuantas porciones tiene: ");
        porciones = num.nextInt();

        while (porciones <= 0) {
            System.out.print("\nEl valor digitado es inválido, por favor ingrese un número mayor a 0");
            porciones = num.nextInt();
        }

        System.out.print("\nEscriba que decoracion se solicitó: ");
        decoracion = text.nextLine();

        torta = new Pastel(sabor, porciones, decoracion);

        System.out.println("Se ha registrado su pedido" +
                "\nPresione enter para continuar");
        enter = text.nextLine();

        disponibilidad--;
        return torta;
    }

}
