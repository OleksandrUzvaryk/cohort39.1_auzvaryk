import org.junit.jupiter.api.Test;
import theory.TravelPlanner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Тестовый класс для TravelPlanner.
 */
class TravelPlannerTest {

    /**
     * Тест для проверки расчета общей стоимости путешествия.
     * <p>testCalculateTotalCost:
     * <p>
     * <p>Этот тест проверяет метод calculateTotalCost класса TravelPlanner.
     * <p>Мы передаем в метод массив стоимостей costs и количество направлений destinationCount.
     * <p>Ожидаемый результат (expected) - это сумма значений в массиве.
     * <p>Мы проверяем, что фактический результат (actual) совпадает с ожидаемым, используя assertEquals.
     */
    @Test
    void testCalculateTotalCost() {
        double[] costs = {100.0, 200.0, 300.0};
        int destinationCount = 3;
        double expected = 600.0;
        double actual = TravelPlanner.calculateTotalCost(costs, destinationCount);
        assertEquals(expected, actual, "Расчет общей стоимости должен быть корректным");
    }


    /**
     * <p>Тест для проверки расчета общей продолжительности путешествия.
     * <p>testCalculateTotalDuration:
     * <p>
     * <p>Тест для метода calculateTotalDuration.
     * <p>Передаем массив продолжительностей durations и количество направлений destinationCount.
     * <p>Ожидаем, что результат будет равен сумме продолжительностей.
     * <p>Также используем assertEquals для проверки соответствия ожидаемому и фактическому результату.
     */
    @Test
    void testCalculateTotalDuration() {
        int[] durations = {2, 3, 4};
        int destinationCount = 3;
        int expected = 9;
        int actual = TravelPlanner.calculateTotalDuration(durations, destinationCount);
        assertEquals(expected, actual, "Расчет общей продолжительности должен быть корректным");
    }
}
