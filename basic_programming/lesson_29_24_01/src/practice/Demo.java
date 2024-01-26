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
        Set<String> result1 =  service.makeUnique(first,second);
        System.out.println(result1);
        System.out.println(first);
        System.out.println(second);

        Set<String> result2 = service.makeSame(first,second);
        System.out.println(result2);




    }
}

