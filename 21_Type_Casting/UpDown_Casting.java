class A
{
    public void show1()
    {
        System.out.println("this is A class");
    }
}

class B extends A
{
    public void show2()
    {
        System.out.println("this is B class");
    }
}

public class UpDown_Casting
{
    public static void main(String[] args)
    {
        // upcasting
        A obj1 = new B();
        obj1.show1();

        // down casting
        B obj2 = (B) obj1;
        obj2.show2();

    }
}