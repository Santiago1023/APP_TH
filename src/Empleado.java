public class Empleado {

    protected Contrato contrato;
    protected EPS eps;
    protected String estado;
    protected String cargo;
    protected CuentaNomina cuentaNomina;
    
    protected String nombre;
    protected String apellido;
    protected String id;
    protected String pais;
    protected FondoPension fondoPension;

    public Empleado(Contrato contrato, EPS eps, String estado, String cargo, CuentaNomina cuentaNomina, String nombre, String apellido, String id, String pais, FondoPension fondoPension) {
        this.contrato = contrato;
        this.eps = eps;
        this.estado = estado;
        this.cargo = cargo;
        this.cuentaNomina = cuentaNomina;
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.pais = pais;
        this.fondoPension = fondoPension;
    }
    
    
   

}
