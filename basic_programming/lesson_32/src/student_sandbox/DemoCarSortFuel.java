package student_sandbox;

import java.util.TreeSet;

public class DemoCarSortFuel {

    public static void main(String[] args) {

        TreeSet<Car> myGarage = new TreeSet<>();
        Car car1 = new Car("Audi", "A7", 57000,false);
        Car car8 = new Car("Toyota", "Corola", 18000,false);
        Car car9 = new Car("Mercedes", "S221", 180000,true);
        Car car2 = new Car("Audi", "Q7", 54000,false);
        Car car3 = new Car("Volvo", "C30", 11000,true);
        Car car4 = new Car("BMW", "X7", 75000,false);
        Car car5 = new Car("Mercedes", "S221", 120000,true);
        Car car6 = new Car("Volvo", "C30", 11000,false);
        // Car car7 = new Car(null, "Maccan", 63000,false);



        myGarage.add(car1);
        myGarage.add(car2);
        myGarage.add(car3);
        myGarage.add(car4);
        myGarage.add(car5);
        myGarage.add(car6);
        // myGarage.add(car7);
        myGarage.add(car8);
        myGarage.add(car9);
        for (Car car:myGarage
        ) {
            System.out.println(car);

        }










    }



}
