public class Main {
    public static void main(String[] args) {

        /* We can't create object of an abstract class.
            we need to create reference variable of superclass "User"
         */
        User us; //reference variable
        us = new Jack();
        us.SendMessage();

        us = new John();
        us.SendMessage();
    }
}