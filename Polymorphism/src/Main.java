public class Main {
    public static void main(String[] args)
    {
            Shape s1 = new Shape();
            Shape s2 = new Rectangle(20, 5);
            Shape s3 = new Triangle(6, 7);

            //Runtime Polymorphism / dynamic method dispatch
            System.out.println(s1.area());
            System.out.println(s2.area());
            System.out.println(s3.area());

    }
}