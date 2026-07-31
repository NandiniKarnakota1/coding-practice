public class CarDriver {
    public static void main(String[] args){
        Car c1 = new Car("BMW M5", "White", "Diesel");
        System.out.println(c1.brand + "," + c1.color + "," + c1.engine + "," + c1.engine.fuelType);
    }
}
