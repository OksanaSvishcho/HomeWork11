import java.util.Iterator;
import java.util.stream.Stream;

public class StreamZipper {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> secondIterator = second.iterator();
        return first.flatMap(item -> secondIterator.hasNext() ? Stream.of(item, secondIterator.next()) : Stream.empty());
    }

    public static void main(String[] args) {
        Stream<Integer> firstStream = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> secondStream = Stream.of(6, 7, 8, 9, 10);

        Stream<Integer> zippedStream = zip(firstStream, secondStream);
        zippedStream.forEach(System.out::println);
    }
}
