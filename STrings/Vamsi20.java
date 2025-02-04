package STrings;
//20.Check if a string is a palindrome (ignoring case and special characters).
public class Vamsi20 {
    public static void main(String[] args) {
     String s="M2Meed32" ;
        s = s.toLowerCase();
    StringBuilder sb=new StringBuilder(s).reverse();
 if(s.equals(sb.toString()))
 {
     System.out.println("reversed");
 }
    else {
     System.out.println("not");
 }

    }
}
