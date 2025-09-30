package co.edu.udec.examenesacademicos.domain.model;

import co.edu.udec.examenesacademicos.domain.valueobjects.NivelDificultad;

public class Tema {
    private final String id;
    private final String nombre;
    private final String descripcion;
    private final String recursos;
    private final NivelDificultad dificultad;

    public Tema(String id, String nombre, String descripcion, String recursos, NivelDificultad dificultad) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.recursos = recursos;
        this.dificultad = dificultad;
    }
}


