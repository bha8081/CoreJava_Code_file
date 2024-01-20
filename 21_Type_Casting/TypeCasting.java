public class TypeCasting
{
    public static void main(String[] args)
    {
        double d = 42.42;
        int i = (int) d; // explicit downcasting from double to int
        System.out.println(i);

        String str = "123";
        int num = Integer.parseInt(str);
        System.out.println(num);

        // float value type casting
        String str1 = "123.45";
        float num1 = Float.parseFloat(str1);
        System.out.println(num1);

        // char value type casting
        String str2 = "A";
        char charValue = str2.charAt(0);
        System.out.println(charValue);

        double doubleValue = 123.456;
        int intValue = (int) doubleValue; // Explicit typecasting from double to int (loss of decimal part)
        System.out.println(intValue);

    }
}