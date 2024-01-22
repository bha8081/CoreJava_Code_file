abstract class Dance1
{
    public abstract void show();
    public abstract void display();
}

// class Dance2 extends Dance1
// {
//     public void show()
//     {
//         System.out.println("Dance odition going on");
//     }
// }


public class AbstractAnonymousInner {
    public static void main(String[] args)
    {
        Dance1 dc = new Dance1()
        {
            // create abstract anonymous inner class
            public void show()
            {
                System.out.println("Dance odition end");
            }

            public void display()
            {
                System.out.println("this is another abstract anonymous class");
            }
        };

        dc.show();
        dc.display();
    }
}
