import hometask.Method;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class TestHometaskMethod {




    @Test
    public void testRemoveSameValues(){

        Map<Integer,String> testMap = new HashMap<>();
        testMap.put(1,"A");
        testMap.put(2,"A");
        testMap.put(3,"B");
        testMap.put(4,"A");
        testMap.put(5,"A");
        testMap.put(6,"C");
        testMap.put(null,"125");
        Map<Integer, String> expected = new HashMap<>();
        expected.put(null,"125");
        expected.put(1,"A");
        expected.put(3,"B");
        expected.put(6,"C");

        Method service = new Method();
        service.removeSameValues(testMap);
        Assertions.assertEquals(expected,testMap);

    }

@Test
void testRemoveSameValues2(){

    Map<Integer,String> testMap2 = new HashMap<>();
    testMap2.put(1,"A");
    testMap2.put(2,"A");
    testMap2.put(3,"B");
    testMap2.put(4,"A");
    testMap2.put(5,"A");
    testMap2.put(6,"C");
    testMap2.put(null,"125");

    Map<Integer, String> expected = new HashMap<>();
    expected.put(null,"125");
    expected.put(1,"A");
    expected.put(3,"B");
    expected.put(6,"C");

    Method service = new Method();
    service.removeSameValues2(testMap2);
    Assertions.assertEquals(expected,testMap2);

}




}
