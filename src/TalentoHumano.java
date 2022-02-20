public class TalentoHumano extends UsuarioApp{

    protected Empleado empleado;

    public TalentoHumano(String password, String username, Empleado empleado) {
        super(password, username);
        this.empleado = empleado;
    }

    public void llamarDAO( Empleado empleado){
        // todo implementar este metodo, y ver en realidad que tipo retorna
    }
}
