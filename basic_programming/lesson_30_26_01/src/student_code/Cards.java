package student_code;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Cards {

    private HashMap<String, String> word;
    private static Scanner scanner = new Scanner(System.in);
    private HashSet<String> incorrectWords = new HashSet<>();

    public void addNewWords (){
        System.out.println("Введите значение для слова");
        String key = scanner.nextLine().trim().toUpperCase();

        System.out.println("Введите перевод для слова");
        String value = scanner.nextLine().trim().toUpperCase();


       /* if (word.containsKey(key) && !value.equals(word.get(key))){
            System.out.println("Kartocka est i imeet ptrewod" + word.get(key) +". Hpotitr");
        }*/
    }
public void chek(){
    for (String key: word.keySet()
         ) {

    }
}


}
