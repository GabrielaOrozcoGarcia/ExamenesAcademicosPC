package co.edu.udec.examenesacademicos.application.ports.out;

public interface NotificacionService {
    void enviarNotificacion(String destinatario, String mensaje);
}
