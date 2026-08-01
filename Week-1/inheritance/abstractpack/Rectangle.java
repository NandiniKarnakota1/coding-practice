package inheritance.abstractpack;

public class Rectangle extends Shape{
    double l,b;
    Rectangle(double l, double b){
        this.l = l;
        this.b = b;
    }
    @Override
    double area(){
        return l*b;
    }
}
