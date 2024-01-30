package hometask;

public class StringHomework {

    public static void main(String[] args) {
/*
        Задание 1: Анализатор Текста
        Напишите программу, которая анализирует текст, введенный пользователем.
                Программа должна выводить количество символов(включая пробелы), количество букв (не включая пробелы)
        Также программа должна отобразить текст в обратном порядке (используйте StringBuilder).
        Задание 2: Форматирование Даты
        Напишите метод, который принимает строку в формате "гггг-мм-дд" (например, "2023-03-21") и возвращает ее в формате "дд.мм.гггг" (например, "21.03.2023").
        Используйте методы substring() и concat() для выполнения задачи.

        */

        // Задача 1: Анализатор текста
        System.out.println("Введите текст для анализа:");
        String text = "I love Java";
        analyzeText(text);

        // Задача 2: Форматирование даты
        System.out.println("Введите дату в формате гггг-мм-дд:");
        String date = "2024-12-30";
        formatDate(date);

    }

    // Метод для анализа текста
    public static void analyzeText(String text) {
        int size = text.length();
        int size2 = text.replaceAll(" ", "").length();
        StringBuilder reverse = new StringBuilder(text);
        reverse.reverse();
        System.out.println("Количество символов c пробелами > " + size );
        System.out.println("Количество символов без пробелов > " + size2 );
        System.out.println("Перевертыш > " + reverse );

    }

    // Метод для форматирования даты
    public static void formatDate(String date) {

        String formattedDate = date.substring(8).concat(date.substring(7,8).concat(date.substring(5,8).concat(date.substring(0,4))));
        System.out.println(date);
        System.out.println("Отформатированная дата: " + formattedDate);

    }

















}
