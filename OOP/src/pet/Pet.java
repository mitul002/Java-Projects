package pet;

public class Pet {
    public static void main(String[] args) {

        Cat c1= new Cat(); // Protected
        c1.Display();

        Dog d1 = new Dog(); //Public
        d1.Display();

        Horse h1 = new Horse(); //Public
        h1.Display();
    }
}
