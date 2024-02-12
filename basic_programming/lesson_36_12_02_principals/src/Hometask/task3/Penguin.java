package Hometask.task3;

public class Penguin extends Bird{
    public Penguin(String name, int age) {
        super(name, age);
    }

    @Override
    public void fly() {
        System.out.println("I am bird! But i cant fly(! That is penguin!");
    }
}
