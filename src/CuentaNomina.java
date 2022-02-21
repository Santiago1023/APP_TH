public class CuentaNomina {

    protected int numeroCuenta;
    protected String usuario;
    protected String clave;

    public CuentaNomina(int numeroCuenta, String usuario, String clave) {
        this.numeroCuenta = numeroCuenta;
        this.usuario = usuario;
        this.clave = clave;
    }

    @Override
    public String toString() {
        return "CuentaNomina{" + "numeroCuenta=" + numeroCuenta + ", usuario=" + usuario + ", clave=" + clave + '}';
    }
    
}
