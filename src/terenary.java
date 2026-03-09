public class terenary {

    public static void main(String[] args) {

        // ternary operator ? = Return 1 of 2 values if a condition is true

        // variable = (condition) ? ifTrue : ifFalse;

     /*   int score = 70 ;
        String passOrFail = (score >= 60)? "pass" : "fail" ;


        int number = 3;
        String evenOrOdd = ( number % 2 == 0) ? "even" : "odd";
        System.out.println(evenOrOdd);

        int hours = 9 ;
        String amOrPm = (hours >= 12) ? "pm": "am";
        System.out.println(amOrPm);

      */
        int salary = 70000 ;

        double Tax = (salary >= 40000) ? 4.5 : 2 ;
        System.out.println(Tax + "%");

    }
}
