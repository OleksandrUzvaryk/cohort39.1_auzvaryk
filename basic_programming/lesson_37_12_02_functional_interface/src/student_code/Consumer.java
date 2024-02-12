package student_code;

public class Consumer {
    public static void main(String[] args) {
     java.util.function.Consumer<String> consumer = System.out::println;

     consumer.accept("Privet !");

    }
}
