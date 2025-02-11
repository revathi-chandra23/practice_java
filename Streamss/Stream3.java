package Streamss;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream3 {
    public static void main(String[] args) {
        //. Write a Java program to calculate the sum of
        // all even, odd numbers in a list using streams.
        List<Integer> li= Arrays.asList(1,2,2,4,6,8,9,5,55);
        List<Integer> even=li.stream().filter(e->e%2==0).collect(Collectors.toList());
                List<Integer> oodd=li.stream().filter(e->e%2!=0).collect(Collectors.toUnmodifiableList());
        System.out.println("even nu,mber s : "+even);
        System.out.println("odd numbers  :"+oodd);
    }

}
