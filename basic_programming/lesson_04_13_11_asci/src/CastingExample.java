public class CastingExample {

    public static void main(String[] args) {
        // Неявное приведение типов (Implicit Casting)
        // Пример: преобразование от меньшего к большему типу данных
        int intVal = 100;
        long longVal = intVal; // неявное приведение из int в long
        float floatVal = longVal; // неявное приведение из long в float
        System.out.println("Неявное приведение (int -> long): " + longVal);
        System.out.println("Неявное приведение (long -> float): " + floatVal);

        // Явное приведение типов (Explicit Casting)
        // Пример: преобразование от большего к меньшему типу данных
        double doubleVal = 9.99999;
        int intValFromDouble = (int) doubleVal; // явное приведение из double в int
        short shortValFromInt = (short) intValFromDouble; // явное приведение из int в short
        System.out.println("Явное приведение (double -> int): " + intValFromDouble);
        System.out.println("Явное приведение (int -> short): " + shortValFromInt);


    }
}
