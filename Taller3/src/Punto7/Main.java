package Punto7;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    static Scanner text = new Scanner(System.in);
    static Scanner num = new Scanner(System.in);
    static String enter;
    static ArrayList<Vehiculo> parqueadero = new ArrayList<>();
    static String placa;
    static String marca;
    static String nombreCliente;
    static long telefono;

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("""
                    ---Menú de usuario---
                                        
                    1. Agregar vehiculo
                    2. Consultar vehiculo
                    3. Sacar vehiculo
                                        
                    9. Salir del sistema
                    """);
            opcion = num.nextInt();
            switch (opcion) {
                case 1 -> {
                    agregarVehiculo();
                    System.out.println("\nPresione enter para continuar");
                    enter = text.nextLine();
                }
                case 2 -> {
                    buscarVehiculo();
                    System.out.println("\nPresione enter para continuar");
                    enter = text.nextLine();
                }
                case 3 -> {
                    eliminarVehiculo();
                    System.out.println("\nPresione enter para continuar");
                    enter = text.nextLine();
                }
            }
        } while (opcion != 9);

    }

    public static void agregarVehiculo() {
        boolean existe = false;
        if (parqueadero.size() >= 5) {
            System.out.println("El parqueadero está lleno");
        } else if (!parqueadero.isEmpty()) {
            System.out.print("\nIngrese la placa del vehiculo a ingresar: ");
            placa = text.nextLine();
            for (int i = 0; i < parqueadero.size() - 1; i++) {
                if (Objects.equals(parqueadero.get(i).getPlaca(), placa)) {
                    System.out.println("La placa ingresada ya está registrada, está en el parqueadero en el lugar " + i);
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                System.out.print("\nIngrese la marca del vehiculo a ingresar: ");
                marca = text.nextLine();
                System.out.print("\nIngrese el nombre del cliente del vehiculo a ingresar: ");
                nombreCliente = text.nextLine();
                System.out.print("\nIngrese el número de teléfono del cliente: ");
                telefono = num.nextLong();
                Vehiculo vehiculo = new Vehiculo(placa, marca, nombreCliente, telefono);
                parqueadero.add(vehiculo);
            }
        } else {
            System.out.print("\nIngrese la placa del vehiculo a ingresar: ");
            placa = text.nextLine();
            System.out.print("\nIngrese la marca del vehiculo a ingresar: ");
            marca = text.nextLine();
            System.out.print("\nIngrese el nombre del cliente del vehiculo a ingresar: ");
            nombreCliente = text.nextLine();
            System.out.print("\nIngrese el número de teléfono del cliente: ");
            telefono = num.nextLong();
            Vehiculo vehiculo = new Vehiculo(placa, marca, nombreCliente, telefono);
            parqueadero.add(vehiculo);

            System.out.println("\nVehiculo agregado correctamente al parqueadero");
        }
    }

    public static void buscarVehiculo() {
        boolean existe = false;
        if (!parqueadero.isEmpty()) {
            System.out.print("\nIngrese la placa del vehiculo a buscar en el parqueadero: ");
            placa = text.nextLine();
            for (int i = 0; i <= (parqueadero.size() - 1); i++) {
                if (Objects.equals(parqueadero.get(i).getPlaca(), placa)) {
                    System.out.println("\nLa placa ingresada está en el parqueadero en el lugar " + (i+1)
                            + "\nPlaca: " + parqueadero.get(i).getPlaca()
                            + "\nMarca: " + parqueadero.get(i).getMarca()
                            + "\nCliente/Propietario: " + parqueadero.get(i).getNombreCliente()
                            + "\nTeléfono de contacto: " + parqueadero.get(i).getTelefono());
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                System.out.println("\nEl vehiculo no se encuentra en el parqueadero");
            }
        } else {
            System.out.println("El parqueadero se encuentra vacio en este momento");
        }
    }

    public static void eliminarVehiculo() {
        boolean existe = false;
        int eliminar, indice;
        if (!parqueadero.isEmpty()) {
            System.out.print("\nIngrese la placa del vehiculo a sacar del parqueadero: ");
            placa = text.nextLine();
            for (int i = 0; i <= parqueadero.size() - 1; i++) {
                if (Objects.equals(parqueadero.get(i).getPlaca(), placa)) {
                    System.out.println("\nLa placa ingresada está en el parqueadero en el lugar " + (i+1)
                            + "\nEl vehiculo se va a retirar, ¿está seguro? (1 = si, 2 = no)");
                    eliminar = num.nextInt();
                    if (eliminar == 1) {
                        parqueadero.remove(i);
                        System.out.println("\nEl vehiculo ha sido retirado del parqueadero");
                    }
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                System.out.println("\nEl vehiculo no se encuentra en el parqueadero");
            }
        } else {
            System.out.println("El parqueadero se encuentra vacio en este momento");
        }
    }
}
