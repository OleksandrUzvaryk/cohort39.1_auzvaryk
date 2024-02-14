package teacher_code;

@FunctionalInterface
public interface MyInterface {
    // методы calculate - перегружены, нужны исключительно для демонстрации абстрактных,
    // дефолтных и статическиз методов интерфейсов


    // абстрактный метод, не имеет реализации
    // чтобы воспользовать абстрактным методом, надо написать его имплементацию.
    // то есть, в классическом понимании, нам нужен класс, который имплементирует данный интерфейс
    // и в котором будет написана реализация данного метода
    int calculate(int a, int b);

    // дефолтный метод, который имеет реализацию по умолчанию (default)
    // чтобы воспользоваться этим кодом нужна какая-то реализация данного интерфейса в классе,
    // но при этом, данный метод не требует обязательного переопределения и будет работать в том виде,
    // в котром он написан в интерфейсе
    default int calculate(int a, int b, int c) {
        return a * b * c;
    }

    // статический метод в интерфейсе
    // для того, чтобы воспользоваться данным методом нет обязательной необходимости в том,
    // чтобы создавать экземпляр данного интерфейса (имплементировать его в каком-то классе)
    static int calculate(int a) {
        return a * a;
    }
}
