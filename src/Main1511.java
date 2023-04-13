import java.time.*;

public class Main1511 {

    public static void main(String[] args) {

        ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Europe/Moscow"));
        System.out.println (zonedDateTime);
        System.out.println (ZonedDateTime.now ());

        LocalTime time = LocalTime.of(16, 30); // строка 1
//        time.withHour(14).plusMinutes(15);
        System.out.println("time: " + time);

        LocalTime newTime = LocalTime.now ().withHour (14).withMinute (10).withSecond(0).withNano(0);
//        newTime = LocalTime;
//        newTime.withHour (14).plusMinutes(15);
//        newTime.withHour (14).plusMinutes(15);
        System.out.println ("newTime: " + newTime);

        LocalDateTime newDateTime = LocalDateTime.now ().withYear ( 1973 ).withMonth ( 6 ).withDayOfMonth ( 11 ).withHour (1).withMinute (1).withSecond(1).withNano(1);
//        ZonedDateTime newZonedDateTime = ZonedDateTime(newDateTime,ZoneId.of("US/Eastern"));
        System.out.println (newDateTime);


    }
}
