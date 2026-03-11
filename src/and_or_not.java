import java.util.Scanner;
public class and_or_not {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
//        && for and || ; for or ! ;  for not that is statement is false
         /*String username;
        System.out.println("enter you username");
        username  = scanner.nextLine();
        if( username.length() < 4 || username.length() > 12) {
            System.out.println("user anem must contain 4 - 12 characterrs");

        }
        else if (username.contains(" ") || username.contains("_")) {
            System.out.println("username must not contain space or under score");
        }
        else {
            System.out.println("hello " + username);

          */
        double temp = 20;
        boolean isSunny = true;

        if (temp> 0 && temp <30 && !isSunny == false ){
            System.out.println("todays wether is good 😊");
        }
        else {
            System.out.println("wether is not good");
        }
    }
}