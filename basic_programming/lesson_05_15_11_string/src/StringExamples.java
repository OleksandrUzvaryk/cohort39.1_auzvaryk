public class StringExamples {

    public static void main(String[] args) {
        // Пример использования метода length()
        String str = "Hello";
        int length = str.length();
        System.out.println("Длина строки: " + length);

        // Пример использования метода charAt()
        char ch = str.charAt(1); // 'e'
        System.out.println("Символ на позиции 1: " + ch);

        // Пример использования метода substring()
        String substrA = str.substring(1, 3); // "el"
        System.out.println("Подстрока от 1 до 3: " + substrA);

        // Если использовать лишь одно число в аргументах метода substring(1),
        // то в результате мы получим строку от этого индекса до конца строки:
        String substrB = str.substring(2); // "el"
        System.out.println("Подстрока от 2 (по умолчанию до конца строки): " + substrB);

        // Пример использования метода indexOf()
        int index = str.indexOf("l"); // 2
        System.out.println("Индекс первого вхождения 'l': " + index);


        // Метод indexOf() может принимать более одного символа в аргументы, таким образом можно найти,
        // с какого индекса начинается подстрока в изначальной строке
        String example = "I love Java programming";
        int substringIndexCorrect = example.indexOf("Java"); // обязаны с точностью попасть в регистр
        System.out.println("Индекс первого вхождения 'Java': " + substringIndexCorrect);

        int substringIndexIncorrect = example.indexOf("java"); // 0, тк такой подстроки нет
        System.out.println("Индекс первого вхождения 'java': " + substringIndexIncorrect);

        // Пример использования метода toLowerCase()
        String lowerStr = str.toLowerCase(); // "hello"
        System.out.println("Строка в нижнем регистре: " + lowerStr);

        // Пример использования метода toUpperCase()
        String upperStr = str.toUpperCase(); // "HELLO"
        System.out.println("Строка в верхнем регистре: " + upperStr);

        // Пример использования метода trim()
        String trimmedStr = "  Hello World  ".trim(); // "Hello World"
        System.out.println("Строка после удаления пробелов: " + trimmedStr);

        // Примеры объединения строк
        String s1 = "Hello";
        String s2 = "World";

        // Использование оператора +
        String s3 = s1 + " " + s2; // "Hello World"
        System.out.println("Объединение строк с помощью +: " + s3);

        // Использование метода concat()
        String s4 = s1.concat(" ").concat(s2); // "Hello World"
        System.out.println("Объединение строк с помощью concat(): " + s4);

        // Комбинации операций. Операции можно комбинировать,
        // если одна операция возвращает String, то допустимо продолжить и добавить еще перации:

        String s5 = " HELLO ";
        String s6 = s5.trim().toLowerCase();
        System.out.println("Обхединенное удаление пробелов и приведение к нижнему регистру: " + s6);

        // допустимо, тк сначала выполнится операция удаления пробелов и только потом получим длину строки:
        int lengthWithoutSpaces = s5.trim().length();

        // не допустимо, тк сначала получим длину строки (int) и только потом попытаемся взаимодействовать с числом,
        // как со строкой
        // lengthWithoutSpaces = s5.length().trim();

        // Использование метода replace()
        String s5a = "Hello friends";
        String s5b = s5a.replace("friends", "World"); // "Hello World"
        System.out.println("Замена символов с помощью replace(): " + s5b);
    }
}
