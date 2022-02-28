package Modelo;

public class Empleado extends Persona{

    //protected Persona persona;
    protected Contrato contrato;
    protected EPS eps;
    protected String estado;
    protected String cargo;
    protected CuentaNomina cuentaNomina;
    protected FondoPension fondoPension;

    public Empleado(String nombre, String apellido, String id, String pais, Contrato contrato, EPS eps, String estado, String cargo, CuentaNomina cuentaNomina, FondoPension fondoPension) {
        super(nombre, apellido, id, pais);
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
