package br.com.infnet.ex05;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class NotificationTest {
    @Test
    public void deveTestarComportamentoDoCanalDeNotificacoes() {
        NotificationChannel notificationChannel = mock(NotificationChannel.class);
        NotificationService notificationService = new NotificationService();

        notificationService.notifyUser(notificationChannel, "Mensagem de teste");
        verify(notificationChannel).send("Mensagem de teste");
    }
}
