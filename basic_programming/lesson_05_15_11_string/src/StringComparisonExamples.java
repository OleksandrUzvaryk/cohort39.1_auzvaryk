public class StringComparisonExamples {

    public static void main(String[] args) {
        // Примеры с использованием equals()
        String str1 = "Hello World";
        String str2 = "Hello World";
        String str3 = "hello world";

        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // false

        // Пример с использованием equalsIgnoreCase()
        System.out.println("str1.equalsIgnoreCase(str3): " + str1.equalsIgnoreCase(str3)); // true

        // Пример с использованием == (сравнение ссылок)
        String str4 = "Hello";
        String str5 = "Hello";
        String str6 = new String("Hello");

        System.out.println("str4 == str5: " + (str4 == str5)); // true
        System.out.println("str4 == str6: " + (str4 == str6)); // false

        // Примеры с использованием toUpperCase(), toLowerCase(), trim()
        String str7 = "  java  ";
        String str8 = "Java";
        String str9 = "  JAVA  ";

        System.out.println("str7.trim().equalsIgnoreCase(str8): " + str7.trim().equalsIgnoreCase(str8)); // true
        System.out.println("str8.toUpperCase().equals(str9.trim()): " + str8.toUpperCase().equals(str9.trim())); // true
        System.out.println("str8.toLowerCase().equals(str9.toLowerCase().trim()): " + str8.toLowerCase().equals(str9.toLowerCase().trim())); // true

        // Пример с использованием contains()
        String str10 = "programming in Java";
        String str11 = "Java";

        System.out.println("str10.contains(str11): " + str10.contains(str11)); // true
    }
}
