package lambda;

import java.util.function.Predicate;
//Write a lambda expression using Predicate<Integer>
// to check if a number is greater than 10.
public class Greater10 {
    public static void main(String[] args) {
        Predicate<Integer> i=s->s>10;
        System.out.println(i.test(34));
    }
}
