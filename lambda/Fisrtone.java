package lambda;
interface car
{
    public void drive();
}

class Benz implements car{

    @Override
    public void drive() {
        System.out.println("im benz");
    }
}
public class Fisrtone {
    public static void main(String[] args) {
      //anonymous class function
        car c=new car() {
            @Override
            public void drive() {
                System.out.println("this is the red breeza");
            }
        } ;
        c.drive();
        // ny using lamda expression
        car c1=() -> System.out.println("this is the blueee breeza");
        c1.drive();

//normal way verbose code
        Benz b=new Benz();
        b.drive();
    }
}
