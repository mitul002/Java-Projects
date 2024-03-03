public class ClassB extends ClassA
{
    //we get x=10 from ClassA
    int x= 5;
    void DisplayInfo()
    {
        System.out.println("x = "+super.x);
    }
}
