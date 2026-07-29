package MethodsPractice;

public class Student {
    String name;
    int id;
    String address;
    int marks;

    Student(String n, int i, String a, int m){
        name = n;
        id = i;
        address = a;
        marks = m;
    }

    public void printStudentDetails(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Address: "+address);
        System.out.println("Marks: "+marks);
    }
}
