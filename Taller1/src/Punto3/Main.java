package Punto3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static String nombre;
    private static String apellidos;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Escriba su nombre: ");
        nombre = (input.nextLine());

        System.out.println("Escriba sus apellidos: ");
        apellidos = (input.nextLine());

        Persona hijo = new Persona(nombre, apellidos);

        System.out.println("Escriba el nombre de su padre: ");
        nombre = (input.nextLine());

        System.out.println("Escriba los apellidos de su padre: ");
        apellidos = (input.nextLine());

        Persona padre = new Persona(nombre, apellidos);

        System.out.println("Escriba el nombre de su madre: ");
        nombre = (input.nextLine());

        System.out.println("Escriba los apellidos de su madre: ");
        apellidos = (input.nextLine());

        Persona madre = new Persona(nombre, apellidos);

        System.out.println("Yo "+hijo.getNombre()+" "+hijo.getApellidos()+", soy hijo de "+
                madre.getNombre()+" "+madre.getApellidos()+" y "+
                padre.getNombre()+" "+padre.getApellidos());
    }
}

class Persona {
    private String nombre;
    private String apellidos;

    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }


    public  String getNombre() {return nombre;}

    public  void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public  String getApellidos() {
        return apellidos;
    }

    public  void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
}


