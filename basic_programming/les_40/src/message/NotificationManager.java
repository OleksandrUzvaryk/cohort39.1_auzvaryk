package message;

public class NotificationManager {

    public  static  void broadcastMessage (Notifier notifier, String message){

        notifier.sendMessage(message);
    }




}
