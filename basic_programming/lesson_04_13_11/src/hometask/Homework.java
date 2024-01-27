package hometask;


import java.util.Scanner;

public class Homework {
        public static void main(String[] args) {
            // создайте сканнер, который будет просить пользователя ввести число типа int,
            // запишите это число в переменную num

            Scanner scanner = new Scanner(System.in);

            int num = 19;



            numberToHexString(num);
           numberToOctaString(num);
            numberToBinaryString(num);
        }

        // в данном задании вы должны получить число и распечать строку, которая представляет его шестнадцатиричное представление:
        private static void numberToHexString(int num) {
         String numer = Integer.toHexString(num);
            System.out.println("Hexal " + numer);
        }

        // в данном задании вы должны получить число и распечать строку, которая представляет его восьмеричное представление:
        private static void numberToOctaString(int num) {
            String numer = Integer.toOctalString(num);
            System.out.println("Octal " + numer);

        }

        // в данном задании вы должны получить число и распечать строку, которая представляет его двоичное представление:
        private static void numberToBinaryString(int num) {
            String numer = Integer.toBinaryString(num);
            System.out.println("Binary " + numer);

        }
    }





















