import java.util.ArrayList;

public class CollectionDemo {
    public static void main(String[] args)
    {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Shubham");
        al.add("Yadav");
        al.add("Jaunpur");

        System.out.println(al);

        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("Bhavesh");
        al2.add("Yadav");
        al2.add("Jaunpur");

        System.out.println(al2);

        // mareg all al and al2 data.
        al.addAll(al2);
        System.out.println(al);

        // remove
        al.remove("Yadav");
        System.out.println(al);

    }
}
