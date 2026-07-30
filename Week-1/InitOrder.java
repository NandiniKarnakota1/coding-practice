public class InitOrder {
    static{
        System.out.println("1: static block");
    }
    {
        System.out.println("2: instance block");
    }
    InitOrder(){
        System.out.println("3: Constructor");
    }

    public static void main(String[] args){
        System.out.println("Before first obj");
        new InitOrder();
        System.out.println("Before Second obj");
        new InitOrder();
    }
}
