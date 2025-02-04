package STrings;
//13.Demonstrate the difference between String, StringBuilder, and StringBuffer with examples.
//Use String when you need immutable strings.
//Use StringBuilder for mutable strings when thread safety is not a concern.
////Use StringBuffer for mutable strings when thread safety is required.
public class Vamsi13 {
    public static void main(String[] args) {
        String str = "Hello";
        str = str + ", World!";
        System.out.println(str);
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(", World!");
        System.out.println(sb.toString());
        StringBuffer sb1 = new StringBuffer("Hello");
        sb1.append(", World!");
        System.out.println(sb1);


    }
}
