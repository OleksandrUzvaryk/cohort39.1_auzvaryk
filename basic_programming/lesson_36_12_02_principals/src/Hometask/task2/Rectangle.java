package Hometask.task2;

public class Rectangle implements Shape{
private double sideA;
private double SideB;

    public Rectangle(double sideA, double getSideB) {
        this.sideA = sideA;
        this.SideB = getSideB;
    }

    @Override
    public double area() {
        return sideA*SideB;
    }
}
