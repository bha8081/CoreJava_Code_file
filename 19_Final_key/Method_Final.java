class Demo
{
    final void show()
    {
        System.out.println("hi");
    }
    public void m1()
    {
        System.out.println("Hello");
    }
}

class Demo2 extends Demo
{
    // public void show()
    // {
    //     System.out.println("Demo class Override");
    // }
    public void m1()
    {
        System.out.println("m1 method override");
    }
}

public class Method_Final
{
    public static void main(String[] args)
    {
        Demo2 d = new Demo2();
        d.show();
        d.m1();
    }
}