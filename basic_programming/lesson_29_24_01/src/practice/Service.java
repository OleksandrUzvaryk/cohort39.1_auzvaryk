package practice;

import java.util.HashSet;
import java.util.Set;

public class Service {

    public Set<String> makeUnique(Set<String> first, Set<String> second) {
        Set<String> result = new HashSet<>();
        if (first != null) {
            for (String el : first) {
                result.add(el);
            }
        }
        if (second != null) {
            for (String el : second) {
                if (result.contains(el)) {
                    result.remove(el);
                } else {
                    result.add(el);
                }
            }

        }
        return result;
    }
}