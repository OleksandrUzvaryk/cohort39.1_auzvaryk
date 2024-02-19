package message;

public class SmsNotifier implements Notifier{


    @Override
    public void sendMessage(String text) {
        System.out.println("Sending sms message ->" + text);
    }
}
