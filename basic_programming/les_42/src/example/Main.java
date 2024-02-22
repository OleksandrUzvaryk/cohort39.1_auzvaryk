package example;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<String> q = new LinkedList<>();

        q.add("Hello");
        q.add("Goodbye");
        q.add("how are you");
        for (String s:q
             ) {
            System.out.println(s);
        }
        System.out.println();

        List<String> l = new LinkedList<>();
        l.add("Hello");
        l.add("Goodbye");
        l.add("how are you");


        for (int i = 0; i <l.size() ; i++) {
            System.out.println(l.get(i));
        }
        Ite








    }

}
