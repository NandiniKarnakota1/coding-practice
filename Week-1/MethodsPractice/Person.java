package MethodsPractice;

public class Person {
    String name;
    String address;
    Person(String n, String a){
        name = n;
        address = a;
    }
    public void printPersonDetails(){
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("------------------------------------");
    }
}
