import java.util.Scanner;
public class math2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
//        finding hypotenuse
//        double a;
//        double b;
//        double c;
//        System.out.println("enter side length a ");
//        a = scanner.nextDouble();
//        System.out.println("enter side length b ");
//        b = scanner.nextDouble();
//
//        c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
//        System.out.println("side c is "+ c);
        double radius ;
        double circumference;
        double area ;
        double volume;
        System.out.println("enter radius");
        radius= scanner.nextDouble();
        circumference = 2 * Math.PI * radius ;
        area = Math.PI * Math.pow(radius,2);
        volume = (4/3)*Math.PI*Math.pow(radius,3);
    System.out.println("circumference is " + circumference);
        System.out.println("area is " + area);
        System.out.printf("volume is %f",volume);

    }
}