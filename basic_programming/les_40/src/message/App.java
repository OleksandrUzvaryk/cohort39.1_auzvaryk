package message;

public class App {

    public static void main(String[] args) {




        Notifier telegramNotifier = new Notifier() {
            @Override
            public void sendMessage(String text) {
                System.out.println("Sending message with telegram!!!" + text);
            }
        };
        NotificationManager.broadcastMessage(telegramNotifier,"Hello, this is my message..........");
        NotificationManager.broadcastMessage(new SmsNotifier(), "SMS message");
        NotificationManager.broadcastMessage(new EmailNotifier(), "EMAIL Message");
    }
}
