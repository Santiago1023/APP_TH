public abstract class UsuarioApp extends Persona{

    protected String password;
    protected String username;

    public UsuarioApp(String nombre, String apellido, String id, String pais, FondoPension fondoPension, String password, String username) {
        super(nombre, apellido, id, pais, fondoPension);
        this.password = password;
        this.username = username;
    }

    public void modificaEstado(Empleado empleado){
        //TODO implementar este metodo
    }

}
