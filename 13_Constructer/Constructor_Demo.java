class Cricket
{
    String team;
    String caption;

    public Cricket()
    {
        team = "CSK";
        caption = "Ms.Dhoni";
        System.out.println("in constructor");
    }
}

public class Constructor_Demo
{
    public static void main(String[] args)
    {
         Cricket crt1 = new Cricket();
        // Cricket crt2 = new Cricket();

        System.out.println(crt1);
    }
}