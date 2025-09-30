package co.edu.udec.examenesacademicos.domain.events;

import co.edu.udec.examenesacademicos.domain.valueobjects.EvaluacionId;
import co.edu.udec.examenesacademicos.domain.valueobjects.Matricula;
import co.edu.udec.examenesacademicos.domain.valueobjects.NotaFInal;

public class NotaRegistrada {
    private final EvaluacionId evaluacionId;
    private final Matricula matriculaId;
    private final NotaFInal notaFinal;
    private final String fecha;

    public NotaRegistrada(EvaluacionId evaluacionId, Matricula matriculaId, NotaFInal notaFinal, String fecha) {
        this.evaluacionId = evaluacionId;
        this.matriculaId = matriculaId;
        this.notaFinal = notaFinal;
        this.fecha = fecha;
    }

    public EvaluacionId getEvaluacionId() { return evaluacionId; }
    public Matricula getMatriculaId() { return matriculaId; }
    public NotaFInal getNotaFinal() { return notaFinal; }
    public String getFecha() { return fecha; }
}
