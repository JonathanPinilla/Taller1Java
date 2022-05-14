package Punto9;

import java.util.Scanner;

public class Main {
    public static Scanner num = new Scanner(System.in);
    public static Scanner text = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int opcion;
        String enter;
        do {
            System.out.println("""
                    -----Menu cálculo de area-----
                                        
                    1. Area de un rectangulo
                    2. Area de un triángulo equilatero
                    3. Area de un triángulo isóceles
                    4. Area de un triángulo escaleno fórmula de Herón
                    5. Area de un triángulo con base y altura conocida o rectángulo
                    6. Area de un circulo
                    7. Area de un trapecio
                                        
                    9. Salir del sistema
                                        
                                        
                    """);
            opcion = num.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("\n---Area de un rectangulo---\nDigite la base: ");
                    float base = num.nextFloat();
                    System.out.print("\nDigite la altura: ");
                    float altura = num.nextFloat();
                    CalculoArea.areaRectangulo(base, altura);
                    System.out.println("\nPresione enter para continuar");
                    enter = text.nextLine();
                    break;
                case 2:
                    System.out.print("\n---Area de un triángulo equilatero---" +
                            "\nDigite uno de los lados del triángulo: ");
                    float lado = num.nextFloat();
                    CalculoArea.areaTriEquilatero(lado);
                    System.out.print("\nPresione enter para continuar");
                    enter = text.nextLine();
                    break;
                case 3:
                    System.out.print("\n---Area de un triángulo isóceles---" +
                            "\nDigite uno de los lados que son iguales del triángulo: ");
                    float lados = num.nextFloat();
                    System.out.print("\nDigite la base o el lado diferente del triángulo: ");
                    lado = num.nextFloat();
                    CalculoArea.areaTriIsoseles(lados, lado);
                    System.out.print("\nPresione enter para continuar");
                    enter = text.nextLine();
                    break;
                case 4:
                    System.out.print("\n---Area de un triángulo escaleno fórmula de Herón---" +
                            "\nDigite el primer lado del triángulo: ");
                    float lado1 = num.nextFloat();
                    System.out.print("\nDigite el segundo lado del triángulo: ");
                    float lado2 = num.nextFloat();
                    System.out.print("\nDigite el tercer lado del triámgulo: ");
                    float lado3 = num.nextFloat();
                    CalculoArea.areaTriEscalenoHeron(lado1, lado2, lado3);
                    System.out.print("\nPresione enter para continuar");
                    enter = text.nextLine();
                    break;
                case 5:
                    System.out.print("\n---Area de un triángulo escaleno con base y altura conocidos o triángulo rectangulo---" +
                            "\nDigite la base del triángulo: ");
                    base = num.nextFloat();
                    System.out.print("\nDigite la altura del triángulo: ");
                    altura = num.nextFloat();
                    CalculoArea.areaTriEscaleno(base, altura);
                    System.out.print("\nPresione enter para continuar");
                    enter = text.nextLine();
                    break;
                case 6:
                    System.out.print("\n---Area de un circulo---" +
                            "\nDigite el radio del circulo: ");
                    float radio = num.nextFloat();
                    CalculoArea.areaCirculo(radio);
                    System.out.print("\nPresione enter para continuar");
                    enter = text.nextLine();
                    break;
                case 7:
                    System.out.print("\n---Area de un trapecio---" +
                            "\nDigite el lado ancho: ");
                    float ladoAncho = num.nextFloat();
                    System.out.print("\nDigite el lado paralelo al anterior que es de menor tamaño: ");
                    float ladoCorto = num.nextFloat();
                    System.out.print("\nDigite la altura del trapecio: ");
                    altura = num.nextFloat();
                    CalculoArea.areaTrapecio(ladoAncho,ladoCorto,altura);
                    System.out.print("\nPresione enter para continuar");
                    enter = text.nextLine();
                    break;
            }
        } while (opcion != 9);
    }
}
