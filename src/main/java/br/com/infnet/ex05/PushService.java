package br.com.infnet.ex05;

public class PushService implements NotificationChannel {
    @Override
    public void send(String message) {
        System.out.println("Sending PUSH: " + message);
    }
}
