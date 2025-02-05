package STrings;

interface demo
{
    public String  name(String s1,String s2,String s3);
}


public class Example {

    public static void main(String[] args) {

        demo demoInstance = (s1, s2, s3) -> s1 + " " + s2 + " " + s3;

        String result = demoInstance.name("Hello", "Functional", "Interface");
        System.out.println("Result: " + result);
    }
}
