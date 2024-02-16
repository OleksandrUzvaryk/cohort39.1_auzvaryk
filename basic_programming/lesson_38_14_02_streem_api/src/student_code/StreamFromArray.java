package student_code;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamFromArray {
    public static void main(String[] args) {


        Integer []nums = {};

        Stream<Integer> streamExample = getStreamFromArray();

        Integer oddSum = streamExample
                .filter(e -> e % 2 == 1)
                .reduce((c1, c2) -> c1 + c2)
                .orElse(0);


        // конвеерные операции

        getStreamFromArray()
                .filter(e-> e>3) // работает как условие иф
                .sorted((e1,e2)->e2-e1) // сортировка от большего к меньшему, через компаратор - отнимаем хеш код
                //.limit(2) // огрничение вывода
                //.skip(2) // Пропустит указанное вами количество элементов
                .distinct() //  вернет элементы без повторов
                .peek(e-> System.out.print(e + " "))// вернет стрим с исходными элементами
                .map(x-> x+10)
                .forEach(v-> System.out.println(v));// вывод на печать как в фор ич*/

        // терминальные операции

        System.out.println(getStreamFromArray().findFirst().get()); // Вернет элемент, соответствующий условию, который стоит первым
        System.out.println(getStreamFromArray()
                        .filter(x-> x>5)
                        .findAny().get()); // Вернет любой элемент, соответствующий условию

        Set<Integer>set = getStreamFromArray().filter(x->x>2).collect(Collectors.toSet()); // Соберет результаты обработки в коллекции и не только
//      long count = getStreamFromArray().distinct().count(); //Посчитает и выведет, сколько элементов, соответствующих условию
        boolean containTen = getStreamFromArray().anyMatch((x->x ==10)); //True, когда хоть один элемент соответствует условиям
        System.out.println("containTen = " + containTen);
        boolean notContainTen = getStreamFromArray().noneMatch((x->x ==10)); //True, когда ни один элемент не соответствует условиям
        System.out.println("notContainTen = " + notContainTen);
        boolean allMatch = getStreamFromArray().allMatch(x->x>-1); // True, когда все элементы соответствуют условиям
        System.out.println("allMatch = " + allMatch);
        Integer min = getStreamFromArray().min((e1,e2)-> e1-e2).get();
        Integer max =  getStreamFromArray().max((e1,e2)-> e1-e2).get();
        System.out.println("min = " + min);
        System.out.println("max = " + max);

        Integer [] nums2 = getStreamFromArray().toArray(Integer[]::new); // Приведет значения стрима к массиву
        System.out.println("Arrays.toString(nums2) = " + Arrays.toString(nums2));

    }

    static Stream<Integer> getStreamFromArray() {
       Integer [] nums = {1,2,3,4,5,6,7,5,4,7,6,5,4,9};
        return Arrays.stream(nums);
        }
    }

