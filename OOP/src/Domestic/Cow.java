package Domestic;

import pet.Cat;
import pet.Dog;
// Pet.Horse has declared later
public class Cow extends Cat {
    public static void main(String[] args) {

        //From same package
        Horse h2 =new Horse();
        h2.Display();


        //From different package

        Cow c1 = new Cow();
        c1.Display();

        Dog d1 = new Dog();
        d1.Display();
        pet.Horse h1 = new pet.Horse();
        h1.Display();

    }
}
