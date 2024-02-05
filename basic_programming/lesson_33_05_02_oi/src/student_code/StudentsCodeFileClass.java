package student_code;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class StudentsCodeFileClass {

    public static void main(String[] args) throws IOException {
// абсолютный путь к файлу C:\Users\User\IdeaProjects\cohort39.1_auzvaryk\basic_programming\lesson_33\src\student_code\file.txt
        String path = "basic_programming/lesson_33/src/student_code/file.txt"; // путь от репозитория
        String dir = "basic_programming/lesson_33/src/student_code/";
        String unexistedPath = "basic_programming/lesson_33/src/student_code/file_1.txt";
        String unexistedDirPath = "basic_programming/lesson_33/src/student_code/files_directory";
        File file = new File(path);
        File directory = new File(dir);
        File unexistedFile = new File(unexistedPath);
        File unexistedDir = new File(unexistedDirPath);


        System.out.println("file.exists() = " + file.exists()); // есть ли файл/папка
        System.out.println("file.getAbsolutePath() = " + file.getAbsolutePath()); // получение абсолютного пути к файлу
        System.out.println("file.length() = " + file.length()); // длина символов в файле
        System.out.println("file.isFile() = " + file.isFile()); // file?
        System.out.println("file.isDirectory() = " + file.isDirectory());//directory?
        System.out.println("file.isFile() = " + directory.isFile()); // file?
        System.out.println("file.isDirectory() = " + directory.isDirectory());//directory?
        System.out.println("file.createNewFile() = " + file.createNewFile()); // false - allready exist, true - create new file
        System.out.println("unexistedFile.createNewFile() = " + unexistedFile.createNewFile());
        System.out.println("unexistedFile.delete() = " + unexistedFile.delete()); // if delete - true
        System.out.println("file.listFiles() = " + file.listFiles());
        System.out.println("directory.listFiles() = " + Arrays.toString(directory.listFiles())); // только для директорий
        System.out.println("unexistedDir.mkdir() = " + unexistedDir.mkdir()); // добавить папку
        System.out.println("unexistedDir.delete() = " + unexistedDir.delete());// удалить папку
        unexistedFile.createNewFile(); // повторное создание удаленного файла
        unexistedFile.renameTo(new File(dir + " new_file.pdf")); //переименовали файл
        System.out.println("file.lastModified() = " + file.lastModified()); // ms from change actions
        System.out.println("file.canRead() = " + file.canRead());
        System.out.println("file.canWrite() = " + file.canWrite());

    }

}
