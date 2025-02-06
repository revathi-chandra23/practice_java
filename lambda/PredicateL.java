package lambda;

import java.util.function.Predicate;

public class PredicateL {
    public static void main(String[] args) {
        Predicate<Integer> isEven = x -> x % 2 == 0;
      //  boolean result = isEven.test(4);
        System.out.println(isEven.test(4));
    }
}
