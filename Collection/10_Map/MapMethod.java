import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapMethod {
    public static void main(String[] args) {
        Map<Integer, String> mp = new HashMap<Integer, String>();

        mp.put(101, "marsh");
        mp.put(102, "virat");
        mp.put(103, "dubey");
        mp.put(104, "null");
        mp.put(105, "null");

        System.out.println(mp);

        for (Map.Entry<Integer, String> me : mp.entrySet())
        {
            System.out.println(me.getKey()+" -> "+me.getValue());
        }

        // Set set = mp.entrySet();
        // System.out.println(set);

        // Iterator itr = set.iterator();
        // while(itr.hasNext())
        // {
        //     System.out.println(itr.next());
        //     Map.Entry entry = (Map.Entry) itr.next();
        //     System.out.println(entry.getKey()+" -> "+entry.getValue());
        // }
    }
}