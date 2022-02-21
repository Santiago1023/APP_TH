public class EPS {

    protected String nombre;
    protected String tipoAfiliacion;

    public EPS(String nombre, String tipoAfiliacion) {
        this.nombre = nombre;
        this.tipoAfiliacion = tipoAfiliacion;
    }

    @Override
    public String toString() {
        return "EPS{" + "nombre=" + nombre + ", tipoAfiliacion=" + tipoAfiliacion + '}';
    }
    
    
}
