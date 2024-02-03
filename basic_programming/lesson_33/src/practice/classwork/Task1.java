package practice.classwork;

import java.io.*;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) throws IOException {

        /**Цель задачи
         Написать программу на Java, которая объединяет содержимое нескольких текстовых файлов в один результирующий файл.
         В процессе объединения программа должна исключать из итогового файла все строки, содержащие определенное ключевое слово.

         Шаги выполнения
         Подготовка файлов:

         Создайте несколько исходных текстовых файлов с различным содержанием.
         Определите ключевое слово, наличие которого в строке будет критерием для ее исключения из итогового файла.
         Чтение и фильтрация содержимого:

         Для каждого исходного файла используйте FileReader и BufferedReader для чтения его содержимого.
         Проверяйте каждую прочитанную строку на наличие заданного ключевого слова. Если строка содержит это слово, исключите ее из дальнейшего сохранения.
         Запись в результирующий файл:

         Используйте FileWriter и BufferedWriter для записи отфильтрованных строк в один результирующий файл.
         Обработка исключений:

         Убедитесь, что ваш код корректно обрабатывает возможные исключения, такие как IOException.
         Закрытие потоков:

         После обработки всех файлов закройте все открытые потоки.
         **/

        String path = "basic_programming/lesson_33/resources/file1.txt";
        File input = new File(path);
        String path1 = "basic_programming/lesson_33/resources/output.jpeg";
        File output = new File(path1);


        Scanner scanner = new Scanner(input);

        FileOutputStream fos = new FileOutputStream(output, true);

        int counter = 1;
       while (scanner.hasNext()){

           String temp = counter + ". " + scanner.nextLine() + "\n";
           fos.write(temp.getBytes());
           counter++;

       }

    }

}
