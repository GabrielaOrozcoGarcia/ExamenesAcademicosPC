package co.edu.udec.examenesacademicos.infrastructure.adapters.out;

import co.edu.udec.examenesacademicos.application.ports.out.NotaRepository;
import co.edu.udec.examenesacademicos.domain.model.Nota;
import co.edu.udec.examenesacademicos.domain.valueobjects.EvaluacionId;
import co.edu.udec.examenesacademicos.domain.valueobjects.Matricula;

import java.util.List;

public class JdbcNotaRepository implements NotaRepository {
    @Override
    public void guardarNota(EvaluacionId evaluacionId, Matricula matriculaId, Nota nota) {
        // Inserta en DB relacional
    }

    @Override
    public List<Nota> obtenerNotasPorMatricula(Matricula matriculaId) {
        // SELECT * FROM notas WHERE matricula = ?
        return List.of();
    }
}
