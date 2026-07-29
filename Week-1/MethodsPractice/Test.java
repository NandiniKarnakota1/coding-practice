package MethodsPractice;
import MethodsPractice.*;
public class Test {
    // single line static initializer
//    static String name = "Nrusimha Saraswati";
//    static int age = 22;

    // single line non static initializer:
//    int num = 11;
//     {
//        System.out.println("Jai guru datta - MLNSI");
//    }
//     {
//        System.out.println("sripada vallabha - MLNSI");
//    }
//    {
//        System.out.println("nrusimha saraswati - MLNSI");
//    }
//
//    public void view(){
//        System.out.println("Nrusimha Saraswati swamy... test method");
//    }

    //no arg - constructor
    Test(){
        System.out.println("Inside No-arg Test Constructor");
    }
    Test(int a){
        System.out.println("Inside Parameterized constructor");
    }
   void Test(){
        System.out.println("Inside Test Method");
   }

    public static void main(String[] args){
//        Demo.view();
//          Demo d1 = new Demo();
//        d1.view();
//        System.out.println("Datta guru parampara ");
//        System.out.println("Gurudev datta.");
//         System.out.println(d1.a);
//         System.out.println(d1.b);
//        d1.demoview();
        Test t2 = new Test();
       Test t1 = new Test(11);
//        t1.view();
//       System.out.println(t1.num);
        t1.Test();
    }
}
