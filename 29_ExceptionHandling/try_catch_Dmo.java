public class try_catch_Dmo {
    public static void main(String[] args)
    {
        int i = 20;
        int j = 2;
        try {
          j = i / j;
        } catch(Exception e) {
            System.out.println(e);
        }

        System.out.println(j);
        System.out.println("Hello");
    }
}
