package OOPs;
//10. Write a Java program to create a class called "Student" with a name, grade, and courses
// attributes, and methods to add and remove courses.

import java.util.ArrayList;

class Student
{
String name;
int grade;
private ArrayList courses;
public Student(String name, int grade)
{
    this.name=name;
    this.grade=grade;
    this.courses=new ArrayList<>();
}

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }
    public ArrayList getCourse() {
        return courses;
    }
    public void addcourse
            (String course)
    {
        courses.add(course);

    }
    public void removecourse
            (String course)
    {
        courses.remove(course);

    }
    public void details()
    {
        System.out.println("name :"+getName());
        System.out.println("Grade :"+getGrade());
       // System.out.println("courses :"+getCourse());
    }
}

public class Oops10 {
    public static void main(String[] args) {
        Student s1=new Student("somes",98);
        Student s2=new Student("vamsi",67);
        Student s3=new Student("chandra",84);

s1.addcourse("java");
s1.addcourse("python");
s1.addcourse("linux");
s1.details();
System.out.println("courses after adding"+s1.getCourse()+"\n");
s1.removecourse("python");
        System.out.println("courses after removing"+s1.getCourse()+"\n");
        s2.details();s3.details();


    }
}
