package Streamss;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream4 {
    public static void main(String[] args) {
        //4. Write a Java program to remove all duplicate elements from a list using streams
        List<Integer> li= Arrays.asList(1,2,2,4,4,6,6,8,9,56,55,55);
        System.out.println(li.stream().distinct().collect(Collectors.toUnmodifiableList()));
    }
}
