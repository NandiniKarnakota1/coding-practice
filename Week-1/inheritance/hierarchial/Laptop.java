package inheritance.hierarchial;

public class Laptop extends Device {
    int ssd;
    Laptop(String brand, double price, int ssd){
        super(brand, price);
        this.ssd = ssd;
    }

    public void printLaptop(){
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Ssd: " + ssd);
    }
}
