package hometask;

import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        SharedStringList resultList = new SharedStringList();

        // Создание и запуск потоков
        MyThread[] threads = new MyThread[3];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new MyThread(resultList);
            threads[i].start();
        }

        // Ожидание завершения всех потоков
        for (MyThread thread : threads) {
            thread.join();
        }

        // Вывод содержимого списка
        List<String> result = resultList.getStringList();
        System.out.println("Содержимое списка:");
        for (String str : result) {
            System.out.println(str);
        }
    }

}
