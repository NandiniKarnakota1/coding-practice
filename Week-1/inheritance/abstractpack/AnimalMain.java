package inheritance.abstractpack;

public class AnimalMain {
    public static void main(String[] args){
        Animal[] ani = {new Dog(), new Cat(), new Animal()};
        for(Animal a : ani){
            System.out.println(a.sound());
        }
    }
}
