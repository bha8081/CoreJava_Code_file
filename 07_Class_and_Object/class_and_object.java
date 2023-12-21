class Addition {
    public int add(int n1, int n2) {
        int x = n1 + n2;
        return x;
    }
}

public class class_and_object {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        Addition a = new Addition();
        int result = a.add(num1, num2);
    System.out.println(result);
    }
}