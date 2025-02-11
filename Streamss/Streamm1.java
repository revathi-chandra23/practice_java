package Streamss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Streamm1 {
    public static void main(String[] args) {
        //1. Write a Java program to calculate the average of a list of
        // integers using streams

        List<Integer> li=Arrays.asList(1,2,3,4,5,7);
     double res=li.stream().mapToDouble(Integer::doubleValue).average().orElse(0);
        System.out.println(res);
    }
}
