public class Teacher
{
    String name, gender;
    int age;

    Teacher () //Default Constructor
    {
        System.out.println ("No Data");
    }


    Teacher (String n, int a)  // Overloading Constructor
    {
        name = n;
        age = a;
    }

    void displayInfo ()
    {
        System.out.println ("Name :" + name);
        System.out.println ("Gender :" + gender);
        System.out.println ("Age :" + age);
        System.out.println ("\n");
    }
}
