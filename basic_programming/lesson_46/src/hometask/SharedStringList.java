package hometask;

import java.util.ArrayList;
import java.util.List;

public class SharedStringList {

    private List<String> stringList = new ArrayList<>();

    public synchronized void addString(String str) {
        stringList.add(str);
    }

    public synchronized List<String> getStringList() {
        return new ArrayList<>(stringList);
    }
}



