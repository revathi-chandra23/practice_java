package OOPs;
//4.. Write a Java program to create a class called "Circle" with a radius attribute.
// You can access and modify this attribute. Calculate the area and circumference
// of the circle.
class Circle
{
    private double radius;
    public Circle(double radius)
    {
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double area(){
        return 3.14*radius*radius;
    }
    public double circumference()
    {
        return  2*3.14*radius*radius;
    }
}

public class Oops4 {
    public static void main(String[] args) {
        Circle c=new Circle(2.0);
        System.out.println("area:"+c.area()+" circumference "+c.circumference());
        c.setRadius(4.0);
        System.out.println("area:"+c.area()+" circumference "+c.circumference());

    }

}
