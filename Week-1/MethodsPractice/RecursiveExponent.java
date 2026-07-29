package MethodsPractice;

public class RecursiveExponent {
    public static int calc(int base, int exponent){
        if(exponent == 0){
            return 1;
        }
        return base * calc(base, exponent-1);
    }

    public static void main(String[] args){
        int base = 3;
        int exponent = 4;
        int res = calc(base,exponent);
        System.out.println(res);
    }







































































































}
