public class Admin extends UsuarioApp{

    protected Empleado empleado;
    

    public Admin(String password, String username, Empleado empleado) {
        
        super(password, username);
        this.empleado = empleado;
      
    }


}
