package inheritance;

public class StaticDerived extends StaticBase{
    public static void view1(){
        System.out.println("This is Derived class method.");
    }

    public static void main(String[] args){
        System.out.println(StaticDerived.num);
        StaticDerived.view();
        view1();
    }
}
