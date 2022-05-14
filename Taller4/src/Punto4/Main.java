package Punto4;

public class Main {
    static int[][] matriz = new int[4][5];

    public static void main(String[] args) {
        quemarMatriz();
        mostrar();
    }

    public static void quemarMatriz() {
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[0][3] = 4;
        matriz[0][4] = 5;
        matriz[1][0] = 6;
        matriz[1][1] = 7;
        matriz[1][2] = 8;
        matriz[1][3] = 9;
        matriz[1][4] = 10;
        matriz[2][0] = 11;
        matriz[2][1] = 12;
        matriz[2][2] = 13;
        matriz[2][3] = 14;
        matriz[2][4] = 15;
        matriz[3][0] = 16;
        matriz[3][1] = 17;
        matriz[3][2] = 18;
        matriz[3][3] = 18;
        matriz[3][4] = 20;
    }

    public static void mostrar() {
        for (int filas = 0; filas < 4; filas++) {
            if (filas % 2 == 0) {
                for (int columnas = 0; columnas < 5; columnas++) {
                    System.out.print((matriz[filas][columnas] <= 9 ? "0" + matriz[filas][columnas] : matriz[filas][columnas]) + " ");
                }
            }
            if (filas % 2 != 0) {
                for (int columnas = 4; columnas >= 0; columnas--) {
                    System.out.print((matriz[filas][columnas] <= 9 ? "0" + matriz[filas][columnas] : matriz[filas][columnas]) + " ");
                }
            }
            System.out.println("");
        }
    }
}
