package hometask;

import java.util.HashMap;
import java.util.Map;

public class Method {

    public void  removeSameValues(Map<Integer, String> workMap) {

        Map<Integer, String> reserv = new HashMap<>();

        for (Integer key : workMap.keySet()) {
            String value = workMap.get(key);
            if (workMap.containsValue(value)) {
                if (!reserv.containsValue(value))
                    reserv.put(key, value);
            }
        }
        workMap.clear();
        workMap.putAll(reserv);

    }

    public void removeSameValues2(Map<Integer, String> workMap) {

        for (Integer key : workMap.keySet()) {
            String currentValue = workMap.get(key);
            boolean isValueIn = workMap.containsValue(currentValue);
            if (workMap.containsValue(isValueIn)) {
                    workMap.remove(key);
            }
        }


    }
}
