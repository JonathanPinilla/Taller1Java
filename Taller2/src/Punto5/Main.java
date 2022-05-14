package Punto5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //Definición de variables
    static Scanner num = new Scanner(System.in);
    static Scanner text = new Scanner(System.in);

    static String nombre;
    static int precio;
    static String descripcion;
    static ArrayList<Productos> productList = new ArrayList<>();
    static ArrayList<Productos> factura = new ArrayList<>();
    static String enter;
    static int pregunta = 0;
    static int precioTotal = 0;
    static String devolucion;

    public static void main(String[] args) {
        //Creación de los primeros 3 objetos
        Productos producto1 = new Productos("Acetaminophen",20400,"Analgésico, Antipirético");
        Productos producto2 = new Productos("Protector Solar",128400,"Sunsaid Plus SPF 50+ caja con frasco con 100G");
        Productos producto3 = new Productos("Dulcolax",22750,"Bisacolido Caja con 20 grageas");
        productList.add(producto1);
        productList.add(producto2);
        productList.add(producto3);

        int opcion;
        //Menú inicial
        do {
            if(pregunta == 0){
                System.out.println("-----------Menú de usuario-----------\n" +
                        "1. Comprar productos\n" +
                        "2. Consultar Productos\n" +
                        "3. Devoluciónes\n" +
                        "9. Salir del sistema\n" +
                        "_____________________________________________");
                opcion = num.nextInt();
            }else{
                opcion = pregunta;
            }

            switch(opcion){
                case 1:
                    System.out.println("Elija el producto a comprar");
                    for(int i = 0; i < productList.size(); i++){
                        System.out.println(i+1 + ". "+productList.get(i).getNombre()+
                                " precio: "+ productList.get(i).getPrecio());
                    }
                    opcion = num.nextInt();
                    opcion --;
                    System.out.println("Usted añadió el producto: "+productList.get(opcion).getNombre()+
                            " por un precio de: "+productList.get(opcion).getPrecio()+"\n");
                    precioTotal += productList.get(opcion).getPrecio();
                    factura.add(productList.get(opcion));
                    Factura factura1 = new Factura(factura, precioTotal);

                    System.out.println("¿Quiere comprar más productos? \n1.Si \n2.No");
                    pregunta = num.nextInt();
                    if(pregunta == 1) {
                        opcion = 1;
                    }else{
                        pregunta = 0;
                        opcion = 0;
                        System.out.println("Su factura es la siguiente: ");
                        for(int i = 0; i < factura1.getCompra().size(); i++){
                            System.out.println("Articulo: "+factura1.getCompra().get(i).getNombre()+" - Precio: "
                                    +factura1.getCompra().get(i).getPrecio()+" - Descripción: "
                                    +factura1.getCompra().get(i).getDescripcion());
                        }
                        factura.clear();
                        System.out.println("Valor total de la compra: "+factura1.getPrecioTotal());
                        System.out.println("\nPresione enter para continuar...");
                        enter = text.nextLine();
                    }

                    break;
                case 2:
                    for(int i = 0; i < productList.size(); i++) {
                        System.out.println("Producto: " + productList.get(i).getNombre()
                                + " Precio: " + productList.get(i).getPrecio()
                                + " Descripción: " + productList.get(i).getDescripcion());
                    }
                    System.out.println("\nPresione enter para continuar...");
                    enter = text.nextLine();
                    break;
                case 3:
                    System.out.println("Elija el producto a devolver");
                    for(int i = 0; i < productList.size(); i++){
                        System.out.println(i+1 + ". "+productList.get(i).getNombre());
                    }
                    opcion = num.nextInt();
                    opcion --;
                    System.out.println("Ingrese la razón de la devolución");
                    devolucion = text.nextLine();
                    System.out.println("Usted devolvió del producto "+productList.get(opcion).getNombre()
                            +" por la siguiente razón: "+devolucion);
                    System.out.println("\nPresione enter para continuar...");
                    enter = text.nextLine();
                    break;
            }
        }while(opcion!=9);

    }
}
