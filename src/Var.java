import java.sql.SQLOutput;

public class Var {
    public static void main(String[] args){

        System.out.println("VARIABLES IS JAVA");
        System.out.println(" 1) int variable only integers");
        int year = 2007 ;
        System.out.println("year is "+ year );
        int age = 18;
        System.out.println(age);
        System.out.println("2) double is decimal");
        double temperature = -23.8 ;
        System.out.println( temperature+ " celsius");
        double price = 22.98765;
        System.out.println(price);
        System.out.println("3) char symbol or character "  );
        char grade = 'A';
        char symbol = '@';
        char currency = '$';
        System.out.println(symbol);
//        nxt is boolean its for true or false
//        noew if variable name is of two word there are some rules
//        there should be no space first letter lower case sencond word first letter upper case
        boolean forSale = false;
        boolean isOnline = true ;
        boolean isTopper = false ;
        System.out.println(isOnline);
        System.out.println(forSale);
//        nxt is reference variables String

        String name =" shailesh girnare";
        System.out.println("your name is " + name);
        String email = " fake123@gmail.com";
//        string is basically series of characters
        System.out.println("your email is :" + email);
//        here string can contain number also
//        for char there is single quote'' and for string its double ""
        System.out.println( "hello" + name + year + grade);
        System.out.println( "hello" + name +" "+ year +" "+ grade);

        System.out.println( currency + price );



    }
}