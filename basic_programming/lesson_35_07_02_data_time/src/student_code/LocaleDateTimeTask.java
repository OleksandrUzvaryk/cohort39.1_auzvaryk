package student_code;

import practice.LocalDateTimeExample;

import java.time.LocalDateTime;

public class LocaleDateTimeTask {

    public static void main(String[] args) {


        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("ldt => " + ldt);
        LocalDateTime firstDayOfYear = ldt.withDayOfYear(1);
        System.out.println("first day => " + firstDayOfYear);
        LocalDateTime ldt2 = firstDayOfYear.plusHours(1000);
        System.out.println("ldt2 => " + ldt2);
        System.out.println(ldt2.getDayOfWeek());


    }

}
