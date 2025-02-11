package Streamss;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//. Write a Java program to find the maximum and minimum
// values in a list of integers using streams.
public class Streams7 {
    public static void main(String[] args) {
        List<Integer> li= Arrays.asList(1,2,4,6,8,9,5,55);
        System.out.println(li.stream().max(Integer::compare).orElse(null));
        System.out.println(li.stream().min(Integer::compare).orElse(0));

    }
}
