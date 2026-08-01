package inheritance.abstractpack;

public class Overloads {
    void show(int a){
        System.out.println("int: " +a);
    }
    void show(double a){
        System.out.println("double: "+a);
    }
    void show(String a){
        System.out.println("String: " +a);
    }
    void show(int a, int b){
        System.out.println("two ints a,b: " + (a+b));
    }

    public static void main(String[] args){
        Overloads obj = new Overloads();
        obj.show(5);
        obj.show(5.5);
        obj.show("Sree Nrusimha Saraswati Maharaj!!!");
        obj.show(1,2);
    }
}
