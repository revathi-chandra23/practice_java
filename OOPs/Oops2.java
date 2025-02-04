package OOPs;

//2. Write a Java program to create a class called "Dog" with a name and breed attribute.
//Create two instances of the "Dog" class, set their attributes using the constructor
//and modify the attributes using the setter methods and print the updated values.
class Dog
{
    private String name;
    private String breed;
    public Dog(String name,String breed)
    {
        this.name=name;
        this.breed=breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}

public class Oops2 {
    public static void main(String[] args) {
        Dog d=new Dog("puppy","husky");
        System.out.println("name is  "+d.getName()+" breed name "+d.getBreed());
        Dog d1=new Dog("jullie","dabar");
        System.out.println("name is d2 "+d1.getName()+" breed name of d2 is "+d1.getBreed());
        d.setName("ruummy");
        System.out.println("name is  "+d.getName()+" breed name "+d.getBreed());
        d1.setBreed("outside");
        System.out.println("name is d2 "+d1.getName()+" breed name of d2 is "+d1.getBreed());

    }
}
