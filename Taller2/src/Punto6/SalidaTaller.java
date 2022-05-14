package Punto6;


import java.time.LocalDate;

public class SalidaTaller {
    private LocalDate salidaTaller;
    private String novedades;

    public SalidaTaller(LocalDate salidaTaller, String novedades) {
        this.salidaTaller = salidaTaller;
        this.novedades = novedades;
    }

    public LocalDate getSalidaTaller() {
        return salidaTaller;
    }

    public void setSalidaTaller(LocalDate salidaTaller) {
        this.salidaTaller = salidaTaller;
    }

    public String getNovedades() {
        return novedades;
    }

    public void setNovedades(String novedades) {
        this.novedades = novedades;
    }
}
