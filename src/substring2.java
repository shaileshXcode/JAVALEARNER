import java.util.Scanner;
public class substring2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String email , username , domain ;
        System.out.println("enter your email :");
        email = scanner.nextLine();
        if(email.contains("@")){
            username = email.substring(0,email.indexOf("@"));
            domain = email.substring(email.indexOf("@")+1);
            System.out.println(username);
//        System.out.println(email.substring(email.indexOf("g")));
//        out put is girnare@gmail.com whis is incoreect rather use below stuff
            System.out.println(domain);
        }
        else {
            System.out.println("your mail dosent contain @");
        }

    }
}