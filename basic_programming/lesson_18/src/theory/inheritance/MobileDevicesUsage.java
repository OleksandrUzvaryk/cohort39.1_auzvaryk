package theory.inheritance;

/**
 * класс для создания экземпляров классов Mobile[N]g
 * <p>
 * нужен для демонстрации наследования
 */
public class MobileDevicesUsage {
    public static void main(String[] args) {
        useMobile2g();
    }

    // использование базового класса Mobile1g
    static void useMobile1g() {
        Mobile1g mobile1g = new Mobile1g(100);

        mobile1g.call();
        mobile1g.call();
        mobile1g.call();
    }

    // использование класса Mobile2g доказывает, что нет необходимости повторного создания метода call(),
    // можно использовать родительский метод
    static void useMobile2g() {
        Mobile2g mobile = new Mobile2g(200);

        mobile.call();
        mobile.call();
        mobile.call();

        mobile.sendSMS("hello there!");
        mobile.sendSMS("hello there! tooooooooo loooong messssage");
    }
}
