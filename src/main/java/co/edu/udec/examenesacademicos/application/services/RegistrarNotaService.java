package co.edu.udec.examenesacademicos.application.services;

import co.edu.udec.examenesacademicos.application.ports.in.RegistrarNotaCDU;
import co.edu.udec.examenesacademicos.application.ports.out.NotaRepository;
import co.edu.udec.examenesacademicos.application.ports.out.NotificacionService;
import co.edu.udec.examenesacademicos.domain.model.Nota;
import co.edu.udec.examenesacademicos.domain.specifications.NotaAprobatoriaSpecification;
import co.edu.udec.examenesacademicos.domain.valueobjects.EvaluacionId;
import co.edu.udec.examenesacademicos.domain.valueobjects.Matricula;
import co.edu.udec.examenesacademicos.domain.valueobjects.NotaFInal;

public class RegistrarNotaService implements RegistrarNotaCDU {
    private final NotaRepository notaRepository;
    private final NotificacionService notificationService;
    private final NotaAprobatoriaSpecification notaSpec;

    public RegistrarNotaService(NotaRepository notaRepository, NotificacionService notificationService) {
        this.notaRepository = notaRepository;
        this.notificationService = notificationService;
        this.notaSpec = new NotaAprobatoriaSpecification(3.0);
    }

    @Override
    public void registrarNota(EvaluacionId evaluacionId, Matricula matriculaId, NotaFInal notaFinal, String fecha) {
        Nota nota = new Nota(notaFinal, fecha);
        notaRepository.guardarNota(evaluacionId, matriculaId, nota);

        if (!notaSpec.esAprobatoria(notaFinal)) {
            notificationService.enviarNotificacion("profesor@uni.edu", "Estudiante con nota baja");
        }
    }
}
