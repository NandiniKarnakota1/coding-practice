public class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(){
        this("Unknown",0,0.0);
    }
    public Employee(String name, int age){
        this(name, age, 30000);
    }
    public Employee(String n, int a, double sal){
        this.name = n;
        this.age = a;
        this.salary = sal;
    }

    public void print(){
        System.out.println(name + "," + age + "," + salary);
    }

    public static void main(String[] args){
        new Employee().print();
        new Employee("Vallabh",22).print();
        new Employee("GuruDev",25,65000).print();
    }
}
