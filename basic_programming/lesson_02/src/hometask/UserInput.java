package hometask;

import java.util.Scanner;

public class UserInput {

    public String inputText(String message){
        System.out.println(message);
        Scanner scanner= new Scanner(System.in);
        String result = scanner.nextLine();
        return result;
    }

    public double inputNumber(String message){
        System.out.println(message);
        Scanner scanner= new Scanner(System.in);
        double result = scanner.nextDouble();
        return result;
    }



}
