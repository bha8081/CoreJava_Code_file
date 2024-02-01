public class Finally_Block {
    public static void main(String[] args)
    {
        try {
            int a = 40;
            int b = 0;
            int c;
            c = a / b;
            System.out.println(c);
        } catch (ArithmeticException are) {
            // System.out.println("Pass only numeric value." +are);
            are.printStackTrace(); // print the all details class name, line number stack.
        } finally {
            System.out.println("this is finally block");
        }
    }
}