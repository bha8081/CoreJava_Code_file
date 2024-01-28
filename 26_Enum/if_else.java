enum Car
{
  Start, Stop, Go, Park;
}

public class if_else
{
    public static void main(String[] args)
    {
        Car car = Car.Stop;

        // if (car == Car.Start)
        //     System.out.println("Car start now");
        // else if (car == Car.Stop)
        //     System.out.println("Car stop now");
        // else if (car == Car.Go)
        //     System.out.println("Go now");
        // else if (car == Car.Park)
        //     System.out.println("Car ");
        // else
        //     System.out.println("this is not your car");

    //  Switch case
        switch(car)
        {
            case  Start:
                System.out.println("car start now");
                break;
            case Stop:
                System.out.println("Car stop now");
                break;
            case Go:
                System.out.println("Car is go now");
                break;
            case Park:
                System.out.println("Car park now");
                break;
            default:
                System.out.println("This is not your car");
        }
    }
}