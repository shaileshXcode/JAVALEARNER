
import java.util.Scanner;

public class inputs2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("eneter your age : ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("neter your name: ");
        String name = scanner.nextLine();
        System.out.println("your age is " + age);
        System.out.println("your name is" + name);
        scanner.close();
    }
}
