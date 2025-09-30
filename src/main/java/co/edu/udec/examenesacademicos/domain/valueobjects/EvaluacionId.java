package co.edu.udec.examenesacademicos.domain.valueobjects;

public record EvaluacionId (String id) {
    public EvaluacionId{
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("el id de la evaluacion no puede ser nulo");
        }

    }
}
