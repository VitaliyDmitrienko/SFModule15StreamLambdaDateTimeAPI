import java.time.*;
public class Main1514 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2026, Month.AUGUST, 13); // строка 1
//        LocalTime time = new LocalTime(16, 15); // строка 2
        LocalTime time = LocalTime.of(16, 15); // строка 2
        LocalDateTime dateTime = LocalDateTime.of(date, time); // строка 3
        System.out.println(dateTime);
    }
}
