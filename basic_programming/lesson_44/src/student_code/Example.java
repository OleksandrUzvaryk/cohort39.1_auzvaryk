package student_code;

public class Example {

    public static void main(String[] args) {
        Thread.currentThread().setPriority(3);

        Thread t1 = cteateThread("t1", 500);
        Thread t2 = cteateThread("t2", 700);

        /*Thread t1 = cteateThreadPriority("t1", 10);
        Thread t2 = cteateThreadPriority("t2", 1);*/
        t1.start();
        t2.start();

       t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        System.out.println("t1.getName() = " + t1.getName() + "t1.get" + "t1.getPriority() = " + t1.getPriority());
        System.out.println("t2.getName() = " + t2.getName() + "t2.get" + "t2.getPriority() = " + t2.getPriority());

        Thread.currentThread().setName("New Name!");
        System.out.println("Thred Name ->" + Thread.currentThread().getName());


        System.out.println("main");
    }


    private static Thread cteateThread(String name, long time){

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {

               //Thread.currentThread().setName(name);


                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() +   " "  + i);
                    try {
                        Thread.sleep(time);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });


        return t1;
    }

    private static Thread cteateThreadPriority(String name, int priority){

        return  new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setPriority(priority);
                for (int i = 0; i <10_000_000 ; i++) {

                }
                System.out.println(name + " Finish");
            }
        });


    }

}
