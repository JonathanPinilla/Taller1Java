package Punto8;

public class Pastel {
    private String sabor;
    private int porciones;
    private String decoracion;

    public Pastel(String sabor, int porciones, String decoracion) {
        this.sabor = sabor;
        this.porciones = porciones;
        this.decoracion = decoracion;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public int getPorciones() {
        return porciones;
    }

    public void setPorciones(int porciones) {
        this.porciones = porciones;
    }

    public String getDecoracion() {
        return decoracion;
    }

    public void setDecoracion(String decoracion) {
        this.decoracion = decoracion;
    }
}
