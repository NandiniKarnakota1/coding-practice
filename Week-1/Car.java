public class Car {
    String brand;
    String color;

    Engine engine;
    Car(String br,String c, String ft){
        this.brand = br;
        this.color = c;
        engine = new Engine(ft);
    }

}
