public class Main
{
    public static void main (String[]args)
    {
        Teacher obj1 = new Teacher ("Arif", "Male", 35); // Parameterized Constructor
        obj1.displayInfo ();


        Teacher obj2 = new Teacher ("Amin", "Male", 32); // Parameterized Constructor
        obj2.displayInfo ();


        Teacher obj3 = new Teacher ("Halim",30); // Overloading Constructor
        obj3.displayInfo ();


        Teacher obj4 = new Teacher (); //Default Constructor
        obj4.displayInfo ();
    }

}
