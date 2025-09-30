package co.edu.udec.examenesacademicos.domain.model;

import co.edu.udec.examenesacademicos.domain.valueobjects.DNI;

import java.time.LocalDate;

public class Profesor {
    private final DNI dni;
    private final String nombre;
    private final String correo;
    private final String telefono;
    private final String departamento;
    private final String cargo;
    private final LocalDate inicioContrato;
    private final LocalDate finContrato; // opcional

    public Profesor(DNI dni, String nombre, String correo, String telefono,
                    String departamento, String cargo,
                    LocalDate inicioContrato, LocalDate finContrato) {
        if (nombre == null || nombre.isBlank()) throw new IllegalArgumentException("Nombre vacío");
        this.dni = dni;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.departamento = departamento;
        this.cargo = cargo;
        this.inicioContrato = inicioContrato;
        this.finContrato = finContrato;
    }
}
