public class Teacher extends Person {
    private int id;


    // Getter & Setter
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }


    //Constructor
    Teacher(String n, int a, int i)
    {
        super(n,a);
        id =i;
    }

    //Method
    void display()
    {
        System.out.println("ID:"+getId());
        System.out.println("Name:"+getName());
        System.out.println("Age:"+getAge());
    }

}
