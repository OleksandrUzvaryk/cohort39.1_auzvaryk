package transport;

public abstract class Vehicle {

    protected double speed;
    protected double fuelAmount;
    protected double fuelPerKm;

    public Vehicle(double speed, double fuelAmount, double fuelPerKm) {
        this.speed = speed;
        this.fuelAmount = fuelAmount;
        this.fuelPerKm = fuelPerKm;
    }

    public abstract double calculateFuelConsumption(double distance);



    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public double getFuelPerKm() {
        return fuelPerKm;
    }

    public void setFuelPerKm(double fuelPerKm) {
        this.fuelPerKm = fuelPerKm;
    }
}
