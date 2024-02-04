package student_code;



        // пример класса предупреждения, когда пытаемся устаговить некорректный этаж
public class IncorrectFloorNumberException extends Exception{

            public IncorrectFloorNumberException(String message) {
                super("IncorrectFloorNumberExeption: " + message);
            }
        }
