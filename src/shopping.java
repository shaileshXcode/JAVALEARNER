import java.util.Scanner;
public class shopping {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String item ;
        Double price;
        int quantity ;
        char Currency = '$';
        double total ;

        System.out.println(" what would u like to buy ");
        item = scanner.nextLine();

        System.out.println(" what is the price of the product");
        price = scanner.nextDouble();

        System.out.println("how many would u like to buy ?");
        quantity = scanner.nextInt();
        total = price * quantity  ;


        System.out.println(" you have buyed " + quantity +" " + item + " your total is " + total + " " + Currency );
        scanner.close();


    }
}