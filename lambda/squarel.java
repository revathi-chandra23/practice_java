package lambda;
//Square of a Number:
//Implement a lambda expression that takes an integer and returns its square.
public class squarel {
    public static void main(String[] args) {

        sq s=(x)->x*x;
        System.out.println(s.square(5));
    }

}
interface sq
        {
            int square(int x);
                }
