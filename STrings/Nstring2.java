package STrings;
//3. Write a program to print last non-repeated
//character from given String?
//Ex: Software Services Output: c

public class Nstring2 {
    public static void main(String[] args) {
        String s = "software engineer";
        int[] count = new int[256];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }

        for (int i = s.length()-1;i>=0 ;
        i--) {
            if (count[s.charAt(i)] ==1) {
                System.out.println("First non-repeated character: " + s.charAt(i));
                return;

            }
        }
    }
}
