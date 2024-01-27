public class Classwork {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);



        sb.append(" World"); // Добавляет " World" к StringBuilder
        System.out.println("append(\" World\") " + sb);

        sb.insert(5, " Java"); // Вставляет " Java" на позицию 5
        System.out.println("insert(5, \" Java\") " + sb);

        sb.delete(5, 10); // Удаляет текст с позиции 5 по 10
        System.out.println("delete(5, 10) " + sb);

        sb.reverse(); // Меняет порядок символов на обратный
        System.out.println("reverse() " + sb);

        String result = sb.toString(); // Конвертирует StringBuilder в String

        System.out.println(sb);

        String str = "Hello";
        str.concat(" world");
        System.out.println("str " + str);

    }
}
