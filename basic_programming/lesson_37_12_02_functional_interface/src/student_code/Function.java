package student_code;

public class Function {
    public static void main(String[] args) {
        java.util.function.Function<String,Integer> functionService = String::length;
        int length = functionService.apply("Privetmedved!");
        System.out.println(length);



    }
}
