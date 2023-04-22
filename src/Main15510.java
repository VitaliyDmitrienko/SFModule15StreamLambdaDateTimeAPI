import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main15510 {
//    public static void main(String[] args) {
//        List<Double> list1 = Arrays.asList(117d, 12.2d, 66d, 18.5d);
//        List<String> list2 = Arrays.asList("15", "18.5", "117", "22.2");
//        List<Double> doubles = new ArrayList<>();
//        for (String s : list2) {
//            doubles.add(Double.valueOf(s));
//        }
//        Set<Double> sortedDoubles = new TreeSet<>(Comparator.reverseOrder());
//        sortedDoubles.addAll(list1);
//        sortedDoubles.addAll(doubles);
//        for (double d : sortedDoubles) {
//            System.out.println(d);
//        }
//    }

    public static void main(String[] args) {
        List<Double> list1 = Arrays.asList(117d, 12.2d, 66d, 18.5d);
        List<String> list2 = Arrays.asList("15", "18.5", "117", "22.2");

        List<Double> doubles = Stream.concat(list1.stream(),list2.stream().map(Double::valueOf)).
                distinct().sorted(Comparator.reverseOrder()).
                collect(Collectors.toCollection(ArrayList::new));
//                forEach(System.out::println);

        System.out.println(doubles);
        System.out.println(doubles.getClass());

    }
}
