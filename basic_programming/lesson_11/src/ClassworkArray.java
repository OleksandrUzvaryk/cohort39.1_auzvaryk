import java.io.FileNotFoundException;
import java.util.Arrays;

import java.util.Random;

/**
 * Массив в Java (Java Array) — это структура данных, которая хранит набор пронумерованных значений одного типа
 * (элементы массива). Допустим, у нас есть класс из 10 учеников и нам нужно сохранить их оценки. Для этого можно
 * создать 10 переменных: int mark1 = 4; int mark2 = 3; ... int mark10 = 2;
 * <p>
 * Для решения это задачи (аккамулирования переменных одного типа) в Java используются массивы. Для решения предущей
 * задачи, достаточно создать массив необходимой длинны, задать массив можно несколькими разными способами, основные
 * приведены ниже (предпочтительная запись - 1): 1)  тип_массива[] название_переменной = new
 * тип_массива[размер_массива]; 2)  тип_массива название_переменной[] = new тип_массива[размер_массива];
 * <p>
 * То есть, для решения задачи с оценками, мы создадим следующий массив: int[] marks = new int[10]; где int[] - тип
 * переменных, которые будут храниться в массиве marks - имя переменной (имя массива) new - означает, что мы создаем
 * новый массив. Несмотря на то, что данный массив хранит в себе примитивные переменные, ключевое слово new, при его
 * создании, говорит нам что массивы - ссылочные типы данных. int[10] - массив какого типа и размера мы создаем. Тип
 * данных не может отличаться от того, который мы задали изначально, число в квадратных скобках говорит нам о том,
 * сколько переменных будет хранить данный массив (в нашем случае их 10). Размер массива не может быть изменен (после
 * инициализации). Однако ссылка на массив может указывать на другой массив большей или меньшей длины. Размер задается
 * значениями диапозона int, то есть мы не можем создать массив размерностью больше Integer.MAX_VALUE = 2_147_483_647;
 * Инициализация значений массива. При инициализации массива способами 1 и 2, все элементы массива будут иметь значение
 * по умолчанию. Для byte, short, int, long - это 0; для float и double — 0.0; для char — \0; для boolean — false, а для
 * String и любого другого ссылочного типа это null. Для доступа к элементу массива указывают имя массива и номер ячейки
 * в квадратных скобках. Например, обратимся к первому элементу массива и выведем его значение: marks[0]; // 0 Для
 * заполнения элементов массива (установления значения для каждого отдельного элемента), необходимо обратиться к каждому
 * по индексу и присвоить значения с помощью оператора «=»: marks[0] = 5; // первый элемент - индекс 0, значение для
 * этого элемента - 5 marks[1] = 3; // второй элемент - индекс 1, значение для этого элемента - 3 ... marks[9] = 4; //
 * десятый элемент - индекс 9, значение для этого элемента - 4
 * <p>
 * Теперь у нас есть массив, куда мы записали оценки десяти учеников. С этим уже удобнее работать, чем объявлять 10
 * переменных, но можно записать ещё короче: 1)     int[] marks = new int[] {5, 3, 5, 3, 4, 4, 3, 2, 5, 4}; 2)     int[]
 * marks = {5, 3, 5, 3, 4, 4, 3, 2, 5, 4}; 3)     int[] marks; marks = {5, 3, 5, 3, 4, 4, 3, 2, 5, 4};
 * <p>
 * Проинициализировать значения в массиве можно только в самом начале единожды, то есть такая запись уже недоступна! [!]
 * - ошибочно: int[] marks = new int[10]; marks = {5, 3, 5, 3, 4, 4, 3, 2, 5, 4};
 * <p>
 * <p>
 * Итог Массив в Java (Java Array) — это структура данных, которая хранит набор пронумерованных значений одного типа [
 * 23 , 44 , -123 , 0 , 99 , 23423 , 22 , 44 , 44 ] -  массив целых чисел, длиной 9 (содержит 9 элементов) { 0  ,  1  ,
 * 2  , 3 , 4  ,   5   , 6  , 7  , 8  } -  индексы отдельных элементов
 * <p>
 * массив[5]; // обращение к конкретному элементу массива и получение его значения, в данном случае значение 23423
 * массив[5] = 15; // изменение значения отдельного элемента [ 23 , 44 , -123 , 0 , 99 , 15 , 22 , 44 , 44 ] - массив
 * после изменения значения отдельного элемента по индексу { 0  ,  1  ,  2  , 3 , 4  , 5  , 6  , 7  , 8  } -  индексы
 * отдельных элементов остались неизменными
 * <p>
 * получить длину любого массива можно при помощи метода length. В отличии от строк, не требует кргулых скобок
 * имя_массива.length;
 */
