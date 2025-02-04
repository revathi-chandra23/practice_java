package OOPs;
//9. Write a Java program to create a class called "Employee" with a name,
// salary, and hire date attributes, and a method to calculate years of service.
import java.time.LocalDate;

import java.time.Period;
class Employee1
{
    public String name;
    private int salary;
    public LocalDate HireDate;

    public Employee1(String name,int salary,LocalDate HireDate) {
        this.name = name;
        this.salary=salary;
        this.HireDate=HireDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public LocalDate getHireDate() {
        return HireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        HireDate = hireDate;
    }
    public int getYearsofService()
    {
        return Period.between(HireDate,LocalDate.now()).getYears();
    }
    public void details()
    {
        System.out.println("Name :"+getName());
        System.out.println("salary :"+getSalary());
        System.out.println("hire date :"+getHireDate());
      System.out.println("experience :"+getYearsofService()+"\n");
    }
}

public class Oops9 {
    public static void main(String[] args) {
        Employee1 ep1=new Employee1("revathi chandra",30000, LocalDate.parse("2021-04-01"));
        Employee1 ep2=new Employee1("vamshi nallavali",67000, LocalDate.parse("2019-03-01"));
        Employee1 ep3=new Employee1("somes",38000, LocalDate.parse("2023-01-11"));
ep1.details();ep2.details(); ep3.details();

    }
}
