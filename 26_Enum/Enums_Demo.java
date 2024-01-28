enum Status{
    Pending, Running, Success;
}

public class Enums_Demo
{
    public static void main(String[] args)
    {
        // Status st = Status.Running;
        // System.out.println(st);

        Status[] sta = Status.values();

        for(Status s : sta) {
            System.out.println(s +" : "+s.ordinal());
        }
    }
}