public class ClassworkArray {
    public static void main(String[] args) throws FileNotFoundException {
        int[] arr = {21, 31, 41};
        boolean[] booleans = new boolean[5];

        tryRandomClass();
        basicInitializingIntArray();
        initializingAndFillIntArray();
        initializingStringArray();
        tryArrays();
        initializingCharArray();
        tryForLoopWithArray(arr);
        tryForEachWithArray(arr);

        printArray(booleans);
    }

    /**
     * tryRandomClass - использование класса Random. Данный класс в Java используется для генерации случайных данных, в
     * частности численных данных. Для создания экземпляра класса используется пустой конструктор: Random random = new
     * Random(); после чего при помощи соответствующих методов мы можем получать случайные числа соответствующего типа:
     * nextInt() - int nextLong() - long и тд. при этом в примере используется random.nextInt(1000); - означает, что
     * метод будет возвращать целые числа в диапазоне от 0 до 1000 random.nextInt(-1000, 1000); - означает, что метод
     * будет возвращать целые числа в диапазоне от -1000 до 1000
     * <p>
     * данный метод создает массив целых чисел (nums) определенной размерности: int[] nums = new int[2]; при создании,
     * если не проинициализировать массив, то он будет заполнен значениями по умолчанию, для чисел - 0, для boolean -
     * false, для ссылочных типов данных - null. в ходе выполнения цикла каждая ячейка заполняется случайным значением,
     * которое генерируется при помощи nums[i] = random.nextInt(1000); и завершается метод tryRandomClass() вызовом
     * метода printArray(nums), который принимает в качестве аргумента массивы целых чисел и распечатывает его в
     * консоль.
     */
    private static void tryRandomClass() {
        Random random = new Random();

        int[] nums = new int[5];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(0, 10);
        }

