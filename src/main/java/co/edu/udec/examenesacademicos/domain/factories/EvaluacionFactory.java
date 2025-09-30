package co.edu.udec.examenesacademicos.domain.factories;

import co.edu.udec.examenesacademicos.domain.model.Evaluacion;
import co.edu.udec.examenesacademicos.domain.valueobjects.EvaluacionId;

public class EvaluacionFactory {
    public static Evaluacion crearNuevaEvaluacion(String id, String descripcion) {
        EvaluacionId eva =new EvaluacionId(id);
        return new Evaluacion(eva, descripcion);
    }
}
