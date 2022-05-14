package Punto8;

import java.time.LocalDate;

public class Estudiante {
    private String nombre;
    private boolean aprueba;
    private LocalDate fehcaIngreso;

    public Estudiante(String nombre, boolean aprueba, LocalDate fehcaIngreso) {
        this.nombre = nombre;
        this.aprueba = aprueba;
        this.fehcaIngreso = fehcaIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getAprueba() {
        return aprueba;
    }

    public void setAprueba(boolean aprueba) {
        this.aprueba = aprueba;
    }

    public LocalDate getFehcaIngreso() {
        return fehcaIngreso;
    }

    public void setFehcaIngreso(LocalDate fehcaIngreso) {
        this.fehcaIngreso = fehcaIngreso;
    }
}
