import java.util.Scanner;

class UnderAgeException extends Exception {
    UnderAgeException() {
        super("You are under age");
    }

    UnderAgeException(String message) {
        super(message);
    }
}

public class Customized_Exception {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");

        // int age = 17;
        int age = sc.nextInt();
        try {
            if (age < 18) {
                throw new UnderAgeException("you can't eligible for the vote.");
            } else {
                System.out.println("you can vote now...!!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}