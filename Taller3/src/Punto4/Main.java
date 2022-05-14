package Punto4;

import java.util.Scanner;

public class Main {
    static Scanner num = new Scanner(System.in);

    public static void main(String[] args) {
        tablas();
    }

    public static void tablas() {
        int opcion;
        do {
            System.out.println("""
                                    
                    ---Tablas de multiplicar---
                                    
                    Digite cual tabla es la que desea motrar:
                    """);
            opcion = num.nextInt();
            System.out.println("");
            for (int i = 1; i < 11; i++) {
                System.out.println(i + " X " + opcion + " = " + i * opcion);
            }

            System.out.println("Si quiere salir del programa escriba -1, si no escriba 0 y luego enter");
            opcion = num.nextInt();

            if (opcion == -1) {
                break;
            }
        } while (opcion != -1);
    }
}
