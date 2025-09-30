package co.edu.udec.examenesacademicos.domain.model;

import co.edu.udec.examenesacademicos.domain.valueobjects.Nota;

import java.util.HashMap;
import java.util.Map;

public class RegistroAcademico {
    private final Alumno alumno;
    private final Map<Evaluacion, Nota> resultados = new HashMap<>();

    public RegistroAcademico(Alumno alumno) {
        this.alumno = alumno;
    }

    public void registrarNota(Evaluacion evaluacion, Nota nota) {
        if (resultados.containsKey(evaluacion)) {
            throw new IllegalStateException("El alumno ya tiene nota registrada en esta evaluación");
        }
        resultados.put(evaluacion, nota);
    }

    public Nota obtenerNota(Evaluacion evaluacion) {
        return resultados.get(evaluacion);
    }
}

