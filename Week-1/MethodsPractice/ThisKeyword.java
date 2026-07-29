package MethodsPractice;

public class ThisKeyword {
    int a = 10;

    public void m1(){
        //local variable
        int a = 100;
        System.out.println("a="+a);
        System.out.println(this);
        System.out.println(this.a); // non - static variable
    }

    public static void main(String[] args){
        ThisKeyword obj = new ThisKeyword();
        obj.m1();
    }
}
