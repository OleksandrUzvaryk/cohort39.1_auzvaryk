package hometask;

public class MyString {
    public static void main(String[] args) {


        /**
         *
         * Написать два метода, один из которых преобразует строку из обычного предложения в стиль lowerCamelCase,
         * а другой сделает обратное действие. Например, для строки "Какой замечательный, однако, день!" результатом будет
         * "какойЗамечательныйОднакоДень". Обратите внимание, что все символы, которые не разрешаются в идентификаторах, должны удаляться.
         * Если результат этого метода превратить с помощью второго метода, должно получиться "Какой замечательный однако день"
         */

        String s1 = "What a wonderful day, yahoo, that is right!";
        System.out.println(s1);
        loverCamelCase1(s1);
    }

    public static void loverCamelCase1(String data) {
        StringBuilder sb = new StringBuilder();
        String[] myCh = data.split(",");
        for (int i = 0; i < myCh.length; i++) {
            if (myCh[i].contains(" ") || myCh[i].contains(",")) {
               myCh[i].replace(" ", "");
                myCh[i].replace(",", "");
            }
            sb.append(i);
        }System.out.println(sb.toString());


    }}