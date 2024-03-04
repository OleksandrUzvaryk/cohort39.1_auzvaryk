package hometask;

public class MyThread extends Thread{

    private SharedStringList sharedList;

    public MyThread(SharedStringList sharedList) {
        this.sharedList = sharedList;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            sharedList.addString(Thread.currentThread().getName() + " - " + i);
        }
    }
    }

