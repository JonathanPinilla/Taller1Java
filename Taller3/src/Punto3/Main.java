package Punto3;

public class Main {
    public static void main(String[] args) {
        arbol();
    }

    public static void arbol() {
        for (int i = 0; i < 16; i++) {

            if (i < 12) {
                for (int k = 11; k > i; k--) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                    if (j > 0) {
                        System.out.print("*");
                    }
                }
            }

            if (i >= 12) {
                for (int k = 11; k > i - 11; k--) {
                    if (i - 12 < 1 && k == 10) {
                        System.out.print("");
                    } else {
                        System.out.print(" ");
                    }
                }
                for (int j = 0; j < i - 11; j++) {
                    System.out.print("*");
                    if (i - 12 < 1) {
                        System.out.print("**");
                    }
                    if (j > 0) {
                        System.out.print("*");
                    }
                }
            }
            System.out.println("");
        }
    }
}
