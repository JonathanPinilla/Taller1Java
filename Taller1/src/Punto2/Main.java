package Punto2;

import java.util.Scanner;

public class Main {
    private static String nombre;
    private static String apellidos;
    private static int edad;
    private static float estatura;

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);

        System.out.println("Escriba su nombre");
        String nombre = input.nextLine();

        System.out.println("Escriba sus apellidos");
        apellidos = input.nextLine();

        System.out.println("Escriba su edad");
        edad = Integer.parseInt(input.nextLine());

        System.out.println("Escriba su estatura en metros");
        estatura = Float.parseFloat(input.nextLine());

        Persona persona = new Persona(nombre, apellidos, edad, estatura);
        System.out.println("-----------------------------------------------------");
        System.out.println("Nombre: "+persona.getNombre()+"\nApellidos: "+persona.getApellidos()+"\nEdad: "+persona.getEdad()+"\nEstatura: "+persona.getEstatura());
    }
}

class Persona {
    private String nombre;
    private String apellidos;
    private int edad;
    private float estatura;

    public Persona(String nombre, String apellidos, int edad, float estatura) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.estatura = estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }
}
