package Domestic;

import pet.Cat;
import pet.Dog;
// Pet.Horse has declared later
public class Domestic extends Cat { // To use protected Cat class we need to use inheritance
    public static void main(String[] args) {

        //From same package
        Horse h2 =new Horse();
        h2.Display();


        //From different package

        Domestic cat = new Domestic(); // By inheritance all element of Cat class has come to Domestic
        cat.Display();

        Dog d1 = new Dog();
        d1.Display();
        pet.Horse h1 = new pet.Horse();
        h1.Display();

    }
}
