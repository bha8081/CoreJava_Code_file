import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo
{
    public static void main(String[] args)
    {
        List<Integer> l = new ArrayList<Integer>();

        l.add(20);
        l.add(52);
        l.add(60);
        l.add(79);

        System.out.println(l);

        ListIterator<Integer> lt = l.listIterator();
        while(lt.hasNext())
        {
            System.out.println(lt.next());
        }
    }
}