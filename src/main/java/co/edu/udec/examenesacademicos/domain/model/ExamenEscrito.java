package co.edu.udec.examenesacademicos.domain.model;

import co.edu.udec.examenesacademicos.domain.valueobjects.Fecha;

import java.util.List;

public class ExamenEscrito extends Evaluacion {
    private final double pesoTeorico;   // 80%
    private final double pesoRedaccion; // 20%

    public ExamenEscrito(String id, Fecha fecha, Asignatura asignatura, List<Tema> temas,
                         double pesoTeorico, double pesoRedaccion) {
        super(id, fecha, asignatura, temas);
        if (pesoTeorico + pesoRedaccion != 1.0) {
            throw new IllegalArgumentException("Los pesos deben sumar 1.0");
        }
        this.pesoTeorico = pesoTeorico;
        this.pesoRedaccion = pesoRedaccion;
    }
}

