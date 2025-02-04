package STrings;
//4.Write a program to find the length of a string without using .length().
public class Vamsi4{
    public static void main(String[] args) {
        String s="revathi";
        char[] c=s.toCharArray();
      int  count=0;
    for(char c1:c)
    {
        count++;
    }
        System.out.println(count);

    }
}
