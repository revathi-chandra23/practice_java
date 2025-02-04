package STrings;

public class Vamsi1 {
    public static void main(String[] args) {
   //     1.Create a program to check if two strings are equal without using .equals().
        String s="revathi";
        String s1=new String("revathi");
        String s2="chandra";
        boolean equal=(s.compareToIgnoreCase(s2)==0);
        if(equal)
        {
            System.out.println("if two string are equal");
        }
        else {
            System.out.println("not equal");
        }


    }
}
