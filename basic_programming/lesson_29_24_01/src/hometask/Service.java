package hometask;

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

    public Set<String> makeSame(Set<String> first, Set<String> second) {
        Set<String> result = new HashSet<>();

        if (first != null) {
            for (String el : first) {
                result.add(el);
            }
        }
        for (String el2 : second) {
            if (result.contains(el2)) {
                result.add(el2);
            }
        }
        for (String el3 : first) {
            if (!second.contains(el3)) {
                result.remove(el3);
            }
        }

        return result;
    }

}