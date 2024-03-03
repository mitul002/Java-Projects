//Example of Inheritance
public class Main {
    public static void main(String[] args)
    {
//Student Class
        Student s1 = new Student();
        s1.name ="Tom";
        s1.age =17;
        s1.roll=127;

        s1.DisplayInfoStudent();


        Student s2 = new Student();
        s2.name ="Jerry";
        s2.age =15;
        s2.roll=128;

        s2.DisplayInfoStudent();


//Person Class
        Person p1 = new Person();
        p1.name ="Ben";
        p1.age =25;
        p1.DisplayInfoPerson();
    }
}