class Car
{
    static String brand;
    String name;
    int module;
    int price;

    public void show()
    {
        System.out.println(brand+ " : " +name+ " : " +module+ " : " +price);
    }
}


public class Static_Veriable
{
    public static void main(String[] args)
    {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        Car.brand = "Mahindra";
        car1.name = "Thar";
        car1.module = 2023;
        car1.price = 120000;

        Car.brand = "Maruti Suziki";
        car2.name = "Swift dzier";
        car2.module = 2024;
        car2.price = 700000;

        Car.brand = "Mahindra";
        car3.name = "Scoripio";
        car3.module = 2023;
        car3.price = 1500000;
    
     //   car1.brand = "ODI"; // This is the static block so it is overwride the brand name every car by the ODI.

        System.out.println("Car Detels");
        System.out.println("----------------------------");
        car1.show();
        car2.show();
        car3.show();

    }

}