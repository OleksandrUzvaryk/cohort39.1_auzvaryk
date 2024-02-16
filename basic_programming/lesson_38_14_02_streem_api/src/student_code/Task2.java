package student_code;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2 {

    public static void main(String[] args) {
      second();
      second2();

    }

    // Задача 2: Собрать все строки в одну, разделенные запятой.
   static void second() {
        List<String> list = Arrays.asList("apple", "banana", "cherry");
        Stream<String> stream = list.stream();
        String string = stream.reduce((el1,el2)->el1+" ,"+el2).orElse("");
        System.out.println(string);

    }

    static void second2() {
        List<String> list = Arrays.asList("apple", "banana", "cherry");
        Stream<String> stream = list.stream();
        String myString = stream.collect(Collectors.joining(" ,"));
        System.out.println(myString);

    }
}
