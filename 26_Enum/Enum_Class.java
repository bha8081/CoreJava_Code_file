enum Laptop
{
    Mackbook(6300), HP(5699), Lenevo(8000), Dell(9999);

    private int price;

    // Create constructur
    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice()
    {
        return price;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

}

public class Enum_Class
{
    public static void main(String[] args)
    {
        // Laptop lap = Laptop.Dell;
        // System.out.println(lap +":"+lap.getPrice());

        for(Laptop lap : Laptop.values())
        {
            System.out.println(lap + " : "+lap.getPrice());
        }
    }
}
