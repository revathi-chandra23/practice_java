package STrings;
//11. Write a Java program to create a String object with a character array.
//Sample Output:
//The book contains 234 pages.
public class Pstring11 {
    public static  void main(String[] args) {
        char[] c={'1','2','3','4'};
        String s=String.valueOf(c);
        System.out.println("the money i have "+s.substring(1,3));

    }
}
