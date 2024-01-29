package student_code;

import java.util.HashMap;
import java.util.Map;

public class StudentCode {
    public static void main(String[] args) {


        Map<Integer,String> map = new HashMap<>();

        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");
        map.put(5, null);

        System.out.println(map.isEmpty() + " >Пусто или нет?");

        System.out.println(map.containsKey(5));
        System.out.println(map.getOrDefault(6, "ROCK")); // если ключ есть - значение, нет поместить в 6 - Рок

       /* Map<Integer,String> map = new HashMap<>();
        Map<Integer, Map<Integer,String>> myMap = new HashMap<>();
        myMap.put(10, map);

        System.out.println(myMap);

        Map<Integer,String> map = new HashMap<>();
        Map<Integer, Map<Integer,String>> myMap1 = new HashMap<>();
        myMap.put(1, map);
        Map<Integer, String> myMap2 = new HashMap<>();
        myMap2.put(1,map.get(1));*/

    }

}
