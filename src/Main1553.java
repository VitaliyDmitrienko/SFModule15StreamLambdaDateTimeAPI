import java.util.stream.Stream;

public class Main1553 {
    public static void main(String[] args) {
        Stream<Integer> infinite = Stream.iterate(10, x -> x * 2);
        System.out.println(infinite.anyMatch(test -> test / 8 == 0));
    }
}
