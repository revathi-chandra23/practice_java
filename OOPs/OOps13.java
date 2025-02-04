package OOPs;
//13. Write a Java program to create a class called "Inventory" with a collection
// of products and methods to add and remove products, and to check for low inventory.

import java.util.ArrayList;

class Product
{
    String name;
    int quantity;
    public Product(String name,int quantity)
    {
        this.name=name;
        this.quantity=quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
class Inventory
{
    private ArrayList<Product> Products;
    public Inventory()
    {
        this.Products=new ArrayList<Product>();
    }

    public void addp(Product products)
    {
        Products.add(products);
    }
    public  void removep(Product products)
    {
Products.remove(products);
    }

 public void checklowQuantity()
 {
     for(Product product:Products)
     {
if(product.getQuantity()<=80)
{
    System.out.println(product.getName()+" is low inventory . current quantity:"+product.getQuantity());
}
else {
    System.out.println( product.getName()+" not an low quantity inventory");
}
     }
 }
}

public class OOps13 {
    public static void main(String[] args) {

Product p1=new Product("meera",100);
Inventory i=new Inventory();
i.addp(p1);


        Product p2=new Product("ponds",30);
        i.addp(p2);


        Product p3=new Product("lipstick",10);
        i.addp(p3);


        Product p4=new Product("bindi",100);
            i.addp(p4);
            i.checklowQuantity();
        System.out.println("\nAfter removing :");
            i.removep(p3);
        i.checklowQuantity();

    }
}
