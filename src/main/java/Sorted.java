import java.util.List;
import java.util.stream.Collectors;

public class Sorted {
    public static List<String> upperCaseAndSortDescending(List<String> strings) {
        return strings.stream()
                .map(String::toUpperCase)
                .sorted((s1, s2) -> s2.compareTo(s1))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> strings = List.of("Ivan", "Peter", "Anna", "John", "Maria", "Maxim", "Oksana");
        List<String> result = upperCaseAndSortDescending(strings);
        System.out.println(result);
    }
}

