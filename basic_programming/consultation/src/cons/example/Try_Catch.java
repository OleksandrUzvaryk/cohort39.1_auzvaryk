package cons.example;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_Catch {

   public static  void readFile ()throws IOException{
       throw new IOException("No file found");
   }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number");

        try {int numb = scanner.nextInt();
            System.out.println("Your number is " + numb);
        }catch (InputMismatchException e){
            System.out.println("Error");
        }













    }

}
