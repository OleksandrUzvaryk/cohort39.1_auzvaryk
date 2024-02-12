package hometask.task1;

import java.util.HashMap;

public class ReportWindows {


    public HashMap makeReport2 (String version, Integer price){
        HashMap<String,Integer>myMap=new HashMap<>();
        for (int i = 0; i <11 ; i++) {
            myMap.put(version +i, price +(i+124));

        } return myMap;
    }




}
