package inheritance.hierarchial;

public class Mobile extends Device{
    int campixel;
    Mobile(String brand, double price, int campixel){
        super(brand, price);
        this.campixel = campixel;
    }

    public void printMobile(){
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Campixel: " + campixel +"MP");
    }
}
