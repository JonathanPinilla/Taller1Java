package Punto7;

public class Vehiculo {
    private String placa;
    private String marca;
    private String nombreCliente;
    private long telefono;

    public Vehiculo(String placa, String marca, String nombreCliente, long telefono) {
        this.placa = placa;
        this.marca = marca;
        this.nombreCliente = nombreCliente;
        this.telefono = telefono;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
}
