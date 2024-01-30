import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import theory.PracticeJUnit;

public class practiceJUnitNewTest {
    @Test
    public void testAverage() {
        int[] nums = {1, 2, 3};

        double expected = 2.0;
        double actual = PracticeJUnit.average(nums);

        Assertions.assertEquals(expected, actual);
    }
}
