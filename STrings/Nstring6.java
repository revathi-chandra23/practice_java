package STrings;
//write a program to print all duplicate character
//and their count form the given String?
//Ex: Programming Output: g: 2
// r: 2
// m:2
public class Nstring6 {
    public static void main(String[] args) {
        String str="programming";
       String result=" ";

        for(int i=0;i<str.length();i++) {
            int count=1;
            if(str.charAt(i)!=' ') {
                for(int j=i+1;j<str.length();j++) {
                    if(str.charAt(i)==str.charAt(j) &&(i!=j)) {
                        count++;
                    }
                }
                if(count > 1 ) {
                    result += str.charAt(i)+" : "+count+"\n";
                }
            }
        }
        System.out.println(result);

    }
}
