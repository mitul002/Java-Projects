public class Student extends Person
{
    String subject;
@Override
    void DisplayInfo()
    {
        System.out.println("\nStudent Information:");
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Id : "+id);
        System.out.println("Subject : "+subject);
    }
}
