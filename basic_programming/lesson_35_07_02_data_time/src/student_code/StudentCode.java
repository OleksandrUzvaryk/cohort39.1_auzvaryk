package student_code;

import practice.LocalDateExample;
import practice.LocalDateTimeExample;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class StudentCode {
    public static void main(String[] args) {

       /* ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("Europa/Paris"));
        ZonedDateTime zdt2 = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));

        System.out.println(zdt);
        System.out.println(zdt2);

*//*

        LocalDate ldt = LocalDate.of(2024,2,1);
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime localDateTime = LocalDateTime.of(ldt,LocalTime.of(0,0));
        Duration dur = Duration.between(localDateTime,now);
        System.out.println(dur);*/

        LocalTime time = LocalTime.now();
        System.out.println(time);

LocalTime time1 = LocalTime.parse("13:12:36");
        System.out.println(time1);
        ZonedDateTime time2 = ZonedDateTime.now(ZoneId.of("Europe/Kyiv"));
        System.out.println(time2);

        LocalDate tomorrow = LocalDate.now();
        System.out.println(tomorrow.plusDays(2));
        System.out.println(tomorrow.minusWeeks(3));
        boolean isPast = tomorrow.isAfter(tomorrow.plusDays(5));
        System.out.println(isPast);

        ZonedDateTime meetLviv = ZonedDateTime.of(tomorrow.atStartOfDay(),ZoneId.of("Asia/Tokyo"));
        System.out.println(meetLviv);

        DateTimeFormatter my = DateTimeFormatter.ofPattern("MM.yyyy.dd");
        String format = tomorrow.format(my);
        System.out.println(format);


        String custom = "01.06.2027";
        LocalDate myTime = LocalDate.parse(custom,DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        System.out.println(myTime);


    }
}
