//6. Check if a number is a palindrome
//        (without converting to String)

public class PalindromeCheck {
    public static void main(String[] args){
        int num=139579;
        int original = num;
        int rev = 0;
        while(num!=0){
            rev = rev * 10 + num % 10;
            num /=10;
        }
        System.out.println(rev == original ? "Palindrome" : "Not palindrome");
    }
}
