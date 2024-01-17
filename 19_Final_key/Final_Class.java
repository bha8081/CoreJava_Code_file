final class Boy
{
    public void show()
    {
        System.out.println("Boys play the cricket at 4pm");
    }
}

class Girl //extends Boy
{
    public void show()
    {
        System.out.println("Girls play KhoKho in ground");
    }
}

public class Final_Class
{
    public static void main(String[] args)
    {
        Boy b = new Boy();
        b.show();
        Girl g = new Girl();
        g.show();
    }   
}