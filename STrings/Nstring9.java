package STrings;

import java.util.Scanner;

//. Write a program to whether check given string
//contains digits or not?
//Ex: nacre123 nacre#$
//Output: Given String Contains Digits Given
//String not contain Digits


import java.util.Scanner;

public class Nstring9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean hasDigit = false;
        //int a=10;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                hasDigit = true;
                break;
            }
        }

        if (hasDigit) {
            System.out.println("Given String Contains Digits");
        } else {
            System.out.println("Given String Does Not Contain Digits");
        }
    }
}
//```

//This version will check the entire string and print whether it contains any digits or not. Let me know if you need any further assistance!