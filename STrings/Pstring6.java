package STrings;
//Write a Java program to compare two strings lexicographically, ignoring case differences
public class Pstring6 {
    public static void main(String[] args) {
        String s1="This is Exercise 1";
        String s2="This is Exercise 1";
        int res=s1.compareTo(s2);
        System.out.println(res);
        if(res==0)
        {
            System.out.println(s1+" have same length of " +s2);
        } else {
            System.out.println(s1+"  not have same length of " +s2);
        }

    }
}
