import java.util.ArrayList;
import java.util.List;

public class ListDemo
{
    public static void main(String[] args)
    {
        List<Integer> lis = new ArrayList<Integer>();
        lis.add(0, 80);
        lis.add(40);
        lis.add(1, 50);
        lis.add(80); // list allow the dupicate value.

        System.out.println(lis);

        // Iterat value.
        // Iterator itr = lis.iterator();
        // while(itr.hashNext())
        // {
        //     System.out.println(itr.next());
        // }
    }
}
