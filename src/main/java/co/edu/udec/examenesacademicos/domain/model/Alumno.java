package co.edu.udec.examenesacademicos.domain.model;

import co.edu.udec.examenesacademicos.domain.valueobjects.NumeroMatricula;

public class Alumno {
    private final NumeroMatricula matricula;
    private final String nombre;
    private final String grupo;

    public Alumno(NumeroMatricula matricula, String nombre, String grupo) {
        if (nombre == null || nombre.isBlank()) throw new IllegalArgumentException("Nombre vacío");
        if (grupo == null || grupo.isBlank()) throw new IllegalArgumentException("Grupo vacío");
        this.matricula = matricula;
        this.nombre = nombre;
        this.grupo = grupo;
    }
}

