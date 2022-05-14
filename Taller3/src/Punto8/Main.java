package Punto8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    static Scanner text = new Scanner(System.in);
    static Scanner num = new Scanner(System.in);
    static String enter;
    static ArrayList<Estudiante> estudiante = new ArrayList<>();
    static String nombre;
    static boolean aprueba;
    static LocalDate fechaIngreso;
    static int indice;

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("""
                                        
                    ---Menú---
                                        
                    1. Registrar estudiante
                    2. Consultar estidiantes
                                        
                    9. Salir
                                        
                    """);
            opcion = num.nextInt();
            switch (opcion) {
                case 1:
                    regEstudiante();
                    System.out.println("\nPresione enter para continuar");
                    enter = text.nextLine();
                    break;
                case 2:
                    if(buscarRegistrado()){
                        System.out.println("El estudiante "+estudiante.get(indice).getNombre());
                        if (estudiante.get(indice).getAprueba()){
                            System.out.println("Finalizo el curso y lo aprobó, su fecha de ingreso fue: "+estudiante.get(indice).getFehcaIngreso());
                        }else{
                            System.out.println("Finalizo el curso y lo NO aprobó, su fecha de ingreso fue: "+estudiante.get(indice).getFehcaIngreso());
                        }
                    }else{
                        System.out.println("\nNo hay estudiantes registados");
                    }
                    System.out.println("\nPresione enter para continuar");
                    enter = text.nextLine();
                    break;
                case 9:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("\nOpción incorrecta");
                    break;
            }
        } while (opcion != 9);
    }

    public static void regEstudiante() {

        if (!estudiante.isEmpty()) {
            if (estudiante.size() == 8) {
                System.out.println("No se pueden agregar más estudiantes");
            } else if (!buscarRegistrado()) {
                System.out.print("\nEscriba true si el estudiante aprobó el curso, de lo contraro escriba false: ");
                aprueba = num.nextBoolean();
                System.out.print("\nIngrese la fecha de registro del estudiante: (formato: AAAA-MM-DD en números): ");
                fechaIngreso = LocalDate.parse(text.nextLine());
                Estudiante estudianted = new Estudiante(nombre, aprueba, fechaIngreso);
                estudiante.add(estudianted);
            }else {
                System.out.println("El estudiante ya se encuentra registrado");
            }

        } else {
            System.out.print("\nIngrese el nombre del estudiante a registrar: ");
            nombre = text.nextLine();
            System.out.print("\nEscriba true si el estudiante aprobó el curso, de lo contraro escriba false: ");
            aprueba = num.nextBoolean();
            System.out.print("\nIngrese la fecha de registro del estudiante: (formato: AAAA-MM-DD en números): ");
            fechaIngreso = LocalDate.parse(text.nextLine());
            Estudiante estudianted = new Estudiante(nombre, aprueba, fechaIngreso);
            estudiante.add(estudianted);
        }
    }

    public static boolean buscarRegistrado() {
        boolean existe = false;
        if(!estudiante.isEmpty()){
            System.out.print("\nIngrese el nombre del estudiante: ");
            nombre = text.nextLine();
            for (int i = 0; i <= estudiante.size() - 1; i++) {
                if (Objects.equals(estudiante.get(i).getNombre(), nombre)) {
                    existe = true;
                    indice = i;
                    break;
                }
            }
        }

        return existe;
    }
}