        printArray(nums);
    }

    /**
     * basicInitializingIntArray - базовая инициализация массива целых чисел создаем массив целых чисел типа int с
     * именем nums и количеством элементов 10; printArray(nums); - печатаем значения массива nums[0] = 10; - изменяем
     * одно конкретное значение nums[10] = 100; - пытаемся изменить одиннадцатый элемент, которого нет в массиве, что
     * приведет к ошибке мы можем оперировать элементами массива также, как любой перемнной данного типа: int x =
     * nums[9]; System.out.println(nums[9] * nums[9]);
     */
    private static void basicInitializingIntArray() {
        int[] nums = new int[10];
        printArray(nums);

        nums[0] = 10;
        printArray(nums);

        // nums[10] = 100;

        nums[9] = 100;
        nums[0] = 1;
        printArray(nums);

        int x = nums[9];
        System.out.println(nums[9] * nums[9]);
        printArray(nums);
    }

    /**
     * initializingAndFillIntArray - инициализация и заполнение массива целых чисел int[] nums = {1, 2, 3, 4}; -
     * объявление нового массива чисел и его заполнение при инициализации не дефолтными значениями nums[2] = 30; -
     * изменения одного конкретного значения массива
     */
    private static void initializingAndFillIntArray() {
        int[] nums = {1, 2, 3, 4};
        printArray(nums);
        nums[2] = 30;
        nums[1] = 101;
        printArray(nums);
        nums[1] = 2;
        printArray(nums);
    }

    /**
     * initializingStringArray - инициализация и заполнение массива строк String[] strings = new String[3]; - объявление
     * нового массива строк длиной 3 (содержит 3 элемента) значениями, по умолчанию null, тк String - ссылочный тип
     * данных strings[0] = "hello "; - заполнение каждого конкретного элемента массива
     * <p>
     * метод split(" "); возвращает массив строк, разделенных согласно какому-то правилу, разделитель мы указываем в
     * качестве аргемунта метода. hello.split(" ") - Таким образом мы разделили строку "hello dear friends!" по
     * пробелам.
     */
    private static void initializingStringArray() {
        String[] strings = new String[3];  // {null, null, null}
        printArray(strings);
        strings[0] = "hello ";
        strings[1] = "dear ";
        strings[2] = "friends!";
        printArray(strings);

        String hello = "hello dear friends!";
        String[] strings1 = hello.split(" ");
        printArray(strings1);
    }

    /**
     * initializingCharArray - инициализация и заполнение массива символов char[] chars = new char[5]; - объявление
     * нового массива символов длиной 5 (содержит 5 символов) заполненного значениями по умолчанию - \0 chars[0] = 'h';
     * - заполнение каждого конкретного элемента массива char[] chars1 = {104, 101, 108, 108, 111}; - объявление и
     * инициализация нового массива символов
     */
    private static void initializingCharArray() {
        char[] chars = new char[5];
        chars[2] = 'l';
        chars[1] = 'e';
        chars[3] = 'l';
        chars[0] = 'h';
        chars[4] = 'o';
        printArray(chars);

        char[] chars1 = {104, 101, 108, 108, 111};
        printArray(chars1);

        char[] chars2 = "1".toCharArray();
        printArray(chars2);

        if (chars2.length > 0)
            System.out.println(chars2[0]);
        System.out.println(chars2[chars2.length - 1]);
    }

    /**
     * tryArraysClass - использование класса Arrays. Класс Arrays предназначен для работы с массивами
     * <p>
     * сравнение массивов. тк массивы это ссылочные типы данных, мы не можем сравнивать их при помощи оператора == или
     * equals, тк будут сравниваться ссылки на объекты памяти, которые будут различны даже для одинаковых массивов.
     * Решением при сравнение является использования метода equals класса Arrays, который в качестве аргемента принимает
     * два массива, которые необходимо сравнить.
     * <p>
     * Arrays.toString(nums1) - приводит к строковому виду массив и позволяет его визуализировать в виде строки
     * <p>
     * Arrays.compare(nums1, nums2) - сравнивает два массива, возвращая 1, 0 или -1. Таким образом заменяя нам операторы
     * сравнения ">" или "<". Сравнивает поэлементно, в случае, 0 - если все элементы равны 1 - в случае, если любой
     * первый отличающийся элемент nums1 больше чем nums2 -1 - в случае, если любой первый отличающийся элемент nums2
     * больше чем nums1 Arrays.sort(nums5); - отсортирует массив элементов, если предусмотрена возможность их сортировки
     * Arrays.copyOf(nums5, 3); - создаст новый массив, из элементов массива nums5, длиной 3 Arrays.copyOfRange(nums5,
     * 3, 6);- создаст новый массив, из элементов массива nums5, начиная с 3 и заканчивая 6 индексом
     */
    private static void tryArrays() {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {1, 2, 3};
        int[] nums3 = {1, 2, 3, 4};
        int[] nums4 = {-3, 2, 3};

        System.out.println(nums1);
        System.out.println(nums2);

        System.out.println(nums1 == nums2); // false
        System.out.println(nums1.equals(nums2)); // false
        System.out.println(Arrays.equals(nums1, nums2)); // true

        System.out.println(Arrays.toString(nums1));

        System.out.println(Arrays.compare(nums1, nums2));
        System.out.println(Arrays.compare(nums1, nums4)); // {1, 2, 3} {-3, 2, 3};
        System.out.println(Arrays.compare(nums1, nums3)); // {1, 2, 3} {1, 2, 3, 4}
        System.out.println(Arrays.compare(nums4, nums1));

        int[] nums5 = {45, 20, 303, -23, 456, 12, 0};
        Arrays.sort(nums5);
        System.out.println(Arrays.toString(nums5));

        int[] nums6 = Arrays.copyOf(nums5, 4);
        System.out.println(Arrays.toString(nums6));

        int[] nums7 = Arrays.copyOfRange(nums5, 3, 6);
        System.out.println(Arrays.toString(nums7));
    }

    /**
     * tryForLoopWithArray - использование цикла for с массивами Одним из самых удобных способов для перебора всех
     * элементов в массиве является использование цикла for. При создании цикла необходимо учитывать 2 вещи - начальный
     * индекс массива всегда 0, последний элемент в массиве всегда имеет индекс (имя_массива.length - 1). Поэтому, при
     * создании цикла для перебора массива от первого элемента к последнему следует 1) int i = 0 - создать и
     * проинициализировать переменную счетчик, начиная с 0 значения (тк индексы начинаются с 0) 2) i < arr.length -
     * условие остановки. Тк, если мы обратимся к элементу массива, индекса которого которого нет, то есть индекс больше
     * индекса существующего в массиве, это приведет к ошибке. (Массив содержит 3 элемента, а мы пытаемся обратиться к
     * четвертому имя_массива[3]), то условием остановки работы цикла является значение переменной-счетчика i строго
     * меньше длины массива. То есть, если массив имеет длину 3, то как только i станет равной 3 цикл прекратит свою
     * работу, не попытается обратится к элементу с индексом 3 (имя_массива[3]) и не приведет к ошибке. 3) i++ -
     * увеличивеает значение переменной-счетчика i на 1 в каждой итерации цикла, что позволяет нам по порядку перебрать
     * все элементы массива. Цикл for позволяет получить доступ к каждому отдельному элементу в массиве, а также
     * изменять его, так arr[i] = arr[i] * i; - меняет значение в массиве printArray(arr); - каждую итерацию печатает в
     * консоль весь массив, что позволяет видеть изменения.
     */
    private static void tryForLoopWithArray(int[] arr) { // arr
        printArray(arr);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * i;
            printArray(arr);
        }
    }

    /**
     * tryForEachWithArray - использования цикла for-each с массивами Цикл for-each позволяет сократить запись и также
     * пройтись по каждому элементу в массиве. Данный цикл удобен если необходимо найти элемент в неотсортированном
     * массиве, либо просто перебрать его, но for-each не позволяет редактировать массив, тк в своей работе использует
     * его копию. Также данный цикл не позволяет перебратьм массив в обратном порядке. Синтаксис for(тип i : arr) // при
     * условии, что мы перебираем массив тип[] i - каждый элемент массива i = i * 100; - меняем значение для каждого
     * элемента массива System.out.print("i = " + i + "; arr = "); - печатаем значение каждого элемента в консоль
     * printArray(arr); - печатаем сам массив, что позволяет нам убедится, что массив остался неизменным в отлчии от
     * обычного цикла for.
     */
    private static void tryForEachWithArray(int[] arr) {
        for (int i : arr) {
            i = i * 100;
            System.out.print("i = " + i + "; arr = ");
            printArray(arr);
        }
    }

    /**
     * changingArrays - изменение массивов Массивы  - неизменяемые объекты. При создании массива, выделяется область в
     * памяти в Java и туда записываются данные. Мы можем менять эти данные как хотим, но не можем изменить размер
     * массива, тк этл будет другой объект в памяти. Мы можем попытаться изменить размер массива, приравняв один массив
     * к другому массиву отличающейся длины, но по факту, два объекта банально будут ссылаться на один и тот же объект в
     * памяти, и, меняя один массив, мы автоматически будем менять второй.
     */
    private static void changingArrays() {
        int[] numsOne = {1, 2, 3};
        int[] numsTwo = {4, 5, 6, 7};

        System.out.println("numsOne.length = " + numsOne.length);
        System.out.println("numsOne link in memory = " + numsOne);
        System.out.println("numsOne = " + Arrays.toString(numsOne));

        System.out.println("numsTwo.length = " + numsTwo.length);
        System.out.println("numsTwo link in memory = " + numsTwo);
        System.out.println("numsTwo = " + Arrays.toString(numsTwo));

        System.out.println("(numsOne == numsTwo) = " + (numsOne == numsTwo));

        numsOne = numsTwo;
        System.out.println("\nПосле изменений:");

        System.out.println("(numsOne == numsTwo) = " + (numsOne == numsTwo));

        System.out.println("numsOne.length = " + numsOne.length);
        System.out.println("numsOne link in memory = " + numsOne);
        System.out.println("numsOne = " + Arrays.toString(numsOne));

        System.out.println("numsTwo.length = " + numsTwo.length);
        System.out.println("numsTwo link in memory = " + numsTwo);
        System.out.println("numsTwo = " + Arrays.toString(numsTwo));

        numsTwo[1] = 100;
        System.out.println("numsOne = " + Arrays.toString(numsOne));
        System.out.println("numsTwo = " + Arrays.toString(numsTwo));
    }

    /**
     * printArray - печать массива. при помощи циклов мы можем перебирать все элементы массива, обращаясь к каждому
     * отдельному  элементу по индексу System.out.print("["); - для корректного отображения массива вначале печатаем
     * символ "["
     * <p>
     * создаем цикл for (int i = 0; i < arr.length; i++) int i = 0 - создаем и инициализируем перемнную счетчик i. Так
     * как индексы в массиве начинаются с 0, инициализируем переменн значением 0. i < arr.length -условие остановки. Тк,
     * если мы обратимся к элементу массива, индекса которого которого нет, то есть индекс больше индекса существующего
     * в массиве, это приведет к ошибке. (Массив содержит 3 элемента, а мы пытаемся обратиться к четвертому
     * имя_массива[3]), то условием остановием работы цикла является значение переменной-счетчика i строго меньше длины
     * массива. То есть, если массив имеет длину 3, то как только i станет равной 3 цикл прекратит свою работу, не
     * попытается обратится к элементу с индексом 3 (имя_массива[3]) и не приведет к ошибке. i++ - увеличивеает значение
     * переменной-счетчика i на 1 в каждой итерации цикла, что позволяет нам по порядку перебрать все элементы массива.
     * внутри цикла: System.out.print(arr[i]); - каждую итерацию печатаем новый элемент массива, с первого (индекс равен
     * 0) до последнего (индекс равен длинемассива - 1). if(i != arr.length - 1) - проверяем, если это не последний
     * элемент массива, то печачаем запятую для корректного отображения и визуального разделения каждого элемента
     * массива. Для последнего элемента, индекс которого равен arr.length - 1, запятая не печатается.
     * <p>
     * после цикла: System.out.println("]"); - печатаем "]" для корректного отображения массива
     */
    private static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }


    private static void printArray(double[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    private static void printArray(String[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    private static void printArray(char[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    private static void printArray(boolean[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
