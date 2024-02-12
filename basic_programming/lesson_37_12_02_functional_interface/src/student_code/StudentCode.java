package student_code;

import java.util.LinkedList;
import java.util.Queue;

public class StudentCode {
    public static void main(String[] args) {

        MyFunctionalInterface service = ()-> System.out.println("Hello World!");
        service.myAbstractMethod();

        MyFunctionalInterface service2 = Example::SayPrivet;
        service2.myAbstractMethod();

        MyFunctionalInterface service3 = MyClass::new;
        service3.myAbstractMethod();









    }
}
