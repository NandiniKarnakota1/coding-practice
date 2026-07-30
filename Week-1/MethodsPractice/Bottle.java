package MethodsPractice;

public class Bottle {
    String bname;
    String bcolor;
    int bprice;

    Bottle(String bn, String bc, int bp) {
        this.bname = bn;
        this.bcolor = bc;
        this.bprice = bp;
    }
    public void printBottle(){
        System.out.println("Bottle name: " + this.bname);
        System.out.println("Bottle color: " + this.bcolor);
        System.out.println("Bottle price: " + this.bprice);
    }
}
