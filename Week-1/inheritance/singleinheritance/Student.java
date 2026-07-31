package inheritance.singleinheritance;

public class Student extends Person {
    int sid;
    Student(String name, int age, int sid){
        super(name, age);
        this.sid = sid;
    }
    public void printStdDetails(){
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student Sid: " + sid);
    }
}
