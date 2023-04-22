import java.util.stream.IntStream;

public class Main15511 {
    public static void main(String[] args) {
        IntStream stream1 = IntStream.iterate(1, s -> s+1);
        IntStream stream2 = IntStream.rangeClosed(1, 100);

        int summ = stream2.skip(50).
                filter(n -> n%2 == 0 || n%5 == 0).peek(System.out::println).
//                filter(n -> n%5 == 0).peek(System.out::println).
                sum();

        System.out.println(summ);

    }
}
