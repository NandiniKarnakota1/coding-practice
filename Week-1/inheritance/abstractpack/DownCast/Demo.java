package inheritance.abstractpack.DownCast;

import inheritance.abstractpack.Animal;
import inheritance.abstractpack.Dog;

public class Demo {
    public static void main(String[] args) {
        Animal a = new Animal();
        if(a instanceof Dog d){
            System.out.println(d.sound());
        }
    }
}
