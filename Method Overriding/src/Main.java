public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher();
        t1.name="Halim";
        t1.age=30;
        t1.id=111;
        t1.dept="CSE";
        t1.DisplayInfo();


        Student s1 = new Student();
        s1.name="Kolin";
        s1.age=30;
        s1.subject="E.M";
        s1.id=213;
        s1.DisplayInfo();


        Student s2 = new Student();
        s2.name="kane";
        s2.age=30;
        s2.id=213;
        s2.subject="OOP";
        s2.DisplayInfo();



    }
}