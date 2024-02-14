package student_code;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFromFile {
    public static void main(String[] args) throws IOException {
        Collection<Integer> collection = Set.of(1, 2, 3, 4, 5, 6, 7);

        Integer oldOdd = 0;
        for (Integer i : collection) {
            if (i % 2 != 0) {
                oldOdd += i;
            }
        }
        //System.out.println("oldOdd = " + oldOdd);

        Stream<Integer> streamExample = getStreamFromFile();

        Integer oddSum = streamExample
                .filter(e -> e % 2 == 1)
                .reduce((c1, c2) -> c1 + c2)
                .orElse(0);

        System.out.println("oddSum = " + oddSum);
    }

    static Stream<Integer> getStreamFromFile() throws IOException {
        Stream<String> fromFiles = Files.lines(Paths.get("basic_programming/lesson_38_14_02_streem_api/src/student_code/my_file"));
        {


            return fromFiles
                    .map(e -> Integer.parseInt(e))
                    .collect(Collectors.toList()).stream();
        }
    }
}


