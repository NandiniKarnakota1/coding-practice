package MethodsPractice;

public class ConstructorEx1 {
    ConstructorEx1(){
        System.out.println("Constructor Ex1 - 1");
    }
    ConstructorEx1(int a){
        System.out.println("Constructor Ex1 - "+a);
    }
    ConstructorEx1(String b){
        System.out.println("Constructor Ex1 - "+b);
    }
    ConstructorEx1(int a,int b){
        System.out.println("Constructor Ex1 - "+ (a+b));
    }
    ConstructorEx1(String a,String b){
        System.out.println("Constructor Ex1 - "+ a + "," + b);
    }
    public static void main(String[] args){
        ConstructorEx1 e1 = new ConstructorEx1();
        ConstructorEx1 e2 = new ConstructorEx1(11);
        ConstructorEx1 e3 = new ConstructorEx1("Nrusimha Saraswati");
        ConstructorEx1 e4 = new ConstructorEx1(11,11);
        ConstructorEx1 e5 = new ConstructorEx1("Nrusimha Saraswati","Ganagapur");

    }
}
