import java.time.*;
public class Main1515 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(12, 30); // строка 1
//        time.minusHours(4); // строка 2
        time = time.minusHours(4); // строка 2
        time = time.plusMinutes(30);
        System.out.println(time);
    }
}
