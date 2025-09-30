package co.edu.udec.examenesacademicos.domain.specifications;

import co.edu.udec.examenesacademicos.domain.valueobjects.NotaFInal;

public class NotaAprobatoriaSpecification {
    private final double umbral;

    public NotaAprobatoriaSpecification(double umbral) {
        this.umbral = umbral;
    }

    public boolean esAprobatoria(NotaFInal notaFinal) {
        return notaFinal.getValor() >= umbral;
    }
}

