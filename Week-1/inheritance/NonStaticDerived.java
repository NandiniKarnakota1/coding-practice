package inheritance;

public class NonStaticDerived extends NonStaticBase{
    public void view1(){
        System.out.println("This is non static method from derived class.");
    }

    public static void main(String[] args){
        NonStaticDerived obj = new NonStaticDerived();
        System.out.println(obj.num);
        obj.view();
        obj.view1();

    }
}
