class Books
{
    String author;
    String bookName;
    int year;
    int price;

    public void show()
    {
        System.out.println(author+ " : "+bookName+ " : "+year+ " : "+price);
    }
}

class Train
{
    String trainName1 = "Lokman Tilk";
    int trainNumber1 = 11065;
    String startingPoint1 = "Jaunpur Jun";
    String endPoint1 = "Mumbai";

    public void show1()
    {
        System.out.println(trainName1+ " : "+trainNumber1+ " : "+startingPoint1+ " : "+endPoint1);
    }
}

public class Static_Method_Demo
{
    public static void main(String[] args)
    {
        Books book1 = new Books();
        book1.author = "James Gosling";
        book1.bookName = "Java";
        book1.year = 1995;
        book1.price = 1500;

        Books book2 = new Books();
        book2.author = "Brendan Eich";
        book2.bookName = "JavaScript";
        book2.year = 1935;
        book2.price = 2000;

        Books book3 = new Books();
        book3.author = "Jordan Walke";
        book3.bookName = "ReactJs";
        book3.year = 2013;
        book3.price = 1000;

        Train t = new Train();
        t.show1();
        System.out.println( );
        book1.show();
        book2.show();
        book3.show();

    }
}