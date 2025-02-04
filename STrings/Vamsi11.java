package STrings;
// 11.Concatenate two strings in multiple ways (+, concat(), StringBuilder).
public class Vamsi11 {
    public static void main(String[] args) {
        String s="revathi ";
        String s1="chandra";
        System.out.println(s+s1);
        System.out.println(s.concat(s1));
        StringBuilder s2=new StringBuilder("blue").append(s);
        System.out.println(s2);

    }
}
