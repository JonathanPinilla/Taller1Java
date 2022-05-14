package Punto6;

public class Contactos {
    private String nombre;
    private Long telefono;
    private String organizacion;

    public Contactos(String nombre, Long telefono, String organizacion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.organizacion = organizacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public String getOrganizacion() {
        return organizacion;
    }

    public void setOrganizacion(String organizacion) {
        this.organizacion = organizacion;
    }
}
