package Punto6;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    static Scanner text = new Scanner(System.in);
    static Scanner num = new Scanner(System.in);
    static String enter;
    static ArrayList<Contactos> contactos = new ArrayList<>();
    static String nombre;
    static long telefono = 0;
    static String organizacion;

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {

        int opcion;

        do {
            System.out.println("""
                    ---Menú de usuario---
                                        
                    1. Agregar contacto
                    2. Consultar contactos
                    3. Eliminar contactos
                                        
                    9. Salir del sistema
                    """);
            opcion = num.nextInt();
            switch (opcion) {
                case 1:
                    if (contactos.size() >= 3) {
                        System.out.println("La libreta de contactos ya se encuentra llena");
                    } else if (!contactos.isEmpty()) {
                        existeAgegar();
                    } else {
                        System.out.print("\nIngrese el nombre del nuevo contacto: ");
                        nombre = text.nextLine();
                        System.out.print("\nIngrese el número de teléfono: ");
                        telefono = num.nextLong();
                        System.out.print("\nIngrese el nombre de la organización del nuevo contacto: ");
                        organizacion = text.nextLine();
                        Contactos contacto = new Contactos(nombre, telefono, organizacion);
                        contactos.add(contacto);
                        System.out.println("Contacto agregado correctamente");
                    }
                    System.out.println("\nPresione enter para continuar");
                    enter = text.nextLine();
                    break;
                case 2:
                    if (!contactos.isEmpty()) {
                        for (int i = 0; i < contactos.size(); i++) {
                            System.out.println((i + 1) + ". \nNombre: " + contactos.get(i).getNombre()
                                    + " \nTeléfono: " + contactos.get(i).getTelefono()
                                    + " \nOrganización: " + contactos.get(i).getOrganizacion());
                            System.out.println("____________________");
                        }
                    } else {
                        System.out.println("La lista de contactos está vacia");
                    }
                    System.out.println("\nPresione enter para continuar");
                    enter = text.nextLine();
                    break;
                case 3:
                    if (!contactos.isEmpty()) {
                        existeEliminar();
                    }else{
                        System.out.println("La lista de contactos está vacia");
                    }
                    System.out.println("\nPresione enter para continuar");
                    enter = text.nextLine();
                    break;
            }
        } while (opcion != 9);
    }

    public static void existeAgegar() {
        boolean existe = false;
        System.out.print("\nIngrese el nombre del nuevo contacto: ");
        nombre = text.nextLine();
        for (int i = 0; i <= contactos.size() - 1; i++) {
            if (Objects.equals(contactos.get(i).getNombre(), nombre)) {
                System.out.println("El nombre de contacto ya se encuentra en la libreta de contactos");
                existe = true;
                break;
            } else {
                existe = false;
            }
        }
        if (!existe) {
            System.out.print("\nIngrese el número de teléfono: ");
            telefono = num.nextLong();
            for (int i = 0; i <= contactos.size() - 1; i++) {
                if (contactos.get(i).getTelefono() == telefono) {
                    System.out.println("El número de contacto ya se encuentra en la libreta de contactos");
                    existe = true;
                    break;
                } else {
                    existe = false;
                }
            }
        }
        if (!existe) {
            System.out.print("\nIngrese el nombre de la organización del nuevo contacto: ");
            organizacion = text.nextLine();
            Contactos contacto = new Contactos(nombre, telefono, organizacion);
            contactos.add(contacto);
            System.out.println("Contacto agregado correctamente");
        }
    }

    public static void existeEliminar() {
        System.out.print("\nIngrese el nombre del contacto que desea eliminar: ");
        nombre = text.nextLine();
        for (int i = 0; i <= contactos.size() - 1; i++) {
            if (Objects.equals(contactos.get(i).getNombre(), nombre)) {
                int indice = i;
                System.out.println("Contacto nombre: " + contactos.get(i).getNombre()
                        + "\nTeléfono: " + contactos.get(i).getTelefono()
                        + "\nOrganización: " + contactos.get(i).getOrganizacion());
                System.out.println("¿Está seguro de eliminar el contacto? (1 = si, 2 = no");
                int elimina = num.nextInt();
                if (elimina == 1) {
                    contactos.remove(indice);
                    System.out.println("\nEl contacto se elimino correctamente");
                }
                break;
            } else {
                System.out.println("El contacto no existe");
            }
        }
    }
}
