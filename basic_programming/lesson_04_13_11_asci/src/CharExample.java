public class CharExample {
    public static void main(String[] args) {
        // Конвертация char в int и обратно
        char ch = 'A';
        int intFromChar = ch;
        char charFromInt = (char) intFromChar;

        System.out.println("Char: " + ch);
        System.out.println("Int from char: " + intFromChar);
        System.out.println("Char from int: " + charFromInt);

        // Создание char с использованием разных кодировок
        char chUtf16 = '\u0041'; // UTF-16 код для 'A'

        char chAscii = 65;       // ASCII код для 'A'

        System.out.println("Char from UTF-16: " + chUtf16);
        System.out.println("Char from ASCII: " + chAscii);

        // Математические операции с char
        char chPlusOne = (char) (ch + 1);
        char chMinusOne = (char) (ch - 1);

        System.out.println("Char plus one: " + chPlusOne);
        System.out.println("Char minus one: " + chMinusOne);

        // Дополнительные интересные операции
        // Проверка, является ли символ буквой
        boolean isLetter = Character.isLetter(ch);
        // Перевод символа в верхний регистр
        char upperCaseCh = Character.toUpperCase(chMinusOne);

        System.out.println("Is letter: " + isLetter);
        System.out.println("Upper case: " + upperCaseCh);

        // это работает только для алфавитных буквенных символов, но не для чисел и спец символов
        upperCaseCh = Character.toUpperCase('b');
        System.out.println("Upper case: " + upperCaseCh);

        // 72   69   76   76   79
        //'H'   'E'  'L'  'L'  'O'

    }
}
