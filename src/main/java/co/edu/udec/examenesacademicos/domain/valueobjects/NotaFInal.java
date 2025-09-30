package co.edu.udec.examenesacademicos.domain.valueobjects;

public class NotaFInal{
    private final double valor;
    public NotaFInal(double value) {
        if (value < 0.0 || value > 10.0) {
            throw new IllegalArgumentException("La nota debe estar entre 0.0 y 10.0");
        }
        this.valor = value;
    }
    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return String.valueOf(valor);
    }
}
