import java.util.Scanner;

public class calc {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double num1, num2  ;
        double result = 0;
        char operator;
        System.out.println("enter the first number ");
        num1 = scanner.nextDouble();
        System.out.println("eneter the operator(+,-,*,/,^) :");
        operator = scanner.next().charAt(0);
        System.out.println("enetr the second number :");
        num2 = scanner.nextDouble();
        switch (operator) {
            case '+' -> result = num1 + num2 ;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1*num2;
            case '/' -> result = num1/num2;
            case '^' -> result = Math.pow(num1,num2);
            default ->{
                System.out.println("invalid operator");
                return;
            }


        }
        System.out.println(result);
    }
}