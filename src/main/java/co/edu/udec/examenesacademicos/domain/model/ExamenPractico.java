package co.edu.udec.examenesacademicos.domain.model;

import co.edu.udec.examenesacademicos.domain.valueobjects.Fecha;

import java.util.List;

public class ExamenPractico extends Evaluacion {
    private final double pesoLaboratorio; // 70%
    private final double pesoEficiencia;  // 30%

    public ExamenPractico(String id, Fecha fecha, Asignatura asignatura, List<Tema> temas,
                          double pesoLaboratorio, double pesoEficiencia) {
        super(id, fecha, asignatura, temas);
        if (pesoLaboratorio + pesoEficiencia != 1.0) {
            throw new IllegalArgumentException("Los pesos deben sumar 1.0");
        }
        this.pesoLaboratorio = pesoLaboratorio;
        this.pesoEficiencia = pesoEficiencia;
    }
}
