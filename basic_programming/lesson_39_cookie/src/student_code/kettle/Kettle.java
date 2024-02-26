package student_code.kettle;

public class Kettle implements Boilable {

private int value;
private String color;
private String model;
private String material;

    @Override
    public void boil() {
        System.out.println("Kettle is boil the water!");
    }

    public Kettle(int value, String color, String model, String material) {
        this.value = value;
        this.color = color;
        this.model = model;
        this.material = material;










    }

}
