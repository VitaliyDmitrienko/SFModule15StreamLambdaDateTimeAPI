import java.time.*;
import java.util.Date;

public class Main1517 {
    public static void main(String[] args) {
        System.out.println(convertDateToTime(new Date()));
    }

    public static LocalTime convertDateToTime(Date date) {
        Instant instant = date.toInstant();
        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.systemDefault());
        return zonedDateTime.toLocalTime();
    }
}
