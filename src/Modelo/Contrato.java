import java.time.LocalDate;

public class Contrato {

    protected float prima;
    protected LocalDate vacaciones;
    protected float cesantias;
    protected LocalDate fechaInicio;
    protected ARL arl;
    protected float salario;

    public void metodoAImplentar(){
        // todo implementar metodo para que sea clase abstracta
    }

    public Contrato(float prima, LocalDate vacaciones, float cesantias, LocalDate fechaInicio, ARL arl, float salario) {
        this.prima = prima;
        this.vacaciones = vacaciones;
        this.cesantias = cesantias;
        this.fechaInicio = fechaInicio;
        this.arl = arl;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Contrato{" + "prima=" + prima + ", vacaciones=" + vacaciones + ", cesantias=" + cesantias + ", fechaInicio=" + fechaInicio + ", arl=" + arl + ", salario=" + salario + '}';
    }

}
