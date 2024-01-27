public class Lesson02Part3 {
    public static void main(String[] args) {
        double x = 10.0;
        int y = 10;

        x = x / 3;
        y = y / 3;

        System.out.println(x);
        System.out.println(y);


        //примитивные типы данных:
        // целочисленные
        byte myByte = 20;      // 8 bit    01010101 2^8 комбинаций. 256 - различных чисел.  -128 до 127
        short myShort = 10;    // 16 bit  2^16 комбинаций. 65536 - различных чисел.  -32_768 до 32_767
        int myInt = 10;        // 32 bit  2^32 комбинаций. 4,294,967,296 - различных чисел.  -2,147,483,648 до 2,147,483,647
        long myLong = 10L;     // 64 bit  2^64 комбинаций. -9,223,372,036,854,775,808 до 9,223,372,036,854,775,807

//  1111 1_0000

        myLong = 2_147_483_647L + 1;
        System.out.println(myLong);

        // с дробной частью
        float myFloat = 1.0F; // 32 bit
        double myDouble = 1.0; // 64 bit

        System.out.println(myFloat / 3);
        System.out.println(myDouble / 3);

        //логический тип данных
        boolean myBoolean = true; // 16 bit
        myBoolean = false;

        //символьный тип данных
        char myChar = 'w';

        // String - совершенно другой тип данных в отличии от char
        String str = "vfgvdfsv";

    }
}
