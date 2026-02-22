import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        double width = 0;
        double hieght = 0;
        double area = 0;

        System.out.println("enter width :");
        width = scanner.nextDouble();
        System.out.println("eneter hieght :");
        hieght = scanner.nextDouble();
        area = width * hieght ;
        System.out.println(" area is " + area );

         */
        double radius = 0;
        double area = 0;
        System.out.println("enter radius: ");
        radius = scanner.nextDouble();
         area = 3.14 * radius * radius ;
        System.out.println("area is " + area );
        scanner.close();
    }
}