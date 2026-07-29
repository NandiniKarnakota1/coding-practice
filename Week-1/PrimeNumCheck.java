//3. Check if a number is prime
import java.util.Scanner;
public class PrimeNumCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num:");
        int num = sc.nextInt();
       System.out.println(isPrime(num));
    }

    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2; i*i<=num; i++){
            if(num%i==0){return false;}
        }
        return true;
    }
}
