package Hometask;

import java.io.*;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Put your name please: ");
        String name = scanner.nextLine();
        File newFile = new File("basic_programming/lesson_33/src/Hometask/newFile.txt");
        newFile.createNewFile();
        writeFileUsingFileWriter(String.valueOf(newFile),name);
        readFileUsingFileReader("basic_programming/lesson_33/src/Hometask/newFile.txt");


    }

    public static void writeFileUsingFileWriter(String filePath, String data) {
        try (FileWriter fw = new FileWriter(filePath, true)) { // Режим дозаписи
            fw.write(data);
            //fw.write("Hello "+data );
            System.out.println("Data written with FileWriter");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFileUsingFileReader(String filePath) {
        try (FileReader fr = new FileReader(filePath); BufferedReader br = new BufferedReader(fr)) {
            String line;
            System.out.println("Data read with FileReader:");
            while ((line = br.readLine()) != null) {
                System.out.println("Hello, " + line + " !");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
