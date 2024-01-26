package hometask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Method {

    public static void main(String[] args) {


        Map<Integer,String> map = new HashMap<>();
        map.put(1,"A");
        map.put(2,"A");
        map.put(3,"B");
        map.put(4,"B");
        map.put(5,"C");
        map.put(6,"C");
        map.put(7,"D");




    }

  /*  public static Map<Integer,String> removeSameValues(Map<Integer,String> myMap){
        Map<Integer,String> result = new HashMap<>();
       Set<Integer> keys = myMap.keySet();
       myMap.containsKey(keys)

        return;
    }*/
}
   /* Работа с Map

        Реализовать метод removeSameValues(Map<K, V> map). Данный метод должен принимать в качестве аргумента
        мапу, ваша задача - Оставить в данной мапе исключительно пары с уникальным значением (не ключом). null -
        также может быть представлен, в этом случае допустимо оставить только одно null значение в мапе.

        упрощенная версия: использовать данный метод на основе removeSameValues(Map<String, String> map)*/