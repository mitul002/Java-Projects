public class Teacher extends Person
{
    String dept;
@Override
    void DisplayInfo()
    {
        System.out.println("\nTeacher Information");
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Id : "+id);
        System.out.println("Department : "+dept);
    }
}
