import java.util.LinkedList;

public class LinkedListDemo
{
    public static void main(String[] args)
    {
        LinkedList<Integer> li = new LinkedList<Integer>();

        li.add(104);
        li.add(20);
        li.add(null);
        li.add(380);
        li.add(null);
        li.add(40);

        System.out.println(li);
    }
}