package inheritance.abstractpack;

public class EmpManagerMain {
    public static void main(String[] args){
        Manager obj = new Manager("Sree Nrusimha Saraswati Maharaj", 100000,60000);
        System.out.println(obj.calculateSalary());
    }
}
