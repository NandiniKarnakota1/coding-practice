package MethodsPractice;

public class LaptopDriver {
    public static void main(String[] args){
        Laptop l1 = new Laptop("Dell","Silver",61500);
        l1.printLaptopDetails();
        Laptop l2 = new Laptop("Hp","Black",72000);
        l2.printLaptopDetails();
        Laptop l3 = new Laptop("linux");
        l3.printLaptopDetails();
        Laptop l4 = new Laptop("Ubuntu","Silver-White");
        l4.printLaptopDetails();
        Laptop l5 = new Laptop("","",90250);
        l5.printLaptopDetails();
    }
}
