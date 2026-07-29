package MethodsPractice;

public class RecursiveFibonacciNth {
    public static int calcfibo(int n){
        if(n==0){
            return 0;
        } else if(n==1){
            return 1;
        }
        return calcfibo(n-1)+calcfibo(n-2);
    }
    public static void main(String[] args){
        int pos = 9;
        int fibonum = calcfibo(pos);
        System.out.println(fibonum);
    }
}
