interface I1
{
    int age = 23;
    String name = "Shubham";

    void show();
    void display();
}

interface Boat
{
    void owner();
    void company();
}

class I2 implements I1, Boat
{
    public void show()
    {
        System.out.println("This is the show method!!");
    }
    public void display()
    {
        System.out.println("This is display method!!");
    }

    public void owner()
    {
        System.out.println("Aman gupta owner of Boat");
    }
    public void company()
    {
        System.out.println("His company name is Boat");
    }
}

public class Inter_Face
{
    public static void main(String[] args)
    {
        // I1 i1;
        // i1 = new I2();
        // i1.display();
        // i1.show();

        I2 i = new I2();
        i.show();
        i.display();
        i.owner();
        i.company();

        System.out.println("Age: "+I1.age+","+"Name: "+I1.name);
    }
}