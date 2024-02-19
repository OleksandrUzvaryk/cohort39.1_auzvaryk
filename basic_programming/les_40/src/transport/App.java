package transport;

public class App {
    public static void main(String[] args) {

    Car car = new Car("Audi", 120, 200,0.11);
    car.setPassengers(3);
        System.out.println(car.calculateFuelConsumption(600));
        FreightTrain train = new FreightTrain(50,80,5000,0.2);
        train.setCargo(60_000);
        System.out.println(train.calculateFuelConsumption(600));










    }
}
