package OOPs;
//3. Write a Java program to create a class called "Rectangle" with
//width and height attributes. Calculate the area and perimeter of the rectangle.
class Rectangle{
    int width;
    int height;
    public Rectangle(int width,int height)
    {
        this.width=width;
        this.height=height;

    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
    public int area()
    {
        return (getWidth()*getHeight());
    }
    public int perimeter()
    {
        return (2+(getWidth()*getHeight()));
    }
}


public class Oops3 {
    public static void main(String[] args) {
        Rectangle r=new Rectangle(22,44);
        System.out.println("width:"+r.getWidth()+"\t"+"height:"+r.getHeight());
        System.out.println("area:"+r.area()+"\n"+"perimeter:"+r.perimeter());
    }
}
