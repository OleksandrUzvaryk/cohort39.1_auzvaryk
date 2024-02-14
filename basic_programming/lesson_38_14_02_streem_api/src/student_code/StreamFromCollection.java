package student_code;

import java.util.*;
import java.util.stream.Stream;

public class StreamFromCollection {
    public static void main(String[] args) {

        Collection<Integer> collection = Set.of(1, 2, 3, 4, 5, 6, 7);

        Integer oldOdd = 0;
        for (Integer i : collection) {
            if (i % 2 != 0) {
                oldOdd += i;
            }
        }
        //System.out.println("oldOdd = " + oldOdd);

        Stream<Integer> streamxExample = getStreamFromCollection(collection);

        Integer oddSum = streamxExample
                .filter(e -> e % 2 == 1)
                .reduce((c1, c2) -> c1 + c2)
                .orElse(0);
        System.out.println("oldOdd = " + oldOdd);
        System.out.println("oddSum = " + oddSum);
    }
    static Stream<Integer>getStreamFromCollection(Collection<Integer>collection){  // создание стрима на основании коллекции
        return collection.stream();
    }

}
