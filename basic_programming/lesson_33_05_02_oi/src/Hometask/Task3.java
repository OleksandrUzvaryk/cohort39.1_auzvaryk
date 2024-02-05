package Hometask;

import java.io.*;

public class Task3 {

    public static void main(String[] args) {

        String unexist = "basic_programming/lesson_33/src/Hometask/wrong.txt";
        File wrongFile = new File(unexist);
        readFileUsingFileReader(unexist);




    }


    public static void readFileUsingFileReader(String filePath) {
        try (FileReader fr = new FileReader(filePath); BufferedReader br = new BufferedReader(fr)) {
            String line;
            System.out.println("Data read with FileReader:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.getMessage();
            System.out.println("File not found: nonexistent.txt");
        } catch (IOException e) {

            throw new RuntimeException(e);
        }
    }


}
