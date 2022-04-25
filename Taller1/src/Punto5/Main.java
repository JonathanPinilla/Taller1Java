package Punto5;

import java.util.Scanner;

public class Main {
    private static String nombreMascota;
    private static int edadMascota;
    private static String tipoMascota;
    private static String nombreOwner;
    private static String apellidoOwner;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Escriba el nombre de su mascota");
        nombreMascota = input.nextLine();
        System.out.println("Escriba la edad de su mascota");
        edadMascota = Integer.parseInt(input.nextLine());
        System.out.println("Escriba el tipo de mascota (perro, gato, etc)");
        tipoMascota = input.nextLine();
        System.out.println("Ingrese el nombre del dueño");
        nombreOwner = input.nextLine();
        System.out.println("Ingrese el apellido del dueño");
        apellidoOwner = input.nextLine();

        Mascota mascota = new Mascota(nombreMascota, edadMascota, tipoMascota, nombreOwner, apellidoOwner);

        System.out.println(mascota.getNombreMascota()+" es un(a) "+mascota.getTipoMascota()+", el cual, tiene "+mascota.getEdadMascota()+" años de edad y "+mascota.getNombreOwner()+" "+mascota.getApellidoOwner()+" es actualmente su dueño(a)");
    }



}

class Mascota{
    private String nombreMascota;
    private int edadMascota;
    private String tipoMascota;
    private String nombreOwner;
    private String apellidoOwner;

    public Mascota(String nombreMascota, int edadMascota, String tipoMascota, String nombreOwner, String apellidoOwner) {
        this.nombreMascota = nombreMascota;
        this.edadMascota = edadMascota;
        this.tipoMascota = tipoMascota;
        this.nombreOwner = nombreOwner;
        this.apellidoOwner = apellidoOwner;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public int getEdadMascota() {
        return edadMascota;
    }

    public void setEdadMascota(int edadMascota) {
        this.edadMascota = edadMascota;
    }

    public String getTipoMascota() {
        return tipoMascota;
    }

    public void setTipoMascota(String tipoMascota) {
        this.tipoMascota = tipoMascota;
    }

    public String getNombreOwner() {
        return nombreOwner;
    }

    public void setNombreOwner(String nombreOwner) {
        this.nombreOwner = nombreOwner;
    }

    public String getApellidoOwner() {
        return apellidoOwner;
    }

    public void setApellidoOwner(String apellidoOwner) {
        this.apellidoOwner = apellidoOwner;
    }
}

