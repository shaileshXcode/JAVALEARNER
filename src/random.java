import java.util.Random;
public class random {
    public static void main(String[] args) {
        Random random = new Random();
        int number1;
        int number2;
        int number3;
        number1 = random.nextInt(1,7);
        number2 = random.nextInt(1,6);
        number3 = random.nextInt(1,6);
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
//        however the number is too big but if want small write (1,6) first number
//        is inclusive seconde is exclusive\
//        there can be data type of double also
    }
}
