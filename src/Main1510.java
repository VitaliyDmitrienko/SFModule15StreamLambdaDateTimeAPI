// Module 15.1. Новые DateTime API.

import java.time.*;
public class Main1510 {
    public static void main(String[] args) {
        System.out.println (LocalDate.now());
        System.out.println (LocalTime.now());
        System.out.println (LocalDateTime.now());
        System.out.println (ZonedDateTime.now());

        System.out.println (ZonedDateTime.of(LocalDate.of(2013, 2, 22), LocalTime.of(6, 15), ZoneId.of("US/Eastern")));

        System.out.println (ZoneId.systemDefault());

        System.out.println (ZoneId.getAvailableZoneIds());
    }
}
