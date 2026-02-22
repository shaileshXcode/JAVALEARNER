

 import java.util.Scanner;
public class input {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
//        this opening nad clossing of scannner class is compulsory
        System.out.print("Enter your name: ");
        String name= scanner.nextLine();
//         System.out.println("Enter your name ");
        System.out.print("Enter your age : ");
        int age = scanner.nextInt();
        System.out.print("Enter your gpa: ");
        double gpa = scanner.nextDouble();
        System.out.println("Are you a student (true/false)");
        Boolean isStudent = scanner.nextBoolean();


        System.out.println( "hello " + name);
        System.out.println("your are " + age + " years old");
        System.out.println("your gpa is "+ gpa);
        if(isStudent){
            System.out.println("you are enroleed");
        }
        else {
            System.out.println("you are not enrolled");
        }
        scanner.close();

    }
}