package MethodsPractice;

public class ThisCallingEx {

    ThisCallingEx(int num){
        System.out.println("Sree Kshetra Gangapur");
    }

    ThisCallingEx(){
        this(11);
        System.out.println("Sree Nrusimha Saraswati Swamy");
    }

    ThisCallingEx(String n){
        this();
        System.out.println("Avadhuta Chintana Sree Guru Deva Datta!");
    }

    public static void main(String[] args){
        ThisCallingEx obj = new ThisCallingEx("Jai guru Datta");
    }
}
