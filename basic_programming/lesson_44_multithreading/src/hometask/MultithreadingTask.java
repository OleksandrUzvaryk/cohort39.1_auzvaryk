package hometask;

public class MultithreadingTask {

    public static void main(String[] args) {

        printInfo();

    }


    public static void printInfo() {
        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                Thread.currentThread().setName("My Thread 1");
                Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
                for (int i = 1; i > 0; i++) {
                    System.out.println("Name -> " + Thread.currentThread().getName() + " - " + "Priority = " + Thread.currentThread().getPriority());

                }

            }
        });
        t1.start();
        Thread t2 = new Thread(new Runnable() {

            @Override
            public void run() {
                Thread.currentThread().setName("My Thread 2");
                Thread.currentThread().setPriority(Thread.NORM_PRIORITY);
                for (int i = 1; i > 0; i++) {
                    System.out.println("Name -> " + Thread.currentThread().getName() + " - " + "Priority = " + Thread.currentThread().getPriority());
                }

            }
        });
        t2.start();
        Thread t3 = new Thread(new Runnable() {

            @Override
            public void run() {
                Thread.currentThread().setName("My Thread 3");
                Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
                for (int i = 1; i > 0; i++) {
                    System.out.println("Name -> " + Thread.currentThread().getName() + " - " + "Priority = " + Thread.currentThread().getPriority());
                }

            }
        });
        t3.start();

    }

}

