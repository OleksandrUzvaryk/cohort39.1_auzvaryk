package language;

public class App {
    public static void main(String[] args) {


        Greeter englishGreeter = new Greeter() {


            @Override
            public void printGreeting() {
                System.out.println("Hello World!!!");
            }
        };

        Greeter ukrGreeter = new Greeter() {
            @Override
            public void printGreeting() {
                System.out.println("Привіт Світ!!!");
            }
        };
            englishGreeter.printGreeting();
            ukrGreeter.printGreeting();

    }
}