package lambda;

import java.util.function.Consumer;
import java.util.function.Function;

public class spped {
    public static void main(String[] args) {
        //speed s=()->98;
        speed s2=(i)-> System.out.println(i);
        s2.speeeed(89);
        speed s=System.out::println;
       // System.out.println("spped: "+s.speeeed());
        s.speeeed(98);
        Consumer<Integer> s1 = (x) -> System.out.println("Speed: " + x);

        // Calling the method
        s1.accept(98);

    }

    interface speed
    {
        void speeeed(int x);
    }
}
