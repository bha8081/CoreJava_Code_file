public class Error_Handling {
    public static void main(String[] args)
    {
        try {
            int a, b, c;
            a = 50;
            b = 0;
            c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
