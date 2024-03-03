public class Main {
    public static void main(String[] args)
    {
        Rectangle r1 = new Rectangle();
        r1.setHeight(10);
        System.out.println("HEIGHT: "+r1.getHeight());

        r1.setWidth(15);
        System.out.println("WIDTH: "+r1.getWidth());

        r1.setArea(r1.getHeight()*r1.getWidth());

        System.out.println("AREA: "+r1.getArea());
    }
}