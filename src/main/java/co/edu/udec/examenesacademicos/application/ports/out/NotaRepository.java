package co.edu.udec.examenesacademicos.application.ports.out;

import co.edu.udec.examenesacademicos.domain.model.Nota;
import co.edu.udec.examenesacademicos.domain.valueobjects.EvaluacionId;
import co.edu.udec.examenesacademicos.domain.valueobjects.Matricula;

import java.util.List;

public interface NotaRepository {
    void guardarNota(EvaluacionId evaluacionId, Matricula matriculaId, Nota nota);
    List<Nota> obtenerNotasPorMatricula(Matricula matriculaId);
}
