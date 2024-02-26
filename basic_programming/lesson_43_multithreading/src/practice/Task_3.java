package practice;

public class Task_3 {

    public static void main(String[] args) throws InterruptedException {

task3();

    }
    /**
     * Задача 3: Создать поток, который ждет 5 секунд перед тем как вывести "Поток завершен", главный поток должен дождаться завершения этого потока.
     */
    public static void task3() throws InterruptedException {
       Thread thread = new Thread(new Runnable() {
           @Override
           public void run() {
               System.out.println("Lets go");
               try {
                   Thread.sleep(5000);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }
       });
thread.start();
thread.join();
        System.out.println("Поток завершен");







    }

}
