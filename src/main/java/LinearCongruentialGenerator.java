import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class LinearCongruentialGenerator {
    public static Stream<Long> generateRandomStream(long seed, long a, long c, long m) {
        UnaryOperator<Long> generateNext = x -> (a * x + c) % m;
        return Stream.iterate(seed, generateNext);
    }

    public static void main(String[] args) {
        long a = 25214903917L;
        long c = 11L;
        long m = (long) Math.pow(2, 48);
        long seed = System.currentTimeMillis();
        Stream<Long> randomStream = generateRandomStream(seed, a, c, m);
        randomStream.limit(10).forEach(System.out::println);
    }
}

