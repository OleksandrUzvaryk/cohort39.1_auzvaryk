package student_code;

public class StudentsCode3 {

    public static void main(String[] args) {

       /* try {
            divide(100,0); // непроверяемая ошибка - пользователь ввел данные которые идут в конфликт с мат действями
        }catch (Exception exception){
            String message = exception.getMessage();
            System.out.println(message); // вывод инфо об ошибке в консоль через сиаут
           // exception.printStackTrace(); // вывод об ошибка системным образом, без остановки программы
        }*/

        // если метод выбрасывает задекларированный checked exception, как метод:
        // setFloor(int floor) -> throws IncorrectFloorNumberException <-
        // мы обязаны обработать вызов данного кода спецефическим образом,
        // то есть теперь мы не можем просто вызвать данный метод:
        // setFloor(13);
        // мы должны сделать это либо в блоке try-catch,
        // либо добавить аналогичное предупреждение в сигнатуру метода, откуда происходит вызов, в нашем случае:

        //      main(String[] args)     -> throws IncorrectFloorNumberException <-      {
        //          setFloor(13);
        //      }

        try {
            setFloor(13);
        } catch (IncorrectFloorNumberException incorrectFloorNumberException) {
            System.out.println("Work is over!");
        }


    }

    static int divide(int x, int y) {
        return x / y;
    }

    static void setFloor(int floor) throws IncorrectFloorNumberException { // указываем в методе что он может выбросить такой тип исключения
        if (floor == 13) {
            IncorrectFloorNumberException myException = new IncorrectFloorNumberException(" 13 floor not exist!");
            throw myException;// выбрасывание своих исключений в методе, заложена своя логика
            // если бы, IncorrectFloorNumberException унаследовался от одного из RuntimeException, то он бы относился к
            // unchecked exception и не было бы потребности указывать в сигнатуре метода, о том,
            // что данный метод может приводить к подобной ошибке
        } else if (floor > 15) {
            throw new IncorrectFloorNumberException("Not bigger than 15 floor!");
        }

    }


}
