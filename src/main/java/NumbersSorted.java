import java.util.Arrays;
import java.util.stream.Collectors;

public class NumbersSorted {
    public static String getNumbersSort(String[] array) {
        return Arrays.stream(array)
                .flatMap(str -> Arrays.stream(str.split(", ")))
                .map(Integer::parseInt)
                .distinct()
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }
    public static void main(String[] args) {
        String[] array = {"1, 2, 0, 3", "4, 5, 7, 6"};
        String result = getNumbersSort(array);
        System.out.println(result);
    }
}
