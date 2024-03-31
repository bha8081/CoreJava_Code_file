import java.util.Enumeration;
import java.util.Vector;

public class EnumerationCursor
{
    public static void main(String[] args)
    {
        Vector<String> v = new Vector<String>();

        v.add("Mark wood");
        v.add("Marco Yansen");
        v.add("Henri clasen");
        v.add("Ab divilers");

        System.out.println(v);

        Enumeration<String> e = v.elements();
        while (e.hasMoreElements())
        {
            System.out.println(e.nextElement());    
        }

    }
}