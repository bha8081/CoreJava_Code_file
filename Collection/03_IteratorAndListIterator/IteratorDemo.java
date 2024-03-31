import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo
{
    public static void main(String[] args)
    {
        List<String> l = new ArrayList<String>();

        l.add("Michel");
        l.add("Warner");
        l.add("Spensor");

        System.out.println(l);

        Iterator<String> itr = l.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}