package theory;

public class PracticeJUnit {

    // Статический метод, который возвращает максимум из двух чисел
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // Статический метод, который возвращает минимум из двух чисел
    public static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    // Статический метод, который возвращает квадрат числа
    public static int square(int number) {
        return number * number;
    }

    // Статический метод, который возвращает среднее значение массива
    public static double average(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым");
        }
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        return sum / numbers.length;
    }

    // Статический метод, который возвращает факториал числа
    public static long factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Факториал отрицательного числа не определен");
        }
        long result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    // Метод, который возвращает количество вхождений подстроки в строку
    public static int countSubStringOccurrences(String str, String subStr) {
        int count = 0;
        int index = 0;
        while ((index = str.indexOf(subStr, index)) != -1) {
            count++;
            index++;
        }
        return count;
    }

    // Метод, который возвращает перевернутую строку
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // Метод, который ищет второе положительное число в массиве
    public static int findSecondPositiveNumber(int[] numbers) {
        int count = 0;
        for (int number : numbers) {
            if (number > 0) {
                count++;
                if (count == 2) {
                    return number;
                }
            }
        }
        return -1; // Возвращает -1, если второе положительное число не найдено
    }

    // Метод, который проверяет, содержит ли массив заданное число
    public static boolean containsNumber(int[] numbers, int numberToFind) {
        for (int number : numbers) {
            if (number == numberToFind) {
                return true;
            }
        }
        return false;
    }

    // реализовать самостоятельно и протестировать

    // Метод, который возвращает самое длинное слово в строке
    public static String longestWord(String sentence) {
        String longestWord = null;
        //...
        return longestWord;
    }

    // метод, который возвращает второе минимальное число в массиве или Integer.MAX_VALUE, если такого числа нет
    public static int secondMax(int[] nums) {
        int answer = Integer.MAX_VALUE;
        //...
        return answer;
    }

    // Метод, который возвращает индекс первого уникального символа в строке
    public static int firstUniqueChar(String str) {
        // ...

        return -1; // Возвращает -1, если уникальный символ не найден
    }

    // Метод, который возвращает сумму элементов массива, исключая максимальное и минимальное значение
    public static int sumExcludingMinMax(int[] nums) {
        int sum = 0;
        int min = 0;
        int max = 0;

        // ...

        return 0; // 0 - если в массиве менее 3х уникальных чисел {2, 2, 2, 4, 4} {2, 3, 3} {3, 3}
    }
}

