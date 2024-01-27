import java.util.Scanner;

public class ClassworkScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Чат-бот задает вопросы и считывает ответы пользователя.
        // Студентам необходимо создать переменные с определенными именами и выбрать подходящий метод Scanner для чтения данных.

        // Пример 1: Спрашиваем имя пользователя
        System.out.print("Привет! Как тебя зовут? ");
        // создайте переменную name нужного формата и считайте значение из консоли при помощи соответствующего метода:
        String name = scanner.nextLine();
        // int name = scanner.nextInt();
        // boolean name = scanner.nextBoolean();
        System.out.println("Рад познакомиться, " + name + "!");

        // Пример 2: Спрашиваем год рождения пользователя
        System.out.print("В каком году ты родился? ");
        int birthYear = scanner.nextInt();
        int age = 2023 - birthYear; // предположим, что текущий год - 2023
        System.out.println("О, тебе уже " + age + " лет!");

        // Пример 3: Спрашиваем любимый цвет пользователя
        //scanner.nextLine(); // очистка буфера сканера
        System.out.print("Какой твой любимый цвет? ");
        String favoriteColor = scanner.nextLine();
        System.out.println(favoriteColor + " - отличный выбор!");

        // Пример 4: Спрашиваем, любит ли пользователь программирование
        System.out.print("Тебе нравится программировать? (true/false) ");
        boolean likesProgramming = scanner.nextBoolean();
        if (likesProgramming) {
            System.out.println("Здорово! Программирование - это весело!");
        } else {
            System.out.println("Не переживай, со временем это может измениться!");
        }

        scanner.close();
    }
}
