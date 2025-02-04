package STrings;
//Write a Java program to compare a given string to a specified string buffer.
public class Pstring10 {
    public static void main(String[] args) {

       String str = new String("revathi") ;
        StringBuffer d=new StringBuffer("revathi");
        System.out.println(str.contentEquals(d));


    }
}
