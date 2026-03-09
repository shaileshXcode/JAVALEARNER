import java.util.Scanner;
public class temperature {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double temp ;
        double newTemp ;
        String unit ;
        System.out.println("enter the temperature : ");
        temp = scanner.nextDouble();
        System.out.println(" convert to Celsius or farehnite (C or F) ");
        unit = scanner.next().toUpperCase();
        newTemp =(unit.equals("C")) ?( temp- 32 )*5/9 :(temp*5/9)+ 32;
        System.out.printf( "%.2f", newTemp);
        scanner.close();

    }
}