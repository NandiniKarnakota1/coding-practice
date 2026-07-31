package inheritance.hierarchial;

public class Device {
    String brand;
    double price;

    Device(String brand, double price){
        this.brand = brand;
        this.price = price;
    }

    public void printDevice(){
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }
}
