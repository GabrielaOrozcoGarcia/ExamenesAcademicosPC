package co.edu.udec.examenesacademicos.domain.valueobjects;

public record DNI(String value) {
    public DNI {
        if (!value.matches("\\d{7,10}")) {
            throw new IllegalArgumentException("DNI inválido, debe tener entre 7 y 10 dígitos");
        }
    }
}
