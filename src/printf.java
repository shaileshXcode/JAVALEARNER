public class printf {
    public static void main(String[] args){
        // %[flags][width][.precision][specifier-character]

        String name = "shailesh";
        char firstLetter  = 'S';
        int age = 22;
        double hieght = 22.5 ;
        boolean isStudent = true ;
//        System.out.printf("hello %s\n",name);
//        System.out.printf("your first letter is %c\n", firstLetter);
//        System.out.printf("your age %d years old\n", age);
//        System.out.printf("you are %f inches tall\n", hieght);
//        System.out.printf("employed : %b\n" ,isStudent);
        System.out.printf("hello %s , you are %d year old..also" +
                " you hieght is %f",name,age,hieght);
        /*
        | Specifier | Used For         |
| --------- | ---------------- |
| `%s`      | String           |
| `%d`      | Integer          |
| `%f`      | Decimal / double |
| `%c`      | Character        |
| `%b`      | Boolean          |

         */
//        precision
//        double price1 = 12.937;
//        double price2 = 73.2922;
//        double price3 = 92.339339;
//        System.out.printf("Price1: %.2f, Price2: %.3f,
//        Price3: %.4f", price1, price2, price3);
////        %(between specify how may decimal places u want)f

    }
}