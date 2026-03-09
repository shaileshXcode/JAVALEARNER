import java.util.Scanner;
public class switchex {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the day ");
        String Day = scanner.nextLine().toLowerCase();
        switch (Day){
           /* case "monday"-> System.out.println("it is a week day");
            case "tuesday"-> System.out.println("it is a week day");
            case "wednesday"-> System.out.println("it is a week day");
            case "thursday"-> System.out.println("it is a week day");
            case "friday"-> System.out.println("it is a week day");
            case "saturday"-> System.out.println("it is a weekend");
            case "sunday"-> System.out.println("it is a weekend");
            default -> System.out.println(Day + " is not a day");

            */
            case "monday", "tuesday", "wednesday","thursday","friday" ->
                    System.out.println("it is wa weekday");
            case "staurday", "sunday" -> System.out.println("it is week end ");
            default -> System.out.println(Day + " is not a day");
        }



    }
}