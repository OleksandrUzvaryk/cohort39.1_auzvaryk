package student_code;

public interface Predicate {
    public static void main(String[] args) {

        java.util.function.Predicate<String> predicate = String::isEmpty;
        boolean result = predicate.test("9");
        System.out.println(result);







    }
}
