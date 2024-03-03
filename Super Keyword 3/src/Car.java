//Child Class
public class Car extends Vehicle
{
    int model;

    Car(String c , double w, int m)
    {
        super(c,w);
        model = m;
    }
    @Override
    void DisplayInfo()
    {
        super.DisplayInfo();
        System.out.println("Model :"+model);
    }

}
