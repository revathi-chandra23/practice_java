package STrings;
// 5. Write a Java program to compare two strings lexicographically.
//Two strings are lexicographically equal if they are the same length and contain
// the same characters in the same positions
public class Pstring5 {
    public static void main(String[] args) {
        String s1="This is Exercise 9";
        String s2="This is Exercise 2";
        int res=s1.compareTo(s2);
        System.out.println(res);
        if(res<0)
        {
            System.out.println(s1+" less than " +s2);
        } else if (res==0) {
            System.out.println(s1+" have same length of " +s2);
        }
        else {
            System.out.println(s1+" greater than " +s2);
        }

    }
}
