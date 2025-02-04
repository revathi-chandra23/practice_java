package STrings;
// Write a program to remove the given Character
//from the given String?
//Ex: nacre Software
//Remove character: a
//Output: ncre Softwre
public class Nstring8 {
    public static void main(String[] args) {
        String s="nacre software";
        char c='a';
        String res="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=c)
            {
                res+=s.charAt(i);

            }
        }
        System.out.println(res);

    }
}
