public class Persona {
    protected String nombre;
    protected String apellido;
    protected String id;
    protected String pais;

    public Persona(String nombre, String apellido, String id, String pais) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", pais=" + pais + '}';
    }
    
    
}
