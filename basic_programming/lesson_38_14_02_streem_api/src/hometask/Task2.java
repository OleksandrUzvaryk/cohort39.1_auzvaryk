package hometask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {

    /**
     * List<String> input = Arrays.asList("apple", "banana", "cherry");
     *         List<Integer> output = new ArrayList<>();
     *         for(String s : input) {
     *             output.add(s.length());
     *         }

     */
    public static void main(String[] args) {
        findLength();
    }
    public static void findLength () {
        List<String> input = Arrays.asList("apple", "banana", "cherry");
        List<Integer> output = input.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(output);

        }
    }


