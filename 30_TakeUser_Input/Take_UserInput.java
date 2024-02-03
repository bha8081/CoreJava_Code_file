import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Take_UserInput {
    public static void main(String[] args) throws IOException
    {
        System.out.println("Enter a number");
        int num = System.in.read();
        System.out.println(num - 48);

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);

        int num2 = Integer.parseInt(bf.readLine());
        System.out.println(num2);
        bf.close();

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int num3 = sc.nextInt();
        System.out.println(num3);


    }
}
