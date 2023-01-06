package ZOO;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Dog dog1 = new Dog();
        Radio radio = new Radio();
        List<Speakable> speakables = new ArrayList<>();
        speakables.add(cat1);
        speakables.add(dog1);
        speakables.add(radio);
        speakAll(speakables);
    }
    
    public static void speakAll(List<Speakable> speakables){
       for(Speakable speakable: speakables){
        speakable.speak();
       }
    }
}
