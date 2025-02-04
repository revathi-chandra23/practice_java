package STrings;

import java.util.ArrayList;
import java.util.Arrays;

//.Convert a character array to a string and vice versa using String.valueOf() and .toCharArray().
public class Vamsi17 {
    public static void main(String[] args) {
        char[] c={'a','c','o'};
        String s=String.valueOf(c);
        System.out.println("data :"+s);
        char[] c1=s.toCharArray();
        System.out.println("array "+ Arrays.toString(c1));
    }
}
