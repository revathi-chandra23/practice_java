package lambda;

import java.util.Arrays;
import java.util.List;

public class SortString {
    public static void main(String[] args) {
        //Write a lambda expression to sort a list of strings by their length.
        List<String> li= Arrays.asList("rueeen","bookk","fewfjaew","hdh");
        li.sort((s1,s2)->Integer.compare(s1.length(),s2.length()));
        System.out.println(li);

    }
}
