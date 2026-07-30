public class NewPerson{
    String name;
    int age;

    public NewPerson(String n, int a){
        this.name=n;
        this.age=a;
    }

    public void printDetails(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("-----------------");
    }
}
