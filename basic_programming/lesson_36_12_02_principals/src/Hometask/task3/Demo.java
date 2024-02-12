package Hometask.task3;

/**
 * Создать класс Bird с методом fly(), затем реализуйте подклассы Penguin и Eagle. Оба должны наследовать Bird, но только Eagle может летать.
 *
 *
 */

public class Demo {

    public static void main(String[] args) {

        Penguin penguin = new Penguin("KingMo", 15 );
        Eagle eagle = new Eagle("Hornet", 5);
        penguin.fly();
        eagle.fly();

    }

}
