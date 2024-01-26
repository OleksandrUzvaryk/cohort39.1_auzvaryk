package hometask;

import java.util.Random;

public class Demo {

    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(11);
        UserInput ui = new UserInput();
        String name = ui.inputText("input your name");
        double age = +ui.inputNumber("input your age");
        System.out.println("My name is => " + name + ", " + "My age is => " + age + ", " + "My random number is => " +randomNumber);












    }

}
