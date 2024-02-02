import java.util.Scanner;

class YoungerAgeException extends RuntimeException
{
    YoungerAgeException(String msg)
    {
        super(msg);
    }
}

public class Throw_Keyword
{
    public static void main(String[] args)
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age : ");

        int age = sc.nextInt();
        try {
            if(age < 18)
            {
                throw new YoungerAgeException("You are not eligible for voting");
            }
            else
            {
                System.out.println("you can vote successfully");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Hello");
    }
}