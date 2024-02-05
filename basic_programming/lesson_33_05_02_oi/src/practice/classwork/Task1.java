package practice.classwork;

import java.io.*;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) throws IOException {

        /**Написать программу на Java, которая читает содержимое текстового файла,
         * добавляет к каждой строке ее порядковый номер и записывает результат в новый текстовый файл.

         Шаги выполнения
         Чтение из исходного файла:

         Используйте FileReader для чтения текста из исходного файла.
         Примените BufferedReader для эффективного построчного чтения.
         Добавление номера строки:

         Для каждой прочитанной строки добавьте ее порядковый номер в начало, следуя формату: "{номер строки}. {содержимое строки}".
         Пример: из "Привет, мир!" получается "1. Привет, мир!" для первой строки.
         Запись в целевой файл:

         Используйте FileWriter для создания и записи в новый текстовый файл.
         Примените BufferedWriter для более эффективной записи.
         Обработка исключений:

         Обработайте возможные исключения, такие как FileNotFoundException и IOException.
         Закрытие потоков:

         После окончания работы обязательно закройте все потоки (FileReader, BufferedReader, FileWriter, BufferedWriter) для освобождения ресурсов.
         **/

        String path = "basic_programming/lesson_33/resources/file1.txt";
        File input = new File(path);
        String path1 = "basic_programming/lesson_33/resources/output.jpeg";
        File output = new File(path1);

        Scanner scanner = new Scanner(input);
        FileOutputStream fos = new FileOutputStream(output, true);

        int counter = 1;
        while (scanner.hasNext()) {
            String temp = counter + ". " + scanner.nextLine() + "\n";
            fos.write(temp.getBytes());
            counter++;
        }

    }

}
