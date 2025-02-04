package STrings;
// Write a program to print duplicate characters
//from the given String?
//Ex: Programming Output: r, g,
public class Nstring5 {
    public static void main(String[] args) {
        String str="programming";
        StringBuilder result= new StringBuilder();
        for(int i=0;i<str.length();i++) {
            int count=0;
            if(str.charAt(i)!=' ') {
                for(int j=i+1;j<str.length();j++) {
                    if(str.charAt(i)==str.charAt(j) &&(i!=j)) {
                        count++;
                    }
                }
                if(count==1) {
                    result.append(str.charAt(i));
                }
            }
        }
        System.out.println(result);


    }
}
