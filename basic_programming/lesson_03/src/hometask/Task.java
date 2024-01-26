package hometask;

import java.util.Scanner;

public class Task {

        public static void main(String[] args) {
            // Вызов метода для конвертации температур
            convertTemperature();
            // Вызов метода для вычисления площади круга
            calculateCircleArea();
        }
        public static void convertTemperature() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter temperature : ");
            double temperature =scanner.nextDouble();
            scanner.nextLine();
            System.out.println("You put temp in F. ? Put true. If you put in C. - put false!");
            boolean type = scanner.nextBoolean();
            scanner.nextLine();
            if (type){
               double celsium = (temperature - 32) * 5/9 ;
                System.out.println("Temp in celsium " + celsium);
            }else {double farengeit = temperature * 9/5 + 32;  System.out.println("Temp in farengeit " + farengeit);}
        }

        public static void calculateCircleArea() {
            System.out.println("Lets find square of round! Put the radius");
            Scanner scanner = new Scanner(System.in);
            double radius = scanner.nextDouble();
            scanner.nextLine();
            double square = Math.PI * radius * radius;
            System.out.println("Our square is - " + square);
        }
    }

