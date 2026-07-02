import java.util.Random;
public class Ranum {
    public static void main(String[] args) {
        Random ran = new Random();
        int number;
        boolean isHead;
        double number2;

        number = ran.nextInt(1, 6);
        isHead = ran.nextBoolean();
        number2 = ran.nextDouble(1, 600);

        if(isHead){
            System.out.println("HEADS");
        }
        else{
            System.out.println("Tails");
        }
        System.out.println(number);
        System.out.println(number2);
    }
}