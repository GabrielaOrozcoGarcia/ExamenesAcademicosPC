package co.edu.udec.examenesacademicos.domain.model;

import co.edu.udec.examenesacademicos.domain.valueobjects.EvaluacionId;
import co.edu.udec.examenesacademicos.domain.valueobjects.Fecha;

import java.util.List;

public  class Evaluacion {
    private EvaluacionId evaluacionId;
    private String descripcion;
    public Evaluacion(EvaluacionId evaluacionId, String descripcion) {
        this.evaluacionId = evaluacionId;
        this.descripcion = descripcion;
    }

    public EvaluacionId getEvaluacionId() { return evaluacionId; }
    public String getDescripcion() { return descripcion; }
}
