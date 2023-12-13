public class else_if {
    public static void main (String[] args) {
        int a = 20;
        int b = 9;
        int c = 12;
 
        if(a > b && a > c) {
            System.out.println(a);
        } else if(b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}
