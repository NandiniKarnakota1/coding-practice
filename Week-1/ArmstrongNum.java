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
