package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Mapp {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("john", "jane", "doe");
        List<String> upperCaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(upperCaseNames); // Output: [JOHN, JANE, DOE]

    }
}
