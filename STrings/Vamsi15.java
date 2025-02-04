package STrings;
//15.Append and insert characters in a string using StringBuffer.
public class Vamsi15 {
    public static void main(String[] args) {
        String s="book ";
        StringBuffer sb=new StringBuffer().append(s).insert(5,"pen");
        System.out.println(sb);

    }
}
