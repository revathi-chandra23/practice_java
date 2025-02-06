package lambda;

import java.util.function.Function;

public class STrtoINT {
    public static void main(String[] args) {
        //Write a lambda function using Function<String, Integer>
        // that converts a string to an integer.
        Function<String,Integer> fl= s->Integer.parseInt(s);
        System.out.println(fl.apply("1235"));


    }
}
