package Punto2;

public class Main {
    public static void main(String[] args) {
        triangulo();
    }

    public static void triangulo() {
        for (int i = 0; i < 10; i++) {
            for (int k = 10; k > i; k--) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }
}
