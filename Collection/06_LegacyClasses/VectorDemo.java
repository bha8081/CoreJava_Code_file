import java.util.Vector;

public class VectorDemo
{
    public static void main(String[] args)
    {
        Vector<String> v =new Vector<String>();

        v.add("shubham");
        v.add(0, "nitesh");
        v.addElement("pankaj");
        v.add("c");
        v.add("harish");

        System.out.println(v.lastElement());

        System.out.println(v.capacity());
    }
}