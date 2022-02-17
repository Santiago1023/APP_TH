public class TalentoHumano extends UsuarioApp{

    protected Empleado empleado;

    public TalentoHumano(String nombre, String apellido, String id, String pais, FondoPension fondoPension, String password, String username, Empleado empleado) {
        super(nombre, apellido, id, pais, fondoPension, password, username);
        this.empleado = empleado;
    }

    public void llamarDAO(Registro registro){
        // todo implementar este metodo, y ver en realidad que tipo retorna
    }
}
