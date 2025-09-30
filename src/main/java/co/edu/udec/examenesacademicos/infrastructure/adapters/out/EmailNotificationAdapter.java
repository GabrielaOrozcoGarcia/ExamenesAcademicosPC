package co.edu.udec.examenesacademicos.infrastructure.adapters.out;

import co.edu.udec.examenesacademicos.application.ports.out.NotificacionService;

public class EmailNotificationAdapter implements NotificacionService {
    @Override
    public void enviarNotificacion(String destinatario, String mensaje) {
        // codigo para enciar correo
    }
}
