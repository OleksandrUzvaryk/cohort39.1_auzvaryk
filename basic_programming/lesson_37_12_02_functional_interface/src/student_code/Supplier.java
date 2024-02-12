package student_code;

public class Supplier {
    public static void main(String[] args) {
        java.util.function.Supplier<String> supplier = ()->"Privet!";
        String str = supplier.get();
        System.out.println(str);





    }
}
