public class try_catch_Dmo {
    public static void main(String[] args)
    {
        int i = 50;
        int j = 0;
        try {
          j = i / j;
        } catch(Exception e) {
            // System.out.println(e);
            e.printStackTrace();
        }

        System.out.println(j);
        System.out.println("Hello");
    }
}
