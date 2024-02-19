package message;

public class EmailNotifier implements  Notifier{
    @Override
    public void sendMessage(String text) {
        System.out.println("Sending email message ->" + text);
    }
}
