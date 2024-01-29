package hometask;

import java.util.HashMap;
import java.util.Map;

public class Demo {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1,"Audi");
        map.put(2,"Audi");
        map.put(3,"BMW");
        map.put(4,"VW");
        map.put(5,"VW");
        map.put(null,"125");
        map.put(157,null);
        map.put(27,"C");
        map.put(19,null);

        System.out.println("\nMap before sort " + map);
        System.out.println("----------------------------------------------------------------------------------------");
        Method service = new Method();
        service.removeSameValues(map);
        System.out.println("Map after sort 1 >" + map);
        service.removeSameValues2(map);
        System.out.println("Map after sort 2 >" +map);
       /* service.removeSameValues3(map);
        System.out.println("Map after sort 3 >" +map);*/

       /* map.remove(2,"BMW");
        System.out.println(map);*/

        Map<Integer,String> result = removeSameValues(map);
        System.out.println(map);


    }
    public static Map removeSameValues(Map<Integer, String> map) {
        Map<Integer, String> mapTempo = new HashMap<>();
        for (Map.Entry<Integer, String> pair : map.entrySet()) {
            if (!mapTempo.containsValue(pair.getValue())) {
                mapTempo.put(pair.getKey(), pair.getValue());
            }
        }
        map.clear();
        map.putAll(mapTempo);
        return map;
    }

}
