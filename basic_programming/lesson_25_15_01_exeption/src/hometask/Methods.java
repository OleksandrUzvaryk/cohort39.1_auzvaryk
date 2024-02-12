package hometask;

public class Methods {


    public static double calculatorAreaTriangle(double sideA, double sideB, double sideC) throws IncorrectSizeExeption {
        if (!figureCanExist(sideA,sideB,sideC)){
            throw new IncorrectSizeExeption("Некоректно введены размеры фигуры " + sideA + ", " + sideB + ", " + sideC);
        }
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));

    }

    public static boolean figureCanExist(double sideA, double sideB, double sideC) {
        return sideA > 0 && sideB > 0 && sideC > 0 &&
                sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA;
    }


}



