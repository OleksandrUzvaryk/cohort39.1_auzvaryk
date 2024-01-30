import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import theory.DistanceCalculator;

class DistanceCalculatorTest {

    @Test
    public void testCalculateDistanceWithReturnCorrectResult() {
        double[] point1 = {0, 0, 0};
        double[] point2 = {1, 0, 0};

        //переменная, в которой мы пишем ожидаемый
        // результат выполнения кода
        double expected = 1.0;
        double result = DistanceCalculator.calculateDistanceWithReturn(point1, point2);

        Assertions.assertEquals(expected, result);
    }







    /*@Test
    public void testCalculateDistanceWithReturnIncorrectResult() {
        double[] point1 = {0, 0, 0, 8};
        double[] point2 = {1, 0, 0};

        double[] point3 = {0, 0, 0, 0};
        double[] point4 = {1, 0, 0, 9};

        double expected = -1.0;
        double result = DistanceCalculator.calculateDistanceWithReturn(point1, point2);

        Assertions.assertEquals(expected, result);

        expected = -1.0;
        result = DistanceCalculator.calculateDistanceWithReturn(point3, point4);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testCalculateDistanceWithReturnWithNullValue() {
        double expected = -1.0;
        double result = DistanceCalculator.calculateDistanceWithReturn(null, null);

        Assertions.assertEquals(expected, result);
    }*/
}
