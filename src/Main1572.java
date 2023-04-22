import java.util.OptionalLong;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main1572 {

    public static void main(String[] args) {
        Stream<String> stream = Stream.iterate("", (s) -> s + "1");
        System.out.println(stream.limit(2).map(x -> x + "2"));


//public class Main1573 {
        LongStream ls = LongStream.of(1, 2, 3);
        OptionalLong opt = ls.map(n -> n * 10).filter(n -> n < 5).findFirst();
        if (opt.isPresent()) System.out.println(opt.getAsLong());
        opt.ifPresent(System.out::println);
    }


}
