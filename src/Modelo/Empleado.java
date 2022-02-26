public class Empleado {

    protected Persona persona;
    protected Contrato contrato;
    protected EPS eps;
    protected String estado;
    protected String cargo;
    protected CuentaNomina cuentaNomina;
    protected FondoPension fondoPension;

    public Empleado(Persona persona, Contrato contrato, EPS eps, String estado, String cargo, CuentaNomina cuentaNomina, FondoPension fondoPension) {
        this.persona = persona;
        this.contrato = contrato;
        this.eps = eps;
        this.estado = estado;
        this.cargo = cargo;
        this.cuentaNomina = cuentaNomina;
        this.fondoPension = fondoPension;
    }
    
    public Empleado(){
        
    }
}
