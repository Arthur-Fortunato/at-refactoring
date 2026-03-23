package br.com.infnet.ex05;

public class NotificationService {
    public void notifyUser(NotificationChannel channel, String message) {
        channel.send(message);
    }
}
