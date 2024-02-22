package cons.example;

public class App {

    public static void main(String[] args) {

      // Animal myAnimal = new Animal("Wolf", 9);
       Animal animal= new Cat("Murzik", 4, "Meikun");
      // Animal fish = new Fish("Gold", 3, 15, "gray");

        //System.out.println(myAnimal);
        System.out.println(animal.hashCode());
        //System.out.println(fish);

        if (animal instanceof Cat){
            Cat cat = (Cat) animal;
            System.out.println(cat.hashCode());
        }

















    }


}
