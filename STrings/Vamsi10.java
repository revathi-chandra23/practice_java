package STrings;
//10.Split a string into an array using split() and print each element separately.
public class Vamsi10 {
    public static void main(String[] args) {
        String s="revathi chandra lives in kondapur going office by walk";
        String[] c =s.split("\\s");
        for(String c1:c)
        System.out.println(c1);

    }
}
