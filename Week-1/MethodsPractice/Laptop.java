package MethodsPractice;

public class Laptop{
    String name;
    String color;
    double price;

    Laptop(String n) {
        this.name = n;
    }
    Laptop(String n, String c) {
        this(n);
        this.color = c;
    }
    Laptop(String n, String c, double p) {
        this(n,c);
        this.price = p;
    }

    public void printLaptopDetails(){
        if(name!=null){
            System.out.println("Laptop name: "+name);
            System.out.println("----------------------");
        }
        if(color!=null){
            System.out.println("Laptop color: "+color);
            System.out.println("----------------------");

        }
        if(price>0.0){
            System.out.println("Laptop price: "+price);
            System.out.println("----------------------");

        }

    }
}