package MethodsPractice;

public class PenDriver {
    public static void main(String[] args){
        Pen p1 = new Pen();
        Pen p2 = new Pen();
        System.out.println("Brand:" + p1.brand);
        System.out.println("Color:" + p1.color);
        System.out.println("Price:" + p1.price);
        System.out.println("-------------------------------");
        System.out.println("Brand:" + p2.brand);
        System.out.println("Color:" + p2.color);
        System.out.println("Price:" + p2.price);
    }
    /* Disadvantage -> If we initailize values for one object, all objects
    contains same values.
     */
}
