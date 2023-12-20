public class switch_2 {
    public static void main(String[] agrs) {
        String movie = "Salaar";
        String day = "Monday";

        switch(movie)
        {
            case "Iron Man":
            System.out.println("Iron Man Movie First Show on 6am Monady");
            break;
            case "Salaar":
            System.out.println("Relese on 22-12-2023");
            break;
            default:
            System.out.println("No movie on this time");

        }

        switch (day) {
            case "Sunady" :
                System.out.println("Today Sunday");
                break;
            case "Monday":
                System.out.println("Today is Monday");
                break;
            default:
                System.out.println("Today is not Monday and Sunday");
                break;
        }

    }
}
