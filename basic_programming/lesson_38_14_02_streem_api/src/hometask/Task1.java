package hometask;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {

    public static void main(String[] args) {

        filtration();

    }




    static void filtration (){
        List<Integer> input = Arrays.asList(1,2,3,4,5);

        Set<Integer> output =
                        input.stream()
                        .filter((e-> e % 2 ==0))
                        .collect(Collectors.toSet());
        System.out.println(output);
    }
}
