package student_code;

public class Example2 {

    public static void main(String[] args) {
       int x = 120;
       reverse(x);
        System.out.println(reverse(x));



    }

    //123-321

// 0-> 0, -100-> -1, 120 -> 21
    public static int reverse(int number){

    int reverseNumber= 0;
    while (number !=0) {
        // отрезаем последнюю цифру
    int lastNumber = number % 10; // 123/10-> 3, 12/10 -> 2, 1/10 ->1
        // число которое возвращаем - набираем с конца
    reverseNumber = reverseNumber * 10 + lastNumber; // 0 + 3 =3, 3*10 + 2= 32, 32*10 + 1= 321
        // уменьшаем условие цикла
    number = number/10; // 123, 12,1

}
     return reverseNumber;
    }
}
