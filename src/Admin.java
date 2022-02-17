public class Admin extends UsuarioApp{

    protected Empleado empleado;
    protected Registro aux;

    public Admin(String nombre, String apellido, String id, String pais, FondoPension fondoPension, String password, String username, Empleado empleado, Registro aux) {
        super(nombre, apellido, id, pais, fondoPension, password, username);
        this.empleado = empleado;
        this.aux = aux;
    }


}
