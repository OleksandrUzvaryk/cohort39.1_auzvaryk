package practice;

import java.util.HashSet;
import java.util.Set;

public class Service {

    public Set <String> makeUnique (Set<String> first, Set<String> second) {
        Set<String> result = new HashSet<>();
        if (first != null){
            for (String el:second) {
                if (first.contains(el)){
                    first.remove(el);
                }else {first.add(el);}
            }
        }
        result.addAll(first);
    return result;
    }
}