import java.time.*;
import java.util.Date;

public class Main1513 {
    public static void main(String[] args) {
        System.out.println(isGreaterTime(LocalTime.of(17,15), Duration.ofMinutes(15)));
        System.out.println(isGreaterTime(LocalTime.of(17,30), Duration.ofMinutes(15)));

        Date date = new Date();
        Instant instant = date.toInstant();
        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.of("Europe/Moscow"));
        System.out.println(zonedDateTime);

    }

    private static boolean isGreaterTime(LocalTime time, Duration duration) {
        return time.plus(duration).isAfter(LocalTime.now());
    }

}
