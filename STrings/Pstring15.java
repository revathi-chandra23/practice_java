package STrings;

import java.util.Calendar;

//15. Write a Java program to print the current date and time in the specified format.
//
//Sample Output:
public class Pstring15 {
    public static void main(String[] args) {
Calendar c= Calendar.getInstance();
        System.out.println(c);
        System.out.format("%tB %te, %tY%n", c, c, c);
        System.out.format("%tl:%tM %tp%n", c, c, c);


    }
}
