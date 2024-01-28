public class FormatExamples {

    public static void main(String[] args) {
        // Добавление строк
        String name = "Анна";
        String message = String.format("Привет, %s!", name);
        System.out.println(message); // Привет, Анна!

        // Добавление целых чисел
        int age = 25;
        String ageText = String.format("%s лет", age);
        System.out.println(ageText); // 25 лет

        // Добавление дробных чисел
        double height = 175.5;
        String heightText = String.format("Рост: %.2f см", height);
        System.out.println(heightText); // Рост: 175.50 см

        // Округление дробных чисел
        double weight = 30.12345;
        String weightText = String.format("Вес: %.2f кг", weight);
        System.out.println(weightText); // Вес: 30.12 кг (округление в меньшую сторону)

        // Выравнивание текста по правому краю
        String rightAligned = String.format("%20s", "выровненный текст");
        System.out.println(rightAligned); // "   выровненный текст" (с пробелами слева)

        // Выравнивание текста по левому краю
        String leftAligned = String.format("%-20s", "текст");
        System.out.println(leftAligned); // "текст               " (с пробелами справа)
    }
}
