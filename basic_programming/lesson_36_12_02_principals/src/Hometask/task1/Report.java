package Hometask.task1;

import java.util.ArrayList;
import java.util.HashMap;

public class Report {

    /**

Класс в котором лежат 2 разных метода

     */

    public HashMap makeReport (String version, Integer price){ // создание рандомного репорта
        HashMap<String,Integer>myMap=new HashMap<>();
        for (int i = 0; i <11 ; i++) {
           myMap.put(version +i, price +(i+124));

        } return myMap;
    }

    public void printReport(HashMap<String,Integer>myMap){ // печать мапы с отчетом
        System.out.println("Print our report!");
        for (String str: myMap.keySet()
             ) {
            System.out.println(str + " - " + myMap.get(str));

        }
    }
}
