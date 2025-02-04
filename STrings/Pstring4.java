package STrings;
//4. Write a Java program to count Unicode code points in the specified text range of a string.
//
//Sample Output:
//Original String : w3rsource.com
//Codepoint count = 9
public class Pstring4 {
    public static void main(String[] args) {
        String s="W3resource.com";
        System.out.println("codepoint count of W#resource.com :"+s.codePointCount(2,7) );
        System.out.println("substring :" +s.substring(2,7));
    }
}
