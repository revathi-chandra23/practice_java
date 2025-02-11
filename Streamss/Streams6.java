package Streamss;

import java.util.Comparator;
import java.util.List;

//Write a Java program to sort a list of strings in alphabetical order,
// ascending and descending using streams.
public class Streams6 {
    public static void main(String[] args) {
        List<String> li=List.of("revathi","tanu","ponu","bujji","chiiti","bujthaali","kaja");
        List<String> as=li.stream().sorted().toList();
        System.out.println(as);
        List<String> des=li.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(des);

    }
}
