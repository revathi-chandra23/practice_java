package lambda;

import java.util.Arrays;
import java.util.List;

public class FindFirst {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "John", "Jane");
        String firstMatch = names.stream()
                .filter(s -> s.startsWith("J"))
                .findFirst()
                .orElse("No match");
        System.out.println(firstMatch);
    }
}
