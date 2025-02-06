package lambda;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

//Write a lambda expression that takes two integers and returns their sum
public class SimAddition {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer > s=(a,b)->a+b;
        System.out.println(s.apply(2,3));
        BinaryOperator<Integer> e=( a,b) -> a*b;
        System.out.println(e.apply(5,4));


    }
}
