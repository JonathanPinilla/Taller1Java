package Punto7;

import static java.lang.Math.pow;

public class Imc {
    private float masa;
    private float estatura;
    private float imc;

    public static double IMC(float masa, float estatura){
        //System.out.println("\n------------------Cálculo del IMC (Indice de masa corporal)\n");
        double imc = masa/(pow(estatura,2));
        return imc;
    }
}
