package student_code;

public class Main {

    public static void main(String[] args) throws InterruptedException {

     joinExample();
    }

    public static void joinExample() throws InterruptedException {
        Thread t = new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(7000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Тимофей вышел гулять!");
            }
        };

        Thread r = new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Роман вышел гулять!");
            }
        };

        System.out.println("Максим зовет гулять Тимофея и Романа!");

        t.start();
        r.start();

        t.join(3000);
        r.join(3000);

        System.out.println("Максим тоже вышел гулять!");
    }

    public static void exampleOfJoin() throws InterruptedException {

       Thread t1 = new Thread(){
           @Override
           public void run() {
               try {
                   Thread.sleep(1000);
                   System.out.println("=====Thread======");
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }
       };

        Thread r = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                    System.out.println("=====Runnable======");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
             }
            }
        });

        t1.start();
        r.start();

        r.join();
        t1.join();
        System.out.println("********Main*********");
    }

    public static void threadExample() {

        Thread t1 = new ThreadExample1();
        Runnable t2 = new ThreadExample2();
/*
// запуск кода без создания нового потока
        t1.run();
        t2.run();
*/
        // метод старт создает новый отдельный поток где запускает метод и помогает реализовать заложеную в нем временную логику
        t1.start();
        new Thread(t2).start();
        System.out.println("********Main*********");

    }
}
