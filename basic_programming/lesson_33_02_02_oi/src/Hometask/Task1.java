package Hometask;

import java.io.*;

public class Task1 {
    public static void main(String[] args) {
        String path = "basic_programming/lesson_33/resources/file3.txt";
        String plusText = "\nHello, World!";
        readFileUsingFileReader(path);
        writeFileUsingFileWriter(path,plusText);
    }

    public static void readFileUsingFileReader(String filePath) {
        try (FileReader fr = new FileReader(filePath); BufferedReader br = new BufferedReader(fr)) {
            String line;
            System.out.println("Data read with FileReader:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writeFileUsingFileWriter(String filePath, String data) {
        try (FileWriter fw = new FileWriter(filePath, true)) { // Режим дозаписи
            fw.write(data);
            System.out.println("Data written with FileWriter");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
