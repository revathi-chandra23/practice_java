package STrings;
//Write a Java program to get the character (Unicode code point) before the specified index within the string.
//
//Sample Output:
//
//Original String : w3resource.com
//Character(unicode point) = 119
//Character(unicode point) = 99

public class Pstring3 {
    public static void main(String[] args) {
        String s="Revathi chnadra";
        System.out.println(s.codePointAt(1));
        System.out.println(s.codePointAt(6));
        System.out.println(s.codePointBefore(4));
        System.out.println(s.codePointBefore(3));

    }
}
