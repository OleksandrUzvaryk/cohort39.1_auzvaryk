package practice;

public class Task_2 {

    public static void main(String[] args) throws InterruptedException {

        task2();


    }
    /**
     * Задача 2: Создать поток, который выводит числа от 1 до 5 с интервалом в 1 секунду, после чего главный поток выводит "Завершено".
     */

public  static  void task2() throws InterruptedException {
    Thread thread = new Thread(new Runnable() {
        @Override
        public void run() {
            for (int i = 0; i <6 ; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    });
    thread.start();
    thread.join();
    System.out.println("Завершено");

}

}
