import java.util.HashSet;
import java.util.Set;

public class SetDemo
{
    public static void main(String[] args)
    {
        Set<String> st = new HashSet<String>();

        st.add("Deva");
        st.add("Vinod");
        st.add("Ramesh");
        st.add("Mahesh");

        // set not support the duplicate value.
        st.add("Vinod");

        System.out.println(st);
    }
}
