//import java.time.LocalDate;
//import java.util.function.Function;
//import java.util.function.Supplier;
//
//import static com.sun.tools.javac.comp.ConstFold.doubleValue;
//import static jdk.internal.vm.vector.VectorSupport.test;
//
//public class Main1529 {
//
//    public static void main(String[] args) {
//
//
//    doubleValue();
//
//    test(new Function<Integer, Double>() {
//        @Override
//        public Double apply(Integer integer) {
//            return integer.doubleValue();
//        }
//    },new Supplier<LocalDate>() {
//        @Override
//        public LocalDate get() {
//            return LocalDate.now();
//        }
//    });
//}
//
//    private static void doubleValue() {
//    }
//
//    test(integer -> integer.doubleValue(), () -> LocalDate.now());
//
//    test(Integer::doubleValue, LocalDate::now);
//
//}
