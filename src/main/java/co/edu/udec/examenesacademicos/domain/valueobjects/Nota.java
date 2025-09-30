package co.edu.udec.examenesacademicos.domain.valueobjects;

public record Nota(double value) {
    public Nota {
        if (value < 0.0 || value > 10.0) {
            throw new IllegalArgumentException("La nota debe estar entre 0.0 y 10.0");
        }
    }
}
