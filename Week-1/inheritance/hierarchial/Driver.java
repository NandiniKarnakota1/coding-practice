package inheritance.hierarchial;

public class Driver {
    public static void main(String[] args){
        Laptop lap = new Laptop("Dell",60000,512);
        lap.printLaptop();
        Mobile mob = new Mobile("Motorola Edge 50 Fusion",30000,55);
        mob.printMobile();
    }
}
