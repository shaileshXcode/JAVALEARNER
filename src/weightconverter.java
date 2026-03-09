import java.util.Scanner;

public class weightconverter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double weight ;
        double newWeight;
        int choice;
        System.out.println("welcome to weight converter ");
        System.out.println("1) convert lbs to kg ");
        System.out.println("2) convert kg to lbs ");

        System.out.println("enter a option ");
        choice = scanner.nextInt();

        if(choice == 1 ){
            System.out.println("enter weight in lbs");
            weight = scanner.nextDouble();
            newWeight = weight * 0.4535;
            System.out.printf("your weight in kg is : %.2f", newWeight);
        }
        else if (choice == 2 ){
            System.out.println("enter weight in kg");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("your weight in lbs is : %.2f", newWeight);

        }
        else {
            System.out.println("not a valid option");
        }

        scanner.close();
    }
}