import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class Main1558 {
//    public static void main(String[] args) {
//        List<String> strings = Arrays.asList("1", "2", "3", "4", "5");
//        List<Integer> integers = new ArrayList<>();
//        for (String s : strings) {
//            integers.add(Integer.parseInt(s));
//        }
//        int multiply = 1;
//        for (int i : integers) {
//            multiply *= i;
//        }
//        System.out.println(multiply);
//    }

    public static void main(String[] args) {
        int multiply = Stream.of("1", "2", "3", "4", "5")
                .map(Integer::parseInt)
                .reduce(1, (integer, integer2) -> integer * integer2);
        System.out.println(multiply);
    }
}
