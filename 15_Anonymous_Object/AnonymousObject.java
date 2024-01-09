class Student
{
    int x, y, z;

    public Student()
    {
        System.out.println("This is Constructor");
    }

    public void addition()
    {
        x = 19;
        y = 20;
    }
    public int add()
    {
        z = x + y;
        return z;
    }
    public void show()
    {
        System.out.println("Hi this is Anonymous function");
        System.out.println(z);
    }
}

public class AnonymousObject
{
    public static void main(String[] args)
    {
        // Student st = new Student();
        // st.addition();
        // st.add();
        // st.show();

    // Anonymous Object
        new Student(); // anonymous object.
        new Student().show();

    }
}