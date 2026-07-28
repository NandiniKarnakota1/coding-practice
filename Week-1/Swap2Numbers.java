import java.math.BigDecimal;

public class Swap2Numbers {
    public static void main(String[] args){
      int a = 10;
      int b = 5;
      int temp;

     // Swapping without using variables:
//        a = a+b;
//        b = a-b;
//        a = a-b;
//        System.out.println("Without using Variables:"+"a = " +a+ " " + "b = "+b);

        // Swapping by using XOR:

//        a = a^b;
//        b = a^b;
//        a = a^b;
//        System.out.println("Using XOR operation:"+"a = " +a+ " " + "b = "+b);

        // Swapping by using temp variable:
        temp = a;
        a=b;
        b= temp;
        System.out.println("Using temp variable:"+"a = " +a+ " " + "b = "+b);

    }
}
