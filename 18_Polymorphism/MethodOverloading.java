class Overloading
{
    void show(int a, String b)
    {
        System.out.println("hi");
    }
    void show(String a, int b)
    {
        System.out.println("heloo");
    }

}

public class MethodOverloading {
    public static void main(String[] args)
    {

        Overloading ol = new Overloading();
        ol.show(7, "k");
    }
}
