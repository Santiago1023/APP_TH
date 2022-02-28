package Modelo;

public interface IDAO {
    
    public void guardar(Empleado empleado);
    public void modificar(Empleado empleado);
    public Empleado consultar(String identificacion);

}
