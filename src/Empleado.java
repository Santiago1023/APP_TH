public class Empleado extends Persona{

    protected Contrato contrato;
    protected EPS eps;
    protected String estado;
    protected String cargo;
    protected CuentaNomina cuentaNomina;

    public Empleado(String nombre, String apellido, String id, String pais, FondoPension fondoPension, Contrato contrato, EPS eps, String estado, String cargo, CuentaNomina cuentaNomina) {
        super(nombre, apellido, id, pais, fondoPension);
        this.contrato = contrato;
        this.eps = eps;
        this.estado = estado;
        this.cargo = cargo;
        this.cuentaNomina = cuentaNomina;
    }

}
