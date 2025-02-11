package Streamss;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream2 {
    public static void main(String[] args) {
        //. Write a Java program to convert a list of strings to
        // uppercase or lowercase using streams.

        List<String> li= Arrays.asList("revathi","book","pink");
     List< String> s=li.stream().map(String ::toUpperCase).collect(Collectors.toList());
        System.out.println(s);

    }

}
