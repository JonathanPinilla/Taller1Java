package Punto7;

import java.util.Scanner;

public class Main {
    static Scanner num = new Scanner(System.in);
    public static void main(String[] args){
        int opcion;
        do{
            System.out.println("--------Cálculo del IMC (Indice de masa corporal)--------");
            System.out.println("Primero ingrese el peso en kilogramos de la persona (ingrese los decimales separados por comas): ");
            float masa = num.nextFloat();
            System.out.println("Ingrese la estatura en metros de la persona (ingrese los decimales separados por comas): ");
            float estatura = num.nextFloat();
            float indice = (float) Imc.IMC(masa,estatura);
            System.out.println("El indice de masa corporal de la persona es: "+indice);
            if(indice < 18.5){
                System.out.println("La persona se encuentra en bajo peso");
            }else if(indice >= 18.5 && indice < 25){
                System.out.println("La persona se encuentra en un peso normal");
            }else if(indice >= 25 && indice < 30){
                System.out.println("La persona se encuentra en sobrepeso");
            }else if(indice >= 30){
                System.out.println("La persona se encuentra en estado de obesidad");
            }

            System.out.println("\nSi de sea contiunar presione 1 y luego enter, si no, presione 9 y luego enter");
            opcion = num.nextInt();
        }while(opcion != 9);
    }
}
