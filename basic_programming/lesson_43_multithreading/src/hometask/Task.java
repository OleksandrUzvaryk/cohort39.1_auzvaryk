package hometask;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task {

    public static void main(String[] args) throws InterruptedException {

        makeMessage();

    }

    public static void makeMessage() throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try (BufferedReader br = new BufferedReader(new FileReader("basic_programming/lesson_43_multithreading/src/hometask/text1.txt"))) {
                    String line;
                    // Чтение строк из файла до тех пор, пока не достигнут конец файла (null)
                    while ((line = br.readLine()) != null) {
                        System.out.print(line);  // Вывод строки на консоль
                    }
                } catch (IOException e) {
                    e.printStackTrace();  // Обработка исключений ввода/вывода
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try (BufferedReader br = new BufferedReader(new FileReader("basic_programming/lesson_43_multithreading/src/hometask/text2.txt"))) {
                    String line;
                    // Чтение строк из файла до тех пор, пока не достигнут конец файла (null)
                    while ((line = br.readLine()) != null) {
                        System.out.println(line);  // Вывод строки на консоль
                    }
                } catch (IOException e) {
                    e.printStackTrace();  // Обработка исключений ввода/вывода
                }
            }
        });
        thread1.start();
        thread1.join();
        thread2.start();


    }
}




