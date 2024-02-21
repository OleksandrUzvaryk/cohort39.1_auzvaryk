import java.util.Scanner;

public class Example2 {


    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().toLowerCase();

        //StringBuilder sb = new StringBuilder();
        if (new StringBuilder(s).reverse().toString().equals(s)){
            System.out.println("Polindrom!");
        }else {
            System.out.println("Is not polindrom");
        }
        String s1 = scanner.nextLine().toLowerCase();
        System.out.println("new StringBuilder(s).reverse().toString().equals(s) = "
                + (new StringBuilder(s1).reverse().toString().equals(s1)?"Polindrom!": "Is not polindrom" ));
    }
}
