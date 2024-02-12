package hometask.task2;

public class ServiceAreaAllShapes {

    public double findArea (Shape[]myShape){
        double result = 0;

        for (int i = 0; i <myShape.length ; i++) {
            result= result + myShape[i].area();
        }
        return result;
    }

}
