package Punto3;

import java.util.Scanner;

public class Main {
    private static String nombre;
    private static String apellidos;
    private static int edad;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        comprobarNombre();
    }

    private static void comprobarNombre() {
        System.out.println("Ingrese su nombre");
        nombre = input.nextLine();

        System.out.println("Ingrese sus apellidos");
        apellidos = input.nextLine();

        System.out.println("Digite su edad");
        edad = input.nextInt();

        PersonaFiesta persona = new PersonaFiesta(nombre, apellidos, edad);

        if(persona.getEdad() >= 18) {
            System.out.println(persona.getNombre() + " " + persona.getApellidos() + " usted es mayor de edad, por lo tanto puede entrar a la fiesta.");
        }else{
            System.out.println(persona.getNombre() + " " + persona.getApellidos() +" usted es menor de edad, por lo tanto, no puede entrar a la fiesta, por favor devuélvase a su casa.");
        }
    }
}

