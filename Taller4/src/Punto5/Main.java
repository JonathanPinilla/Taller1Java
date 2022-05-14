package Punto5;

import java.util.Scanner;

public class Main {
    static Scanner num = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        int opcion;
        do{
            elegir(crearMatriz());

            System.out.println("\n¿Desea continuar? (1 = si : 2 = no)");
            opcion = num.nextInt();
        }while(opcion!=2);
    }
    public static int[][] crearMatriz() {
        int[][] matriz = new int[10][10];

        System.out.print("Columnas ");
        for (int i = 0; i < 10; i++) {
                System.out.print("|    " + i + "    |");
        }
        System.out.print("\nFilas");
        System.out.println("");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 0) {
                    System.out.print("|   "+i+"   |");
                }
                matriz[i][j] = (i + 1) * (j + 1);
                System.out.print("| " + (i < 9 ? "0" + (i + 1) + " x " : (i + 1) + " x ") + ((j < 9 ? "0" + (j + 1) : (j + 1))) + " |");
            }
            System.out.println("");
        }

        return matriz;
    }

    public static void elegir(int[][] matriz){
        int fila, columna;

        System.out.print("Elija la fila del resultado que desea conocer: ");
        fila = num.nextInt();
        System.out.print("Elija la columna del resultado que desea conocer: ");
        columna = num.nextInt();

        System.out.println("El resultado es: "+matriz[fila][columna]);

    }
}
