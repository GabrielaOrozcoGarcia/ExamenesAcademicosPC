package co.edu.udec.examenesacademicos.domain.valueobjects;

public record NumeroMatricula(String value) {
    public NumeroMatricula {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("El número de matrícula no puede estar vacío");
        }
        if (value.length() > 20) {
            throw new IllegalArgumentException("La matrícula no debe superar los 20 caracteres");
        }
    }
}
