package hometask;

import java.util.HashMap;
import java.util.Map;

public class Method {

    public void removeSameValues(Map<Integer, String> workMap){
        Map<Integer, String>reserv = new HashMap<>();
        for (Integer key : workMap.keySet()) {
            String value = workMap.get(key);
            if (workMap.containsValue(value)){
               if (!reserv.containsValue(value))
                reserv.put(key,value);
            }else {reserv.remove(key);}
        }
        workMap.clear();
        workMap.putAll(reserv);
    }
}
