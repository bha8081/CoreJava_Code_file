class Boy
{
    int age;

    public void show()
    {
        System.out.println("Condition for vote");
    }
    static class Voter
    {
        public void show()
        {
            System.out.println("Only 18+ boys vote");
        }
    }
}

public class InnerClass
{
    public static void main(String[] args)
    {
        Boy b = new Boy();
        b.show();

        // Boy.Voter v = b.new Voter();
        // v.show();

        // when class is static then
        Boy.Voter by = new Boy.Voter();
        by.show();
    }
}