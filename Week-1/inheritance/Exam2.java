package inheritance;

public class Exam2 extends Exam1 {
    int b = 20;
    Exam2(){
        super();
    }

    public static void main(String[] args){
        Exam2 obj = new Exam2();
        System.out.println(obj.b);
    }

}
