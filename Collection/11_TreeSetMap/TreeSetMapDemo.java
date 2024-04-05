import java.util.TreeMap;

public class TreeSetMapDemo
{
    public static void main(String[] args)
    {
        TreeMap<Integer, String> map = new TreeMap<Integer, String>();

        map.put(101, "Raju");
        map.put(102, "Rahul");
        map.put(103, "Ramu");
        map.put(104, "Rajesh");

        System.out.println(map);
        
        System.out.println(map.ceilingEntry(104));

    }
}