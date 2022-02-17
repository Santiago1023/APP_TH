public abstract class Persona {

    protected String nombre;
    protected String apellido;
    protected String id;
    protected String pais;
    protected FondoPension fondoPension;

    public Persona(String nombre, String apellido, String id, String pais, FondoPension fondoPension) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.pais = pais;
        this.fondoPension = fondoPension;
    }

    public void metodoAImplementar(){
        // todo implementar este metodo, un metodo abstracto
    }

}
