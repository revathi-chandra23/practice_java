package STrings;
//1. Write a Java program to get the character at the given index within the string.
//Sample Output:
//Original String = Java Exercises!
//The character at position 0 is J
//The character at position 10 is i
public class Pstring1 {
    public static void main(String[] args) {
        String s="Java Exercises!";
        System.out.println(s);
        System.out.println("The character at position 0 is "+s.charAt(0));
        System.out.println("The character at position 10 is "+s.charAt(10));
    }
}
