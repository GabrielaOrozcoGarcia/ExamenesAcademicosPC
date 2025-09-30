package co.edu.udec.examenesacademicos.domain.model;

public class Asignatura {
    private final String codigo;
    private final String nombre;
    private final String descripcion;
    private final int creditos;
    private final int anioAcademico;
    private final int semestre;
    private final String horario;

    public Asignatura(String codigo, String nombre, String descripcion, int creditos,
                      int anioAcademico, int semestre, String horario) {
        if (creditos <= 0) throw new IllegalArgumentException("Créditos deben ser > 0");
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.creditos = creditos;
        this.anioAcademico = anioAcademico;
        this.semestre = semestre;
        this.horario = horario;
    }
}

