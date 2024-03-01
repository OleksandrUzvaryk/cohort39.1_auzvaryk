package practice;

public class Classwork {

    public static void main(String[] args) throws InterruptedException {
        Classwork tasks = new Classwork();
       //tasks.task1();
        //tasks.task2();
       //tasks.task3();
       // tasks.task4();
       //tasks.task5();
        tasks.task6();
    }

    // Задача 1: Создание и старт двух потоков
    public void task1() {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("thread1");
                System.out.println(Thread.currentThread().getName());
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("thread2");
                System.out.println(Thread.currentThread().getName());
            }
        });

        thread1.start();
        thread2.start();
    }

    // Задача 2: Использование метода sleep()
    public void task2() {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("thread1");
                System.out.println("thread 1 - started " + Thread.currentThread().getName());
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {

                }
                System.out.println("Stop!");
            }
        });
        thread1.start();
        //thread1.isAlive();
        //thread1.isInterrupted();
        thread1.interrupt();
    }

    // Задача 3: Установка и получение приоритета потока. создайте поток, установите для него максмально возможный
    // приоритет. Выведите на экран "Task 3: Thread Priority: ..."

    public void task3() throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("---------------");
                Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
            }
        });
//thread.setPriority(Thread.MAX_PRIORITY);
        thread.start();
        Thread.sleep(1000);
        System.out.println("Task 3: Thread Priority: ..." + thread.getPriority());
    }

    // Задача 4: Использование join() для ожидания завершения потока. Создайте поток, который печатает числа от 1 до 5
    // с интервалом в 1с, главный поток должен дождаться выполнения этого потока
    public void task4() throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
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
        System.out.println("Task 4: Thread has finished execution");
    }

    // Задача 5: Использование потока-демона. Создайте демон-поток, который каждые 500 мс печатает в консоль
    // "Task 5: Daemon Thread is running", дайте поработать данному потоку 2 секунды, потом завршите выполнение
    // главного потока
    public void task5() throws InterruptedException {
        Thread daemonThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <100 ; i++) {
                    System.out.println("Task 5: Daemon Thread is running-> " + i);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        });
        daemonThread.setDaemon(true);
        daemonThread.start();
        daemonThread.join(2000);
        // Позволим демону поработать 2 секунды перед завершением основного потока
        System.out.println("Task 5: Main Thread is finishing and daemon will be terminated");
        Thread.interrupted();
    }

    // Задача 6: создайте 2 потока 1.поток - демон, который 10 раз выводи в консоль "Daemon Thread is running", засыпая
    // на 1 секунду каждый раз. Второй пото должен проделать аналогичную работу, но 5 раз и выводить сообщение
    // "Non Daemon Thread is running" и остановить свое выполнение. В потоке мейн следует проверить, работает ли
    // поток-демон, если да, то остановить его, если нет, то просто закончить работу.

    public void task6() {
        Thread daemonThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <11 ; i++) {
                    System.out.println("Task 6: Daemon Thread is running-> " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        });
        Thread nonDaemonThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <6 ; i++) {
                    System.out.println("Task 6: NOTDaemon Thread is running-> " + i);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        });
        daemonThread.setDaemon(true);
        daemonThread.start();
        nonDaemonThread.start();
        if (nonDaemonThread.isAlive()){
            nonDaemonThread.interrupt();
        }
    }
}
