package student_sandbox;

import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class StudentClassWork {

    public static void main(String[] args) {


        HashSet<String> map = new HashSet<>(31,32);
        map.add("a,");

        TreeSet<Integer>myMap = new TreeSet<>();
        //myMap.add(null);
        myMap.add(1);
        myMap.add(2);
        myMap.add(3);
        myMap.add(1);
        myMap.add(2);
        myMap.add(1);

        System.out.println("TreeSet => " + myMap);


        TreeMap<Integer,String> myMap2 = new TreeMap();
       //myMap2.put(null,"A");
        myMap2.put(1,"A");
        myMap2.put(1,"A");
        myMap2.put(2,"A");
        myMap2.put(1,"A");
        myMap2.put(3,"A");
        myMap2.put(1,"A");
        System.out.println("TreeMap => " + myMap2);


    }
}
