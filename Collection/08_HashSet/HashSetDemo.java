import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo
{
    public static void main(String[] args)
    {
        HashSet<Integer> hs = new HashSet<Integer>();

        hs.add(45);
        hs.add(56); // HashSet not store duplicate value.
        hs.add(56);

        System.out.println("Hash Set Value : " +hs);

    Iterator<Integer> his = hs.iterator();
        while (his.hasNext())
        {
            System.out.println(his.next());    
        }
    }
}