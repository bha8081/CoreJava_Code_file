@FunctionalInterface
interface Boy
{
    // void show();

    // pass the some variable
    void display(int i, int j);
}

public class Lambda_Demo
{
    public static void main(String[] args)
    {
        //  -> this is the lambda simbol
        // Boy boy = () -> System.out.println("Boy's are you ready to match");
        // boy.show();

        // if we are only one variable then we don't need ()
        // Boy b = i -> sout;
        Boy b = (i,j) -> System.out.println("in display" +": "+i+":"+j);
        b.display(30, 50);

    }
}