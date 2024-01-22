class Movie
{
    public void show()
    {
        System.out.println("Fighter is a good movie");
    }
}

public class AnonymoushInner
{
    public static void main(String[] args)
    {
        Movie m = new Movie()
        {
            // create anonymoush class
            public void show()
            {
                System.out.println("Ritik Roshan is main hero this movie");
            }

        };
        m.show();
    }
}