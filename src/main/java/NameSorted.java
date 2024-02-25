import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NameSorted {
    public static String getNamesWithOddIndexes(List<String> names) {
        return IntStream.range(0, names.size())
                .filter(i -> i % 2 == 0)
                .mapToObj(i -> (i + 1) + ". " + names.get(i))
                .collect(Collectors.joining(", "));
    }

    public static void main(String[] args) {
        List<String> names = List.of("Ivan", "Peter", "Anna", "John", "Maria", "Maxim", "Oksana");
        String result = getNamesWithOddIndexes(names);
        System.out.println(result);
    }
}

