class Employee
{
    private int id;
    private String name;
    private int age;
    private String address;

    public void setEmploye(int a)
    {
        id = a;
    }
    public int getEmploye()
    {
       return id;
    }
    public void setName(String n)
    {
        name = n;
    }
    public String getName()
    {
        return name;
    }
    public void setAge(int b)
    {
        age = b;
    }
    public int getAge()
    {
        return age;
    }
    public void setAddress(String addr)
    {
        address = addr;
    }
    public String getAddress()
    {
        return address;
    }
}

public class Encapsulation_In
{
    public static void main(String[] args)
    {
        Employee e = new Employee();
        e.setEmploye(1);
        e.setName("Bhavesh");
        e.setAge(23);
        e.setAddress("Murtazabad");

        System.out.println(e.getEmploye()+" : "+e.getName()+" : "+e.getAge()+" : "+e.getAddress());
    }
}