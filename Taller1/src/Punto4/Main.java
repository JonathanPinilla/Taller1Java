package Punto4;

import java.util.Scanner;

public class Main {
    private static String ciudad;
    private static String pais;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la ciudad");
        ciudad = input.nextLine();
        System.out.println("Ingrese el nombre del país");
        pais = input.nextLine();

        Capitales ciudad1 = new Capitales(ciudad, pais);

        System.out.println("La ciudad "+ciudad1.getCiudad()+", es la capital del país "+ciudad1.getPais());
    }


}

class Capitales {
    private String ciudad;
    private String pais;

    public Capitales(String ciudad, String pais) {
        this.ciudad = ciudad;
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}