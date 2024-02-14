package student_code;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Stream;

public class StreamFromValue {

    public static void main(String[] args) {
        Collection<Integer> collection = Set.of(1, 2, 3, 4, 5, 6, 7);

        Integer oldOdd = 0;
        for (Integer i : collection) {
            if (i % 2 != 0) {
                oldOdd += i;
            }
        }
        //System.out.println("oldOdd = " + oldOdd);

        Stream<Integer> streamxExample = getStreamFromCValue();

        Integer oddSum = streamxExample
                .filter(e -> e % 2 == 1)
                .reduce((c1, c2) -> c1 + c2)
                .orElse(0);

        System.out.println("oddSum = " + oddSum);
    }
    static Stream<Integer>getStreamFromCValue(){  // создание стрима на основании значений
        return Stream.of(1, 2, 3, 4, 5, 6, 7);
    }

}


