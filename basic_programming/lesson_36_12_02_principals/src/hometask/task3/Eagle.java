package hometask.task3;

public class Eagle extends Bird {

    public Eagle(String name, int age) {
        super(name, age);
    }

    @Override
    public void fly() {
        System.out.println("Realy good flying skills ! That eagle!");;
    }
}
