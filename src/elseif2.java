import java.util.Scanner;
public class elseif2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner( System.in);
        int age;
        String name;
        boolean isStudent;
        System.out.println("what is your name ?");
        name = scanner.nextLine();

        System.out.println(" are you a student?");
        isStudent = scanner.nextBoolean();


        System.out.println("what is your age?");
        age = scanner.nextInt();


//        GROUP 1

        if(name.isEmpty()){
            System.out.println("you didnt enter your name'😡");
        }
        else {
            System.out.println("hello " + name +"!😊");
        }
//        GROUP 2
        if (isStudent ){
            System.out.println("you are enrolled👌");
        }
        else {
            System.out.println("you are not enrolled😒" );
        }
//        GROUP 3
        if( age >= 18) {
            System.out.println("you are an adult");
        }
        else if( age >= 60) {
            System.out.println("you are senior citizen");

        }
//        ALWAYS REMMEBER THE CODE IS READ FROM TOP TO BOTTOM SO WRITE IN COORECT SEQUENCE
        else if( age == 0) {
            System.out.println(" you are just born");
        }
        else if( age <= 0 ){
            System.out.println("you are not yet born");
        }

        else{
            System.out.println(" you are a child");
        }
        scanner.close();
    }
}