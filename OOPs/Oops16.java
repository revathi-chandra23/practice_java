package OOPs;
import java.util.*;
//16. Write a Java program to create a class called "Shape" with abstract methods
// for calculating area and perimeter,and subclasses for "Rectangle", "Circle", and "Triangle".
abstract class Shape
{
    abstract int area();
    abstract int perimeter();

}
class Rectangle1 extends Shape {

    private int length;
    private int width;
    public Rectangle1(int length,int width)
    {
        this.length=length;
       this.width=width;
    }

    @Override
    int area() {
       return length*width;
    }

    @Override
    int perimeter() {
        return 2*(length+width);
    }
}
class Circle1 extends Shape {

    private int radius;
    public Circle1(int radius)
    {
        this.radius=radius;

    }

    @Override
    int area() {
        return (int) (3.14*(radius*radius));
    }

    @Override
    int perimeter() {
        return (int) (2*3.14*radius);
    }
}
class Triangle extends Shape
{
    private int side1,side2,side3;

    public Triangle(int side1,int side2,int side3)
    {
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }
    @Override
    int area() {
        double s = (double) (side1 + side2 + side3) / 2; // Calculate the semi-perimeter
        return (int) Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    int perimeter() {
        return side1+side2+side3;
    }
}



public class Oops16 {
    public static void main(String[] args) {
        Rectangle1 r=new Rectangle1(3,8);
        System.out.println("area of rectangle:"+   r.area());
        System.out.println("perimeter of the Rectangle:"+ r.perimeter());
        Circle1 c=new Circle1(3);
        System.out.println("area of circle:"+   c.area());
        System.out.println("perimeter of the circle:"+  c.perimeter());
        Triangle t=new Triangle(2,4,7);
        System.out.println("area of Triangle:"+  t.area());
        System.out.println("perimeter of the Triangle:"+  t.perimeter());
        Shape s=new Rectangle1(2,8);
        System.out.println(s.area());

    }
}
