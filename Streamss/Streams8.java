package Streamss;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//. Write a Java program to find the second smallest and
// largest elements in a list of integers using streams.
public class Streams8 {
    public static void main(String[] args) {
        List<Integer> li= Arrays.asList(1,2,4,6,8,9,5,55);
        System.out.println("second largest  :"+li.stream().
                sorted(Comparator.reverseOrder()).
                skip(1).findFirst()
                .orElse(null));
        System.out.println("second smallest :"+li.stream().
                sorted().
                skip(1).
                findFirst().orElse(null));

    }
}
