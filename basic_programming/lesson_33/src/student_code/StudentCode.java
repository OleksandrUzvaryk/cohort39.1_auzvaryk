package student_code;

import java.io.File;
import java.util.Arrays;

public class StudentCode {
    public static void main(String[] args) {

        String path = "basic_programming/lesson_33/src/student_code/file.txt";
        String path2 = "basic_programming/lesson_33/src/student_code/";
        String unExist = " ";
        // C:\Users\User\IdeaProjects\cohort39.1_auzvaryk\basic_programming\lesson_33\src\student_code\file.txt

        File file = new File(path); //    доступ к методам
        File dir = new File(path2);
        File unEx = new File(unExist);
        System.out.println("file exist is => " + file.exists()); // метод существует или нет , тру фолс

        System.out.println("Абсолютный путь к файлу => " + file.getAbsolutePath()); // путь к файлу

        System.out.println("Размер файла  => " + file.length()); // количество символов в пути

        System.out.println("Указание на директорию или файл=> " + file.isFile());
        System.out.println("Указание на директорию или файл=> " + file.isDirectory());

        System.out.println("Указание на директорию или файл=> " + dir.isFile());
        System.out.println("Указание на директорию или файл=> " + dir.isDirectory());

        //System.out.println("Существует ли файл => " + unEx.createNewFile());


        System.out.println("Удален ли файл => " + unEx.delete());

        System.out.println("" + file.listFiles());
        System.out.println("" + Arrays.toString(dir.listFiles()));





    }
}
