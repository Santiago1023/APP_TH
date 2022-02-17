import java.time.LocalDate;

public class ContratoFijo extends Contrato{

    protected LocalDate duracionContrato;

    public ContratoFijo(float prima, LocalDate vacaciones, float cesantias, LocalDate fechaInicio, ARL arl, float salario, LocalDate duracionContrato) {
        super(prima, vacaciones, cesantias, fechaInicio, arl, salario);
        this.duracionContrato = duracionContrato;
    }

}
