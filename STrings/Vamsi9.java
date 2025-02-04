package STrings;
//9.Replace all occurrences of a character in a string using replace() and replaceAll().
public class Vamsi9 {
    public static void main(String[] args) {
        String s="revathi 345chandra Tannidi";
        System.out.println(s.replace('a','l'));
        System.out.println(s.replaceAll("\\d","e"));

    }
}
