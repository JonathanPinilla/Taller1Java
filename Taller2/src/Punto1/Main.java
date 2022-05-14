package Punto1;

import java.util.Scanner;

public class Main {
    private static int edad;
    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese la edad de la persona");
        edad = Integer.parseInt(input.nextLine());

        EdadPersona primera = new EdadPersona(edad);

        if(primera.getEdad()>= 18){
            System.out.println("Usted es mayor de edad");
        }
    }
}

class EdadPersona {
    private int edad;

    public EdadPersona(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}