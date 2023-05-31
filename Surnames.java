import java.util.List;
import java.util.stream.Collectors;

public class Surnames {
    public static void main(String[] args) {
        List<String> surnames = List.of("Ivanov", "Petrov", "Sidorov", "Smith", "Johnson");

        char startingChar = 'S';

        List<String> filteredSurnames = surnames.stream()
                .filter(surname -> surname.charAt(0) == startingChar)
                .collect(Collectors.toList());

        filteredSurnames.forEach(System.out::println);
    }
}
