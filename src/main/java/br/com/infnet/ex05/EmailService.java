package br.com.infnet.ex05;

public class EmailService implements NotificationChannel {
    @Override
    public void send(String message) {
        System.out.println("Sending EMAIL: " + message);
    }
}
