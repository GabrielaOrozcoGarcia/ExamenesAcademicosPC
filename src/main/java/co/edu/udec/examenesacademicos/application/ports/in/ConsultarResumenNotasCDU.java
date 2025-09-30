package co.edu.udec.examenesacademicos.application.ports.in;

import co.edu.udec.examenesacademicos.domain.valueobjects.Matricula;

public interface ConsultarResumenNotasCDU {
    double consultarPromedio(Matricula matriculaId);
}
