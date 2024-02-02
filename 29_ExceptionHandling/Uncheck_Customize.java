import java.util.Scanner;

class UnderAgeException extends RuntimeException {
    UnderAgeException() {
        super("You are under age");
    }

    UnderAgeException(String message) {
        super(message);
    }
}

public class Uncheck_Customize {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");

        // int age = 17;
        int age = sc.nextInt();
        try {
            if (age < 18) {
                throw new UnderAgeException("You cannot vote as your age is below 18");
            } else {
                System.out.println("you can vote now..!!");
            }
        } catch (UnderAgeException e) {
            e.printStackTrace();
        }
        System.out.println("complet");
    }
}
