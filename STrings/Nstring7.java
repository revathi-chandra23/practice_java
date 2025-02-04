package STrings;
//8. Write a program to print Highest occurred
//character from given String?
//Ex: aaaaabbcddddd Output: a
public class Nstring7 {
    public static void main(String[] args) {
        String str="programmmmming";
        String result="";
        int max=0;

        for(int i=0;i<str.length();i++) {
            int count=0;
            if(str.charAt(i)!=' ') {
                for(int j=i+1;j<str.length();j++) {
                    if(str.charAt(i)==str.charAt(j) &&(i!=j)) {
                        count++;
                    }
                }
                if(max<count ) {
                    max=count;
                    result = String.valueOf(str.charAt(i));
                }

            }

        }
//        result += str.charAt(i)+" : "+count+"\n";
        System.out.println("c: "+result);

    }
}
