package Punto10;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner num = new Scanner(System.in);
    public static Scanner text = new Scanner(System.in);
    public static String Titular;
    public static float saldo;
    public static int numCuenta;
    public static String enter;


    static CuentaBancaria cliente1 = new CuentaBancaria("Jonathan Pinilla", 350000, 1);
    static CuentaBancaria cliente2 = new CuentaBancaria("Maria Medina", 1837500, 2);
    static CuentaBancaria cliente3 = new CuentaBancaria("Sabra Forero", 1003000, 3);

    public static ArrayList<CuentaBancaria> cuentas = new ArrayList<>();


    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        cuentas.add(cliente1);
        cuentas.add(cliente2);
        cuentas.add(cliente3);
        int opcion;
        do {
            System.out.println("""
                    ---Su Banco Amigo---
                                    
                    1. Ingresar dinero
                    2. Consultar saldo
                    3. Retirar dinero
                                    
                    9. Salir
                    """);
            opcion = num.nextInt();
            int indice;
            switch (opcion) {
                case 1:
                    System.out.print("\nIngrese el número de cuenta al que desea ingresarle dinero: ");
                    numCuenta = num.nextInt();

                    indice = getIndice(numCuenta);

                    if (indice != -1) {
                        System.out.println("Digite el valor a ingresar en la cuenta #" + cuentas.get(indice).getNumCuenta());
                        saldo = num.nextFloat();
                        if (saldo > 0) {
                            cuentas.get(indice).setSaldo(cuentas.get(indice).getSaldo() + saldo);
                            System.out.println("El saldo final en su cuenta es: " + cuentas.get(indice).getSaldo());
                        } else {
                            System.out.println("El valor ingresado es inválido debe ser mayor a 0 o el valor ingresado es mayor al saldo dispobible");
                        }
                    } else {
                        System.out.println("La cuenta solicitada no existe");
                    }
                    System.out.println("Presione enter para continuar");
                    enter = text.nextLine();
                    break;
                case 2:
                    System.out.print("\nIngrese el número de cuenta al que desea consultar el saldo: ");
                    numCuenta = num.nextInt();

                    indice = getIndice(numCuenta);

                    if (indice != -1) {
                        System.out.println("\n---Datos de la cuenta---" +
                                "\nNumero de cuenta: " + cuentas.get(indice).getNumCuenta() +
                                "\nTitular: " + cuentas.get(indice).getTitular() +
                                "\nSaldo: " + cuentas.get(indice).getSaldo());
                    } else {
                        System.out.println("La cuenta solicitada no existe");
                    }
                    System.out.println("Presione enter para continuar");
                    enter = text.nextLine();
                    break;
                case 3:
                    System.out.print("\nIngrese el número de cuenta al que desea retirar dinero: ");
                    numCuenta = num.nextInt();

                    indice = getIndice(numCuenta);

                    if (indice != -1) {
                        System.out.println("Digite el valor a retirar en la cuenta #" + cuentas.get(indice).getNumCuenta());
                        saldo = num.nextFloat();
                        if (saldo > 0 && saldo <= cuentas.get(indice).getSaldo()) {
                            cuentas.get(indice).setSaldo(cuentas.get(indice).getSaldo() - saldo);
                            System.out.println("El saldo restante en su cuenta es: " + cuentas.get(indice).getSaldo());
                        } else {
                            System.out.println("El valor ingresado es inválido debe ser mayor a 0");
                        }
                    } else {
                        System.out.println("La cuenta solicitada no existe");
                    }
                    System.out.println("Presione enter para continuar");
                    enter = text.nextLine();
                    break;
            }
        } while (opcion != 9);
    }

    public static int getIndice(int numCuenta) {
        int indice = -1;
        for (int i = 0; i < cuentas.size(); i++) {
            if (cuentas.get(i).getNumCuenta() == numCuenta) {
                indice = i;
                break;
            }
        }
        return indice;
    }
}