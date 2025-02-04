package OOPs;

//https://www.w3resource.com/java-exercises/oop/

//. Write a Java program to create a class called "Person" with
//a name and age attribute. Create two instances of the "Person" class,
//set their attributes using the constructor, and print their name and age
class Person
{
    int age;
    String name;
    public Person(String name,int age)
    {
this.name=name;
this.age=age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class Oops1{
    public static void main(String[] args) {
        Person p=new Person("chan",23);
        System.out.println("name "+p.getName()+",  age  "+ p.getAge());
        p.setAge(22);
        System.out.println( p.getAge());
        p.setName("devi");
        System.out.println( p.getName());

    }
}
