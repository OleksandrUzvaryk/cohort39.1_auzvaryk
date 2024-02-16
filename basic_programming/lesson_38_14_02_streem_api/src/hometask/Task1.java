package hometask;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {
    /**
     *
     * List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
     *         List<Integer> output = new ArrayList<>();
     *         for(Integer i : input) {
     *         if(i % 2 == 0) {
     *         output.add(i);
     *         }
     **/

    public static void main(String[] args) {

        filtration();
    }

    static void filtration (){
        List<Integer> input = Arrays.asList(1,2,3,4,5);
        List<Integer> output =
                        input.stream() // открыли поток
                        .filter((e-> e % 2 ==0))// сортировали
                        .collect(Collectors.toList()); // сложили в коллекцию
        System.out.println(output);
    }
}
