package Punto2;

public class Main {
    public static void main(String[] args) {
        arreglo();
    }

    public static void arreglo() {
        int[] numeros = new int[20];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * (100 - 1 + 1) + 1);
        }
        System.out.print("\nNúmeros pares: ");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.print(" "+numeros[i]);
            }
        }
        System.out.print("\nNúmeros impares: ");
        for (int i= 0; i<numeros.length; i++){
            if (numeros[i] % 2 != 0) {
                System.out.print(" "+numeros[i]);
            }
        }
    }
}
