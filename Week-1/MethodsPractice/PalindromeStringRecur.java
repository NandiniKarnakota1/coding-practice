package MethodsPractice;

public class PalindromeStringRecur {
    public static boolean isPalindrome(String str){
        if(str.length()<=1){
            return true;
        }
        char fchar = str.charAt(0);
        char lchar = str.charAt(str.length()-1);
        if(fchar!=lchar){
            return false;
        }
        String remSubString = str.substring(1, str.length()-1);
        return isPalindrome(remSubString);
    }
    public static void main(String[] args){
        String str = "java";
        System.out.println(isPalindrome(str));
    }
}
