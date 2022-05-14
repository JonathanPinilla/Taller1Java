package Punto3;

public class Main {
    public static void main(String[] args){
        numerosPrimos();
    }

    public static void numerosPrimos(){
        //Primos
        int[] primos = new int[1000];
        int cont=0;
        int numPrimo = 0;
        for(int i = 1; i<1000;i++){
            cont = 0;
            for(int j = 1;j <= i;j++){
                if(i % j == 0){
                    cont++;
                }
            }
            if(cont == 2){
                primos[i] = i;
                System.out.println(primos[i]);
                numPrimo++;
            }
        }
        System.out.println("Son "+numPrimo+" números primos");
    }
}
