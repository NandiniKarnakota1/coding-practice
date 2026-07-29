package MethodsPractice;

public class Practice {
    int a;
    double b = 11.11;
    Practice(){
        System.out.println("Inside Constructor");
    }
    public void m1(){
        System.out.println("Inside m1 NSM");
    }
    {
        System.out.println("Inside Non-static multi line Initializer -1.");
    }
    {
        System.out.println("Inside Non-static multi line Initializer -2.");
    }
    {
        System.out.println("Inside Non-static multi line Initializer -3.");
    }
    {
        System.out.println("Inside Non-static multi line Initializer -4.");
    }


    public static void main(String[] args){
        System.out.println("Main STarted...");
        Practice p = new Practice();
        System.out.println(p.a);
        System.out.println(p.b);
        p.m1();

    }
}
