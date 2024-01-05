class Movie
{
    static String dirctor;
    String movieName;
    int buget;

    public void show()
    {
        System.out.println(dirctor+" : "+movieName+" : "+buget);
    }

    public static void show1(Movie movie)
    {
        System.out.println(movie.dirctor+ " : "+movie.movieName+ " : "+movie.buget);
    }
}

public class Static_Method
{
    public static void main(String[] args)
    {
        Movie movie = new Movie();

        Movie.dirctor = "S.S Rajamoli";
        movie.movieName = "Salaar";
        movie.buget = 400;

        Movie movie1 = new Movie();
        Movie.dirctor = "S.S Rajamoli";
        movie1.movieName = "Bahubali";
        movie1.buget = 600;

        movie.show();
        movie1.show();

        Movie.show1(movie);

    }
}