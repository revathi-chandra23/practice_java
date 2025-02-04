package STrings;
//frequency of character
public class Nstring3 {
    public static void main(String[] args) {
        String s = "software engineer";
        int[] count = new int[256];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }

        for (int i = 0;i<256;i++) {
            if (count[i] >0) {
                System.out.println("Frequency: " +(char) i+" count "+count[i]);


            }
        }
    }
}
