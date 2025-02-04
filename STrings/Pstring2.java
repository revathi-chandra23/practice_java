package STrings;
// Write a Java program to get the character (Unicode code point) at the given index
// within the string.
//Sample Output:
//Original String : w3resource.com
//Character(unicode point) = 51
//Character(unicode point) = 101
public class Pstring2 {
    public static void main(String[] args) {
        String s="w3resource.com";
        System.out.println("the string"+s);
        System.out.println(s.codePointAt(2));
        System.out.println(s.codePointAt(5)
        );

    }
}
