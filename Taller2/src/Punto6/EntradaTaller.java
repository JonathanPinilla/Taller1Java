package Punto6;

import java.time.LocalDate;

public class EntradaTaller {
    private LocalDate ingresoTaller;
    private String obsCliente;

    public EntradaTaller(LocalDate ingresoTaller, String obsCliente) {
        this.ingresoTaller = ingresoTaller;
        this.obsCliente = obsCliente;
    }

    public EntradaTaller() {
    }

    public LocalDate getIngresoTaller() {
        return ingresoTaller;
    }

    public void setIngresoTaller(LocalDate ingresoTaller) {
        this.ingresoTaller = ingresoTaller;
    }

    public String getObsCliente() {
        return obsCliente;
    }

    public void setObsCliente(String obsCliente) {
        this.obsCliente = obsCliente;
    }
}
