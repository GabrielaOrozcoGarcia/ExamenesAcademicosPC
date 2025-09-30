package co.edu.udec.examenesacademicos.infrastructure.adapters.in;

import co.edu.udec.examenesacademicos.application.ports.in.RegistrarNotaCDU;
import co.edu.udec.examenesacademicos.domain.valueobjects.EvaluacionId;
import co.edu.udec.examenesacademicos.domain.valueobjects.Matricula;
import co.edu.udec.examenesacademicos.domain.valueobjects.NotaFInal;

public class KafkaNotaRegistradaAdapter {
    private final RegistrarNotaCDU registrarNotaUseCase;

    public KafkaNotaRegistradaAdapter(RegistrarNotaCDU registrarNotaUseCase) {
        this.registrarNotaUseCase = registrarNotaUseCase;
    }

    public void onMessage(String mensajeKafka) {
        // deserializar JSON → NotaRegistradaEvent
        // transformar a objetos del dominio
        registrarNotaUseCase.registrarNota(new EvaluacionId("E1"), new Matricula("M1"), new NotaFInal(2.5), "2025-09-30");
    }
}
