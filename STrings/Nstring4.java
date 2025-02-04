package STrings;

//Write a program to remove the duplicate
//characters from the given String?
//Ex: banaans Output: bans
public class Nstring4 {
    public static void main(String[] args) {
        String str="banannas";
        StringBuilder result= new StringBuilder();
        for(int i=0;i<str.length();i++) {
            int count=0;
            if(str.charAt(i)!=' ') {
                for(int j=i+1;j<str.length();j++) {
                    if(str.charAt(i)==str.charAt(j) &&(i!=j)) {
                        count++;
                    }
                }
                if(count==0) {
                    result.append(str.charAt(i));
                }
            }
        }
        System.out.println(result);

    }
}
