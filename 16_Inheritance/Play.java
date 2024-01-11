public class Play
{
    public static void main(String[] args)
    {
         Play2 play = new Play2();

         System.out.println("Player Name Age and GameName");
         play.players();
         play.show();

         play.setName("Dhoni");
         play.setAge(40);
         play.setGame("India, CSK");

         System.out.println(play.getName()+" : "+play.getAge()+" : "+play.getGame());
    }
}