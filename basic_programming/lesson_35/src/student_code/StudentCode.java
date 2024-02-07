package student_code;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class StudentCode {
    public static void main(String[] args) {

        ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("Europa/Paris"));
        ZonedDateTime zdt2 = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));

        System.out.println(zdt);
        System.out.println(zdt2);









    }
}
