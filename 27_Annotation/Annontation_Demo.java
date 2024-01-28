class A
{
    public void showTheDataWhichBelongsToThisClass()
    {
        System.out.println("This is class A method");
    }
}

class B extends A
{
    @Override
    public void showTheDataWhichBelongsToThisClass()
    {
        System.out.println("This is class B method");
    }
}

public class Annontation_Demo
{
    public static void main(String[] args)
    {
        B b = new B();
        b.showTheDataWhichBelongsToThisClass();
    }
}