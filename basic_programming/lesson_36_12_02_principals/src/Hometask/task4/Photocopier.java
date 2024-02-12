package Hometask.task4;

public class Photocopier implements Print,Scan{

    String model;
    boolean isLaser;

    public Photocopier(String model, boolean isLaser) {
        this.model = model;
        this.isLaser = isLaser;
    }

    @Override
    public void print() {
        System.out.println("I can print!");
    }

    @Override
    public void scan() {
        System.out.println("I can scan!");
    }
}
