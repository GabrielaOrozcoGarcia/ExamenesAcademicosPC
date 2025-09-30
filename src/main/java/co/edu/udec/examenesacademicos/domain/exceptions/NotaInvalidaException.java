package co.edu.udec.examenesacademicos.domain.exceptions;

public class NotaInvalidaException extends RuntimeException{
    public NotaInvalidaException(String message) {
        super(message);
    }
}
