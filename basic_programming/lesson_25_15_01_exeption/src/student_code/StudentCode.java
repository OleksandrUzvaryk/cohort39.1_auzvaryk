package student_code;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentCode {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        //int x =scanner.nextInt(); // если вводим не число - получаем ошибку InputMismatchException
        int x;
        try {
             x = scanner.nextInt();

        } catch (InputMismatchException exception) {

            String exeptionMessage = exception.getMessage(); // возврат строки с инфо о ошибке
            //System.out.println(exeptionMessage);
            //exception.printStackTrace(); // вывод ошибки в консоль
            x = -1;
        }
        System.out.println("Данные введены некорректно, вместо цифр - переданы символы. Введите корректные данные");

       /* try {getFirstIndex(null,10);

        }catch (NullPointerException nullPointerException){
            System.out.println(nullPointerException.getMessage());
        }
*/

    }

   static public int  getFirstIndex (int [] array, int target){
        for (int i = 0; i <array.length ; i++) {
            if (array[i] == target){
                return i;
            }
        }return -1;
    }










}
