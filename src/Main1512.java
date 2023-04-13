import java.time.*;
public class Main1512 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2009, 4, 22);
        Period period = Period.ofYears(4);
        System.out.println(date.minus(period)); // 2005-4-22
        LocalTime time = LocalTime.of(16, 30);
        Duration duration = Duration.ofMinutes(15);
        System.out.println(time.plus(duration)); // 16:45

    }
}
