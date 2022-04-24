package Punto1;

import java.util.Scanner;

public class Main {
    private static String apellidos;
    private static String nombre;

    public static void main(String[] args) {
        // write your code here
        System.out.println("Escriba su nombre");
        Scanner input = new Scanner(System.in);
        nombre = input.nextLine();

        System.out.println("Escriba sus apellidos");
        apellidos = input.nextLine();

        Persona persona = new Persona(nombre, apellidos);

        System.out.println(persona.getNombre()+" "+persona.getApellidos());
    }
}

class Persona {
    private String nombre;
    private String apellidos;

    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
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
}
