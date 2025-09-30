package co.edu.udec.examenesacademicos.domain.model;
import co.edu.udec.examenesacademicos.domain.exceptions.NotaInvalidaException;
import co.edu.udec.examenesacademicos.domain.valueobjects.NotaFInal;
public class Nota {
    private NotaFInal notaFinal;
    private String fecha;

    public Nota(NotaFInal notaFinal, String fecha) {
        if (notaFinal.getValor() < 0 || notaFinal.getValor() > 5) {
            throw new NotaInvalidaException("Nota fuera de rango (0 - 10)");
        }
        this.notaFinal = notaFinal;
        this.fecha = fecha;
    }

    public NotaFInal getNotaFinal() { return notaFinal; }
    public String getFecha() { return fecha; }
}
