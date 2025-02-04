package STrings;
//Write a program to print First non-repeated
//character from given String?
//Ex: Software Services Output: o
public class Nstring1 {
    public static void main(String[] args) {
        String s = "software sngineer";
        int[] count = new int[256];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i)] == 1) {
                System.out.println("First non-repeated character: " + s.charAt(i));
                return;
            }
        }

        System.out.println("No non-repeated character found.");


    }
}
