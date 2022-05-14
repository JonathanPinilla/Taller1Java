package Punto10;

public class CuentaBancaria {
    private String Titular;
    private float saldo;
    private int numCuenta;

    public CuentaBancaria(String titular, float saldo, int numCuenta) {
        Titular = titular;
        this.saldo = saldo;
        this.numCuenta = numCuenta;
    }

    public String getTitular() {
        return Titular;
    }

    public void setTitular(String titular) {
        Titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }
}
