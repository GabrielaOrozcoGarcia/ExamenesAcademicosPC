package co.edu.udec.examenesacademicos.domain.valueobjects;

public record NivelDificultad(int value) {
    public NivelDificultad {
        if (value < 1 || value > 5) {
            throw new IllegalArgumentException("El nivel de dificultad debe estar entre 1 y 5");
        }
    }
}
