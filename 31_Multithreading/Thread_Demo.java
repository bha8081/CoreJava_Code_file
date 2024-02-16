class Demo1 extends Thread
{
    public void run()
    {
        for(int i = 1; i <= 10; i++)
        {
            System.out.println("Ram");
        }
    }
}

class Demo2 extends Thread
{
    public void run()
    {
        for(int i = 1; i <= 10; i++)
        {
            System.out.println("Krish");
        }
    }
}

public class Thread_Demo
{
    public static void main(String[] args)
    {
        Demo1 d1 = new Demo1();
        Demo2 d2 = new Demo2();

        d1.start();
        d2.start();
    }
}