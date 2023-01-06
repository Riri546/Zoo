package ZOO;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Dog dog1 = new Dog();
        Radio radio = new Radio();
        List<Animal> animals = new ArrayList<>();
        animals.add(cat1);
        animals.add(dog1);
        speakAll(animals);
    }
    public static void speakAll(List<Animal> animals){
       for(Animal animal: animals){
        animal.speak();
       }
    }
}
