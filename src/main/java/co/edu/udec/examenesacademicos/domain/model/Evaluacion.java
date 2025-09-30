package co.edu.udec.examenesacademicos.domain.model;

import co.edu.udec.examenesacademicos.domain.valueobjects.Fecha;

import java.util.List;

public abstract class Evaluacion {
    protected final String id;
    protected final Fecha fecha;
    protected final Asignatura asignatura;
    protected final List<Tema> temas;

    protected Evaluacion(String id, Fecha fecha, Asignatura asignatura, List<Tema> temas) {
        this.id = id;
        this.fecha = fecha;
        this.asignatura = asignatura;
        this.temas = List.copyOf(temas);
    }
}
