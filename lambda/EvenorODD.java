package lambda;

import java.util.function.Predicate;

public class EvenorODD {
    public static void main(String[] args) {
        //Check Even or Odd:
        //Write a lambda function that takes an integer and returns true if
        // it is even, otherwise false.
        Predicate<Integer> s=s1->s1%2==0;
        System.out.println(s.test(223));

    }
}
