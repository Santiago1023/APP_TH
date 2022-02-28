package Modelo;

public class ARL {

    protected String nombre;
    protected String tipoAfiliacion;

    public ARL(String nombre, String tipoAfiliacion) {
        this.nombre = nombre;
        this.tipoAfiliacion = tipoAfiliacion;
    }

    @Override
    public String toString() {
        return "ARL{" + "nombre=" + nombre + ", tipoAfiliacion=" + tipoAfiliacion + '}';
    }
    
}
