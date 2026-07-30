import java.util.Scanner;
public class NewPersonDriver {
    // Factory Method
    public static NewPerson createObj(String n,int a){
        return new NewPerson(n,a);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name1 = sc.nextLine();
        System.out.println("Enter the age: ");
        int age1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name: ");
        String name2 = sc.nextLine();
        System.out.println("Enter the age: ");
        int age2 = sc.nextInt();

        NewPerson obj1 = createObj(name1,age1);
        obj1.printDetails();
        NewPerson obj2 = createObj(name2,age2);
        obj2.printDetails();

    }
}
