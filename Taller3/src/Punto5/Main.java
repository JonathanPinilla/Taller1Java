package Punto5;

import java.util.Scanner;

public class Main {
    static Scanner num = new Scanner(System.in);
    static Scanner text = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int opcion;
        String nombre = "";
        String enter;
        do {
            System.out.println("""
                    Menú de usuario
                    1. Captura de nombre
                    2. Saludar persona
                    3. Salir del sistema
                    """);
            opcion = num.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("\nIngrese su nombre: ");
                    nombre = text.nextLine();
                    System.out.println("\nPresione enter para continuar");
                    enter = text.nextLine();
                    break;
                case 2:
                    if (nombre != "") {
                        System.out.println("Hola " + nombre);
                        System.out.println("\nPresione enter para continuar");
                        enter = text.nextLine();

                    } else {
                        System.out.println("Primero debe ingresar su nombre");
                        System.out.println("\nPresione enter para continuar");
                        enter = text.nextLine();

                    }
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
            }
        } while (opcion != 3);
    }
}
