import java.util.HashMap;
import java.util.Map;

public class MapDemo
{
    public static void main(String[] args)
    {
        Map<Integer, String> map = new HashMap<Integer, String>();

        map.put(102, "hi");
        map.put(103, "raju");
        map.put(104, "dinesh");
        map.put(103, "rahul");
        map.put(105, "Shubham");
        map.put(106, "Pankaj");

        // clear method.
        // map.clear();

        // remove method.
        map.remove(104);
        System.out.println(map);
    }
}