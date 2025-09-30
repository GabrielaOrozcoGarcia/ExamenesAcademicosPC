package co.edu.udec.examenesacademicos.domain.model;

import co.edu.udec.examenesacademicos.domain.valueobjects.NotaFInal;

import java.util.HashMap;
import java.util.Map;

public class RegistroAcademico {
    private final Alumno alumno;
    private final Map<Evaluacion, NotaFInal> resultados = new HashMap<>();

    public RegistroAcademico(Alumno alumno) {
        this.alumno = alumno;
    }

    public void registrarNota(Evaluacion evaluacion, NotaFInal notaFInal) {
        if (resultados.containsKey(evaluacion)) {
            throw new IllegalStateException("El alumno ya tiene nota registrada en esta evaluación");
        }
        resultados.put(evaluacion, notaFInal);
    }

    public NotaFInal obtenerNota(Evaluacion evaluacion) {
        return resultados.get(evaluacion);
    }
}

