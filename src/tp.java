import java.util.Scanner;
public class tp {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
//    String password;
//        System.out.println("enter password");
//        password = scanner.nextLine();
//        if (password.contains(" ")){
//            System.out.println("there is space in password");
//
//        }
//        else {
//            System.out.println(password);
//        }
        int age = 1;
        String isAdult = (age >= 18 ) ?"adult": "is child ";
        System.out.println(isAdult);
   }


}