import java.util.Stack;

public class StackDemo
{
    public static void main(String[] args)
    {
        Stack<String> st = new Stack<String>();

        st.push("hi");
        st.push("vinod");
        st.push("ram");
        st.push("raju");

        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st);
    }
}