package co.edu.udec.examenesacademicos.domain.services;

import co.edu.udec.examenesacademicos.domain.model.Nota;

import java.util.List;

public class CalculoPromedioService {
    public double calcularPromedio(List<Nota> notas) {
        return notas.stream()
                .mapToDouble(n -> n.getNotaFinal().getValor())
                .average()
                .orElse(0.0);
    }
}
