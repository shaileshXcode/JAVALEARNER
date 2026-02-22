import java.util.Random;
public class random2  {
    public static void main(String[] args) {
        Random random = new Random();
        /*double number1;
        double number2;
        double number3;
        number1 = random.nextDouble(1,7);
        number2 = random.nextDouble(1,6);
        number3 = random.nextDouble(1,6);
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        */
        boolean isHeads ;
        isHeads = random.nextBoolean();
        if (isHeads){
            System.out.println("heads");
        }
        else{
            System.out.println("tails");
        }

    }
}
