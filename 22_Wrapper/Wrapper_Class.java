public class Wrapper_Class
{
    public static void main(String[] args)
    {
        String str = ("1234");
        Integer i1 = Integer.parseInt(str);
        // we are write Int or Integer no problem
        System.out.println(i1);

        int num = 7;
        Integer num1 = num; // autoboxing
        System.out.println(num1);

        int num2 = num1; //auto-unboxing
        System.out.println(num2);

        // Create an instance of the Integer wrapper class
        Integer intWrapper = new Integer(42);

        // Use the methods provided by the Integer class
        System.out.println("Integer value: " + intWrapper.intValue());
        System.out.println("String representation: " + intWrapper.toString());

        
    }
}