package co.edu.udec.examenesacademicos.application.services;

import co.edu.udec.examenesacademicos.application.ports.in.ConsultarResumenNotasCDU;
import co.edu.udec.examenesacademicos.application.ports.out.NotaRepository;
import co.edu.udec.examenesacademicos.domain.model.Nota;
import co.edu.udec.examenesacademicos.domain.services.CalculoPromedioService;
import co.edu.udec.examenesacademicos.domain.valueobjects.Matricula;

import java.util.List;

public class ConsultarResumenNotasService implements ConsultarResumenNotasCDU {
    private final NotaRepository notaRepository;
    private final CalculoPromedioService calculoPromedioService;

    public ConsultarResumenNotasService(NotaRepository notaRepository, CalculoPromedioService calculoPromedioService) {
        this.notaRepository = notaRepository;
        this.calculoPromedioService = calculoPromedioService;
    }

    @Override
    public double consultarPromedio(Matricula matriculaId) {
        List<Nota> notas = notaRepository.obtenerNotasPorMatricula(matriculaId);
        return calculoPromedioService.calcularPromedio(notas);
    }
}
