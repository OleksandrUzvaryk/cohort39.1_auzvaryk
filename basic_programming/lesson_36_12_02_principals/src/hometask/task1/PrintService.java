package hometask.task1;

import java.util.HashMap;

public class PrintService {


    public void printReport2(HashMap<String,Integer> myMap) {
        System.out.println("Print our report!");
        for (String str : myMap.keySet()
        ) {
            System.out.println(str + " - " + myMap.get(str));

        }
    }}
