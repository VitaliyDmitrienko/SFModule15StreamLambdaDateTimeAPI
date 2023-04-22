import java.util.Optional;
import java.util.Random;

public class Main1545 {
    public static void main(String[] args) {
        try {
//            System.out.println(winner(0));
            System.out.println(winner(1));
            System.out.println(winner(5));
            System.out.println(winner(10));
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    static Optional<String> winner(int guess) {
        if (guess < 1 || guess > 5) {
            throw new IllegalStateException("Input state is out of range!");
        } else {
            int bound = new Random().nextInt(5) + 1; // генерируем рандом
            System.out.println("Winner is: " + bound);
            if (guess == bound) {
                return Optional.of("Поздравляем! Вы угадали значение!");
            }
            else {
                return Optional.empty();
            }

        }
    }
}
