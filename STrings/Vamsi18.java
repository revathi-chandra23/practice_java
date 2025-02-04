package STrings;
//18.Convert a string to an integer using Integer.parseInt() and handle exceptions.
public class Vamsi18 {
    public static void main(String[] args) {
        String s="122345";
//        int a=Integer.parseInt(s);
//        System.out.println(a);
        try
        {
           int a=Integer.parseInt(s);
            System.out.println(a);
        } catch (NumberFormatException e) {
            System.out.println("its a not a valid number"+s);
        }
    }
}
