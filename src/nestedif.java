public class nestedif {
    public static void main(String[] args){
        double price = 100;
        boolean isStudent = false ;
        boolean isSenior =false;
        if(isStudent){
            if(isSenior) {
                System.out.println("you get a student discount of 10 %");
                System.out.println("you get a senior discount of 20 %");
                price *= 0.7;
            }
            else {
                System.out.println("you get a student discount of 10 %");
                price = price * 0.9;
            }

        }
        else if(isSenior){
            System.out.println("you get a senior discount of 20 %");
            price *= 0.8;
        }
        else {
            System.out.println("you cant claim any discount");
        }
        System.out.printf("your ticket price is %.2f $ ",price);
    }
}