package co.edu.udec.examenesacademicos.domain.valueobjects;

import java.time.LocalDate;

public record Fecha(LocalDate value) {
    public Fecha {
        if (value == null) {
            throw new IllegalArgumentException("La fecha no puede ser nula");
        }
        if (value.isAfter(LocalDate.now().plusYears(1))) {
            throw new IllegalArgumentException("La fecha no puede estar más de un año en el futuro");
        }
    }

    public static Fecha hoy() {
        return new Fecha(LocalDate.now());
    }
}
