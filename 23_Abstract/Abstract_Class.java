abstract class Abstract_Class
{
    abstract void start();
}

class Car extends Abstract_Class
{
    void start()
    {
        System.out.println("this is abstract meathod");
    }
}

class Scooter extends Abstract_Class
{
    void start()
    {
        System.out.println("Scooter start with kick");

    }

    public static void main(String[] args) {
        // Abstract_Class a = new Abstract_Class(); // Abstract_Class is abstract; cannot be instantiated
                
        Car c = new Car();
        c.start();
        
        Scooter s = new Scooter();
        s.start();
    }

    
}