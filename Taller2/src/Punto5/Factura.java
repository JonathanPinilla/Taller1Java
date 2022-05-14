package Punto5;

import java.util.ArrayList;

public class Factura {
    private ArrayList<Productos> compra;
    private int precioTotal;

    public Factura(ArrayList<Productos> compra, int precioTotal) {
        this.compra = compra;
        this.precioTotal = precioTotal;
    }

    public ArrayList<Productos> getCompra() {
        return compra;
    }

    public void setCompra(ArrayList<Productos> compra) {
        this.compra = compra;
    }

    public int getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }
}
