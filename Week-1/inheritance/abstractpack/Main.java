package inheritance.abstractpack;

public class Main {
    public static void main(String[] args){
        Shape[] shapes = {new Circle(2), new Rectangle(2,8)};
        for(Shape s : shapes){
            s.display();
        }
    }
}
