package student_sandbox;

public class Car implements Comparable<Car>  {

    private String producer;
    private String model;
    private Integer price;
    private Boolean isDiesel;

    public Car(String producer, String model, int price, boolean isDiesel) {
        this.producer = producer;
        this.model = model;
        this.price = price;
        this.isDiesel = isDiesel;
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public boolean isDiesel() {
        return isDiesel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", isDiesel=" + isDiesel +
                '}';
    }





   /*@Override

    public int compareTo(Car carForCompare) { // производитель, модель, цена, тип топлива
        int compareProducer = this.producer.compareTo(carForCompare.producer);
        if (compareProducer != 0) {
            return compareProducer;
        }
        int compareModel = this.model.compareTo(carForCompare.model);
        if (compareModel != 0) {
            return compareModel;
        }

        int comparePrice = this.price.compareTo(carForCompare.price);
        if (comparePrice != 0) {
            return comparePrice;
        }

        int compareFuel = this.isDiesel.compareTo(carForCompare.isDiesel);
        if (compareFuel != 0) {
            return compareFuel;
        }
        return compareFuel;


    }*/







    /*@Override

    public int compareTo(Car carForCompare) {  // цена, модель,тип топлива, производитель

        int comparePrice = this.price.compareTo(carForCompare.price);
        if (comparePrice != 0) {
            return comparePrice;
        }

        int compareModel = this.model.compareTo(carForCompare.model);
        if (compareModel != 0) {
            return compareModel;
        }

        int compareFuel = this.isDiesel.compareTo(carForCompare.isDiesel);
        if (compareFuel != 0) {
            return compareFuel;
        }

        int compareProducer = this.producer.compareTo(carForCompare.producer);
        if (compareProducer != 0) {
            return compareProducer;
        }

        return compareProducer;


    }*/




 @Override

    public int compareTo(Car carForCompare) {  // тип топлива, цена ,модель, производитель

     int compareFuel = this.isDiesel.compareTo(carForCompare.isDiesel);
     if (compareFuel != 0) {
         return compareFuel;
     }

        int comparePrice = this.price.compareTo(carForCompare.price);
        if (comparePrice != 0) {
            return comparePrice;
        }

        int compareModel = this.model.compareTo(carForCompare.model);
        if (compareModel != 0) {
            return compareModel;
        }



        int compareProducer = this.producer.compareTo(carForCompare.producer);
        if (compareProducer != 0) {
            return compareProducer;
        }

        return compareProducer;


    }



}

