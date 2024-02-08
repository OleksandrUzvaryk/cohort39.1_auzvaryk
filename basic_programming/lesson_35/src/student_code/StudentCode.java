package student_code;

import java.time.*;

public class StudentCode {
    public static void main(String[] args) {

       /* ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("Europa/Paris"));
        ZonedDateTime zdt2 = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));

        System.out.println(zdt);
        System.out.println(zdt2);

*/

        LocalDate ldt = LocalDate.of(2024,2,1);
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime localDateTime = LocalDateTime.of(ldt,LocalTime.of(0,0));
        Duration dur = Duration.between(localDateTime,now);
        System.out.println(dur);





    }
}
