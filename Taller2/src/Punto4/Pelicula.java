package Punto4;

public class Pelicula {
    private String titulo;
    private Boolean disponible;
    private String novedad;

    public Pelicula(String titulo, Boolean disponible, String novedad) {
        this.titulo = titulo;
        this.disponible = disponible;
        this.novedad = novedad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

    public String getNovedad() {
        return novedad;
    }

    public void setNovedad(String novedad) {
        this.novedad = novedad;
    }
}
