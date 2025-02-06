package lambda;

import java.util.function.Consumer;

//implement a lambda expression using Consumer<String>
// that prints the string in uppercase.
public class Upercase {
    public static void main(String[] args) {
        Consumer<String > c=s-> System.out.println(s.toUpperCase());
        c.accept("revsgik");

    }
}
