import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import theory.PracticeJUnit;

public class practiceJUnitNewTest {


    @Test
    public void testMax (){
        int a =5;
        int b = 15;
        int expected = 15;
        int actual = PracticeJUnit.max(a,b);

        Assertions.assertEquals(expected,actual);
    }



















    @Test
    public void testAverage() {
        int[] nums = {1, 2, 3};

        double expected = 2.0;
        double actual = PracticeJUnit.average(nums);

        Assertions.assertEquals(expected, actual);
    }
@Test
    public  void testReverseStringCorrect(){
        String str = "ABC";
        String expected = "CBA";

        String result = PracticeJUnit.reverseString(str);
        Assertions.assertEquals(expected,result);
    }

}
