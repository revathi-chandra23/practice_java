package STrings;
//19.Convert a string to a byte array and back using getBytes().
public class Vamsi19 {
    public static void main(String[] args) {
        String s="revathi chandra";
        System.out.println(s);
        byte [] by=s.getBytes();
      for (byte b:by)
      {
          System.out.println(b);
      }
      String s1=new String(by);
        System.out.println(s1);

    }
}
