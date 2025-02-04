package OOPs;
//8. Write a Java program to create class called "TrafficLight" with attributes for color
// and duration, and methods to change the color and check for red or green.

class TrafficLights
{
    String color;
    int duration;

    public TrafficLights(String color,int duration){
        this.color=color;
        this.duration=duration;

    }
    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    public boolean isred()
    {
        return color.equals("red");
    }
    public boolean isgreen()
    {
        return color.equals("green");
    }



    public void changecolor(String newcolor)
    {
        color=newcolor;
    }
}
public class Oops8 {
    public static void main(String[] args) {
        TrafficLights tl=new TrafficLights("red",90);
        tl.isgreen();
        System.out.println("light is red "+tl.isred());
        System.out.println("light is green "+tl.isgreen());
        System.out.println("duration :"+tl.getDuration());
        tl.changecolor("green");
        System.out.println("light is red "+tl.isred());
        System.out.println("light is green "+tl.isgreen());
        tl.setDuration(50);

        System.out.println("duration :"+tl.getDuration());

        int num=1234;
        String totalBits=Integer.toBinaryString(num);
        int totalBitsCount=Integer.toBinaryString(num).length();
        int oneBits=Integer.bitCount(num);
        int zeroBits=totalBitsCount-oneBits;
        System.out.println("Binary Representation of the number: "+totalBits);
        System.out.println("Total number of bits: "+totalBitsCount);
        System.out.println("One bits in binary representation of that number: "+oneBits);
        System.out.println("zero bits in binary representation of that number: "+zeroBits);

    }


}
