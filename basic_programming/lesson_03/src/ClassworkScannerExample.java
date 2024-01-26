import java.util.Scanner;

public class ClassworkScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Пример 1: Спрашиваем имя пользователя
        System.out.print("Привет! Как тебя зовут? ");
        // создайте переменную name нужного формата и считайте значение из консоли при помощи соответствующего метода:
        String name = scanner.nextLine();
        // int name = scanner.nextInt();
        // double name = scanner.nextDouble();
        // boolean name = scanner.nextBoolean();
        System.out.println("Рад познакомиться, " + name + "!");

        // Пример 2: Спрашиваем год рождения пользователя
        System.out.print("В каком году ты родился? ");
        // создайте переменную birthYear нужного формата и считайте значение из консоли при помощи соответствующего метода:
        int birthYear = scanner.nextInt();
        // String birthYear = scanner.nextLine();
        // double birthYear = scanner.nextDouble();
        // boolean birthYear = scanner.nextBoolean();
        System.out.println("О, тебе уже " + (2023 - birthYear) + " лет!"); // предположим, что текущий год - 2023
        scanner.nextLine();

        // Пример 3: Спрашиваем любимый цвет пользователя
        System.out.print("Какой твой любимый цвет? ");
        // создайте переменную favoriteColor нужного формата и считайте значение из консоли при помощи соответствующего метода:
        String favoriteColor = scanner.nextLine();
        // int favoriteColor = scanner.nextInt();
        // double favoriteColor = scanner.nextDouble();
        // boolean favoriteColor = scanner.nextBoolean();
        System.out.println(favoriteColor + " - отличный выбор!");

        // Пример 4: Спрашиваем, любит ли пользователь программирование
        System.out.print("Тебе нравится программировать? (true/false) ");
        // создайте переменную likesProgramming нужного формата и считайте значение из консоли при помощи соответствующего метода:
        boolean likesProgramming = scanner.nextBoolean();
        // String likesProgramming = scanner.nextLine();
        // int likesProgramming = scanner.nextInt();
        // double likesProgramming = scanner.nextDouble();
        if (likesProgramming) {
            System.out.println("Здорово! Программирование - это весело!");
         } else {
             System.out.println("Не переживай, со временем это может измениться!");
         }

        // Пример 5: Спрашиваем рост пользователя
        System.out.print("Каков твой рост? (в метрах) ");
        // создайте переменную height нужного формата и считайте значение из консоли при помощи соответствующего метода:
        int height = scanner.nextInt();
        // String height = scanner.nextLine();
        // double height = scanner.nextDouble();
        // boolean height = scanner.nextBoolean();
        System.out.println("Твой рост: " + height + " м, или " + (height * 100) + " см");

        scanner.close();
    }
}

