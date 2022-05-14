package Punto9;

import java.sql.SQLOutput;

public class CalculoArea {
    private static float area;


    public static void areaRectangulo(float ladoA, float ladoB) {
        if (ladoA == ladoB) {
            area = ladoA * ladoB;
            System.out.println("El area del rectangulo de lados: " + ladoA + " es: " + area);
        } else {
            area = ladoA + ladoB;
            System.out.println("El area del rectangulo de base: " + ladoA + " y altura: " + ladoB + " es: " + area);
        }
    }

    public static void areaTriEquilatero(float ladoA) {
        area = (float) ((Math.cbrt(3) / 4) * (Math.pow(ladoA, 2)));
        System.out.println("El area de un triángulo equilatero cuyos lados son de longitud: " + ladoA + " es: " + area);
    }

    public static void areaTriIsoseles(float ladoA, float ladoB) {
        area = (float) ((ladoB * Math.sqrt(Math.pow(ladoA, 2) - (Math.pow(ladoB, 2) / 4))) / 2);
        System.out.println("El triángulo isóceles de lados iguales" + ladoA
                + " y lado diferente: " + ladoB
                + " tiene un area de: " + area);
    }

    public static void areaTriEscalenoHeron(float ladoA, float ladoB, float ladoC) {
        double s = Math.sqrt((ladoA + ladoB + ladoC) / 2);
        if ((s - ladoA) > 0 || (s - ladoB) > 0 || (s - ladoC) > 0) {
            area = (float) Math.sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC));
            System.out.println("El triángulo de lados a: " + ladoA +
                    " b: " + ladoB +
                    " c: " + ladoC +
                    " tiene un area de : " + area);
        } else {
            System.out.println("A este triángulo no se le puede realizar el cálculo de area mediente la fórmula de Herón");
        }
    }

    public static void areaTriEscaleno(float base, float altura) {
        area = (base * altura) / 2;
        System.out.println("El triangulo de altura: " + altura +
                " y de base: " + base +
                " tiene un area de: " + area);
    }

    public static void areaCirculo(float radio) {
        area = (float) (Math.PI * Math.pow(radio, 2));
        System.out.println("El area de circulo con radio: " + radio + " es: " + area);
    }

    public static void areaTrapecio(float ladoAncho, float ladoCorto, float altura) {
        area = (float) (((ladoAncho + ladoCorto) * altura) / 2);
        System.out.println("El area del trapecio con lado ancho: " + ladoAncho +
                " lado corto: " + ladoCorto +
                " y altura: " + altura + " es: " + area);
    }

}
