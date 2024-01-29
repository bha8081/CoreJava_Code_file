@FunctionalInterface
interface Addition
{
    int add(int i, int j);
}

public class Return_Value
{
    public static void main(String[] args)
    {
        // Addition v = new Addition()
        // {
        //     public int add(int i, int j)
        //     {
        //         return i + j;
        //     }
        // };
        // int result = v.add(5,5);
        // System.out.println(result);

        // use Lambda expression
        // Additio ad = (i, j) -> i+j;
        Addition ad = (i, j) -> {
            return i * j;
        };
        int sum = ad.add(10, 10);
        System.out.println(sum);
    }
}