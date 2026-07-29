//2. Check if a number is an Armstrong
//number
//        (Armstrong: sum of digits^n = number itself, n =
//                digit count. e.g., 153 = 1³+5³+3³)
public class ArmstrongNum {
    public static void main(String[] args){
        int num = 153;
        int temp = num;
        int sum =0;
        int rev = 0;

        while(temp>0){
            rev = temp%10;
            sum += rev*rev*rev;
            temp /=10;
        }
        if(sum==num){
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }
    }
}
