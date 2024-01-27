import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        char[] word = {'h', 'e', 'l', 'l', 'o'};
        String strWord = "hello";
        String strWordSecond = "hello";

        Scanner scanner = new Scanner(System.in);

        String heapString1 = new String("heap string");
        String heapString2 = new String("heap string");

        String stringFromArrayOfChar = new String(word);
        System.out.println(stringFromArrayOfChar);

        System.out.println(word);

        String example = "hi";

        System.out.println(example.toUpperCase());
        System.out.println(example);

        example = example.toUpperCase();

        System.out.println(example);
    }
}
