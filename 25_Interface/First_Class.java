interface Computer
{
    void code();
}

class Laptop implements Computer
{
    public void code()
    {
        System.out.println("code, compile, run");
    }
}

class Desktop implements Computer
{
    public void code()
    {
        System.out.println("code, compile, run: Faster");
    }
}

class Developer
{
    public void devApp(Computer lap)
    {
        // System.out.println("this is class A");

        lap.code();
    }
}

public class First_Class
{
    public static void main(String[] args)
    {
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        lap.code();

        Developer dev = new Developer();
        dev.devApp(desk);
    }
}