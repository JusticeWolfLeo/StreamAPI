import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedWords {
    public static void main(String[] args) {
        String input = "apple banana cherry date";
        List<String> words = Arrays.asList(input.split(" "));

        List<String> sortedWords = words.stream()
                .sorted()
                .peek(System.out::println)
                .collect(Collectors.toList());
    }
}
