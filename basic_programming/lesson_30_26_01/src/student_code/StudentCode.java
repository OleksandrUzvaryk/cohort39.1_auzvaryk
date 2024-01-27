package student_code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentCode {


    public static void main(String[] args) {

        Map<String, String> myMap = new HashMap<>();

        myMap.put("Germany", "Berlin");
        myMap.put("Austrie", "Viena");
        myMap.put("Ukraine", "Kiev");
        myMap.put("England", "London");

        Set<String> strings = myMap.keySet();
        System.out.println(strings);

        for (String key:strings
             ) {
            System.out.println(key + " - "+ myMap.get(key)) ;
        }

        ArrayList<String> values = new ArrayList<>(myMap.values());
        for (String value:values
             ) {
            System.out.println(value);
        }
      
      
       // System.out.println(values);

        System.out.println(myMap.containsKey("Germany"));
        System.out.println(myMap.containsValue(" sd"));

        myMap.put("Italy", null);
        myMap.put(null, "Rome");
        //myMap.put(null, null);
        myMap.put("Germany", "Munich");
        System.out.println(myMap);

        System.out.println(myMap.get(null));
        System.out.println(myMap.containsValue("vie"));

    }
}
