package Hometask.task4;

public class Printer implements Print {

    String producer;
    boolean inStorage;

    public Printer(String producer, boolean inStorage) {
        this.producer = producer;
        this.inStorage = inStorage;
    }

    @Override
    public void print() {
        System.out.println("Make print!");
    }
}
