import java.util.Scanner;

public class Example1 {



    public static void main(String[] args) {



        int [] arr = new int [50];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = i+1;
        }

        long start = System.nanoTime();
        String result = "[ ";
        for (int i = 0; i < arr.length ; i++) {
            result +=arr[i];
            if (i+1 != arr.length){
                result += ", ";
            }
        }
        result += " ]";
        //System.out.println(result);
        long end = System.nanoTime();
        System.out.println((end - start)/1000);
         start = System.nanoTime();

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arr.length ; i++) {
            stringBuilder.append(arr[i]);
            if (i+1 != arr.length){
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append( " ]");
        end = System.nanoTime();
        System.out.println((end - start)/1000);










    }

}
