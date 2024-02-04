package Hometask;

public class Demo {


    public static void main(String[] args) throws IncorrectSizeExeption {

        Methods service = new Methods();

    try {
        service.calculatorAreaTriangle(10, 0, 13);
    }catch (IncorrectSizeExeption incorrectSizeExeption){
        System.out.println("Work ower");
    }


    }
    
}
