package OOPs;
//Write a Java program to create a class called "Employee"with a name, job title, and
// salary attributes, and methods to calculate and update salary.
class Employee
{
    String name,title;
    double salary;
    public Employee(String name, String title, double salary)
    {
        this.name=name;
        this.title=title;
        this.salary=salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getTitle() {
        return title;
    }
    public void updatedsalary(double percentage)
    {
        salary= salary+(salary/percentage);
    }
    public void details()
    {
        System.out.println("employee name :"+name);
        System.out.println("employee job title :"+title);
        System.out.println("salary of the employee :"+salary);
    }
}
public class Oops6 {
    public static void main(String[] args) {
        Employee ep=new Employee("vamsi","s trainee",34567.04);
        Employee ep1=new Employee("revathi","s trainee",94567.04);
        ep.details();
        System.out.println("\n");
        ep1.details();
        System.out.println("\n");
        System.out.println("after rasied the salary");
        ep.updatedsalary(14.3);
        ep.details();
        System.out.println("\n");
        ep1.updatedsalary(8.5);
        ep1.details();



    }
}
