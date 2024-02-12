package Hometask.task2;


/**
 * Создать интерфейс Shape с методом area(). Используйте этот интерфейс для создания классов Circle и Rectangle.
 * После этого реализуйте функцию, которая принимает массив объектов типа Shape и вычисляет общую площадь.
 *
 */

public class Demo {


    public static void main(String[] args) {

        Rectangle rectangle1 =new Rectangle(4,8);
        double rectangleArea = rectangle1.area();

        Circle circle1 = new Circle(2.39);
        double circleArea = circle1.area();

        System.out.println("Circle  area is => " + circleArea);
        System.out.println("Rectangle area is => " + rectangleArea);

        Shape [] shapeRepository = {new Circle(5), new Rectangle(4,2),
                new Circle(12.5), new Rectangle(23.7,14.3)};

        ServiceAreaAllShapes serviceAreaAllShapes = new ServiceAreaAllShapes();
        System.out.println("All shapes area is => " + serviceAreaAllShapes.findArea(shapeRepository));


    }

}
