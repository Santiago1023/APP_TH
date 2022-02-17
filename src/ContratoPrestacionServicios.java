import java.time.LocalDate;

public class ContratoPrestacionServicios extends Contrato{

    protected LocalDate duracionLabor;

    public ContratoPrestacionServicios(float prima, LocalDate vacaciones, float cesantias, LocalDate fechaInicio, ARL arl, float salario, LocalDate duracionLabor) {
        super(prima, vacaciones, cesantias, fechaInicio, arl, salario);
        this.duracionLabor = duracionLabor;
    }

}
