public class LaptopAggregation {
    String brand;
    double price;

    LaptopAggregation(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public void printLaptopDetails(){
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }
}
