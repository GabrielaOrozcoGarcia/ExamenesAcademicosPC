package co.edu.udec.examenesacademicos.application.ports.in;

import co.edu.udec.examenesacademicos.domain.valueobjects.EvaluacionId;
import co.edu.udec.examenesacademicos.domain.valueobjects.Matricula;
import co.edu.udec.examenesacademicos.domain.valueobjects.NotaFInal;

public interface RegistrarNotaCDU {
    public void registrarNota(EvaluacionId evaluacionId, Matricula matriculaId, NotaFInal  notaFinal, String fecha);
}
