package Modelo;

import java.time.LocalDate;

public class ContratoIndefinido extends Contrato{

    public ContratoIndefinido(float prima, LocalDate vacaciones, float cesantias, LocalDate fechaInicio, ARL arl, float salario) {
        super(prima, vacaciones, cesantias, fechaInicio, arl, salario);
    }


}
