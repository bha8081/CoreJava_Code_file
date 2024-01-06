class Player
{
    String name;
    static String game;
    int age;

    // Create a static block.
    static
    {
        game = "IPL";
        System.out.println("This is the static block");
    }

    // Create a constructor.
    public Player()
    {
        name = "CSK";
        age = 30;
        System.out.println("This is constructor");

    }

    public void show()
    {
        System.out.println(name+" : "+game+" : "+age);
    }
}

public class Static_Block
{
    public static void main(String[] args)
    {
        Player ply = new Player();
        ply.name = "Dhoni";
        Player.game = "Cricket";
        ply.age = 40;

        ply.show();

        // Player ply2 = new Player();
    }
}