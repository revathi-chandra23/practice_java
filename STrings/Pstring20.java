package STrings;
//Write a Java program to get the Canonical representation of the string object
public class Pstring20 {
    public static void main(String[] args) {
        String s="revath";
        String s2="chandra";
     if(s.intern()==s2.intern())
     {
         System.out.println("this is canonoical");
     }
     else {
         System.out.println("not");
     }

    }
}
