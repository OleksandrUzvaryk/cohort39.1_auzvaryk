package practice;

import java.util.HashSet;
import java.util.Set;

public class Demo {


    public static void main(String[] args) {

        Set<String> first = new HashSet<>();
        Set<String> second = new HashSet<>();

        first.add("1");
        first.add("2");
        first.add("3");
        first.add("4");
        first.add("5");
        first.add("6");

        second.add("5");
        second.add("6");
        second.add("7");
        second.add("8");
        second.add("9");

        Service service = new Service();
        Set<String> result =  service.makeUnique(first,second);
        System.out.println(result);
        System.out.println(first);
        System.out.println(second);



    }

    public static Set<String> makeUnique(Set<String> first, Set<String> second) {
        Set<String> result = new HashSet<>();
        if (first != null) {
            for (String el : first) {
                result.add(el);
            }
        }
        if (second != null) {
            for (String el : second) {
                if (result.contains(el)) {
                    result.remove(el);
                } else {
                    result.add(el);
                }
            }

        }
        return result;
    }










}

