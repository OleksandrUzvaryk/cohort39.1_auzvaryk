public class NumberSystemsOperations {
    public static void main(String[] args) {
        // Двоичное число (например, 0b1101 соответствует 13 в десятичной системе)
        int binaryNumber = 0b1101;
        System.out.println(binaryNumber);

        // Десятичное число (например, 10)
        int decimalNumber = 10;
        System.out.println(decimalNumber);

        // Восьмеричное число (например, 0157 соответствует 111 в десятичной системе)
        int octalNumber = 0157;
        System.out.println(octalNumber);

        // Шестнадцатеричное число (например, 0x1A3 соответствует 419 в десятичной системе)
        int hexNumber = 0x1A3;
        System.out.println(hexNumber);

        // Примеры операций
        // Сложение двоичного и десятичного числа
        int sumBinaryDecimal = binaryNumber + decimalNumber;
        System.out.println("Сумма двоичного и десятичного: " + sumBinaryDecimal); // 23

        // Вычитание восьмеричного числа из шестнадцатеричного
        int differenceHexOctal = hexNumber - octalNumber;
        System.out.println("Разность шестнадцатеричного и восьмеричного: " + differenceHexOctal); // 308

        // Умножение восьмеричного и десятичного числа
        int productOctalDecimal = octalNumber * decimalNumber;
        System.out.println("Произведение восьмеричного и десятичного: " + productOctalDecimal); // 1110

        // Деление шестнадцатеричного на двоичное число
        int divisionHexBinary = hexNumber / binaryNumber;
        System.out.println("Частное шестнадцатеричного и двоичного: " + divisionHexBinary); // 32
    }
}
