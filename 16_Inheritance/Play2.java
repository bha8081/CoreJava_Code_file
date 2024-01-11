public class Play2 extends Play3
{
    String name;
    int age;
    String gameName;

    public void players()
    {
        name = "Virat";
        age = 36;
        gameName = "Cricket";
    }

    public void show()
    {
        System.out.println(name+" : "+age+" : "+gameName);
    }
}