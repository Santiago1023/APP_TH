public interface IPermisosGenerales {

    public void registrarEmpleado(Empleado empleado);
    public void consultarEmpleado(String identificacion);
    public void cambiarEstadoEmpleado(String estado, Empleado empleado);

}
