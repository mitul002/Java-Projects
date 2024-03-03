public class Rectangle extends Shape
{
    double length, width;

    Rectangle(double l, double w)
    {
        length=l;
        width=w;
    }
@Override
    double area()
    {
        System.out.print("Area of Rectangle: ");
        return length*width;
    }
}
