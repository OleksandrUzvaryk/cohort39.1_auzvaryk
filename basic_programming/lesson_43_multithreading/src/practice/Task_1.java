package practice;

public class Task_1 {

    public static void main(String[] args) throws InterruptedException {

        task1();
    }


    /**
     * Задача 1: Создать два потока, один поток должен выводить четные числа от 0 до 10, а другой - нечетные числа от 1 до 9.
     */

    public static void task1() throws InterruptedException {

       Thread even = new Thread(new Runnable() {
           @Override
           public void run() {
               for (int i = 0; i <=10 ; i++) {
                   if (i%2 == 0){
                       System.out.println(i);
                       try {
                           Thread.sleep(1000);
                       } catch (InterruptedException e) {
                           throw new RuntimeException(e);
                       }
                   }
               }
           }
       });

        Thread odd = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <=10 ; i++) {
                    if (i%2 != 0){
                        System.out.println(i);
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        });

even.start();
even.join();
odd.start();

    }
}
