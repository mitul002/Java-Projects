public class Encapsulation {
    public static void main(String[] args)
    {
        Person p1 = new Person();
        p1.setName("Kane");
        p1.setAge(24);

        System.out.println(p1.getName());
        System.out.println(p1.getAge());
    }
}