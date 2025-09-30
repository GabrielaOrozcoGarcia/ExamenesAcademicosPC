package co.edu.udec.examenesacademicos.domain.valueobjects;

public record Matricula(String idMatricula) {

    public Matricula{
        if (idMatricula == null || idMatricula.isBlank()) {
            throw new IllegalArgumentException("la matricula no puede ser nula");
        }
    }
}
