package Punto1;

import java.util.Scanner;

public class Main {
    static Scanner num = new Scanner(System.in);

    public static void main(String[] args) {
        arreglo();
    }

    public static void arreglo() {
        int[] arreglo = new int[5];
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese el " + (i + 1) +"° número al arreglo");
            arreglo[i] = num.nextInt();
        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("[" + i + "] = " + arreglo[i]);
        }
    }
}
