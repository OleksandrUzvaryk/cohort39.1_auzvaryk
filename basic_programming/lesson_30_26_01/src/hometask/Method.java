package hometask;

import java.util.HashMap;
import java.util.Map;

public class Method {

    public void removeSameValues(Map<Integer, String> workMap) {

        Map<Integer, String> reserv = new HashMap<>();

        for (Integer key : workMap.keySet()) {
            String value = workMap.get(key);
            if (workMap.containsValue(value)) {
                if (!reserv.containsValue(value))
                    reserv.put(key, value);
            } /*else {
                reserv.remove(key);
            }*/
        }
        workMap.clear();
        workMap.putAll(reserv);
    }

    public void removeSameValues2(Map<Integer, String> workMap) {

        for (Integer key : workMap.keySet()) {
            String value = workMap.get(key);
            if (workMap.containsValue(workMap.containsValue(value))) {
                    workMap.remove(key);
            }
        }

    }


    public void removeSameValues3(Map<Integer,String> map) {
        for (Map.Entry <Integer, String> entry : map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            if (map.containsValue(value)){
                map.remove(key);
            }

            System.out.println(map);
        }
    }


}
