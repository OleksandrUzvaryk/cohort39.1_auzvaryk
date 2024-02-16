package hometask;

import java.util.Arrays;
import java.util.List;

public class Task3 {
    /**
     *  List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
     *         int count = 0;
     *         for(Integer i : input) {
     *             if(i % 2 == 0) {
     *                 count++;
     *             }
     *         }
     */

    public static void main(String[] args) {
    checkCounter();
    }
    public static void checkCounter(){
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5,24,-210);
        Integer counter = Math.toIntExact(input.stream()
                .filter((e -> e % 2 == 0))
                .count());
        System.out.println(counter);




    }

}
