public interface IPermisosGenerales {

    public void registrarEmpleado(Registro registro);
    public void consultarEmpleado(String identificacion);
    public void cambiarEstadoEmpleado(String estado, Registro registro);

}
