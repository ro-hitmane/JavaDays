
import java.util.Scanner;

public class Nestif {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isStudent;
        boolean isSenior;
        double price = 9.99;

        System.out.println("Are you aStudent? (true/false): ");
        isStudent = sc.nextBoolean();

        System.out.println("Are you a senior? (true/false): ");
        isSenior = sc.nextBoolean();

        if (isStudent) {
            if (isSenior) {
                System.out.print("You are a senior student. You get a 20% discount.\n");
                System.out.print("You are studnet. You get a 10% discount.\n");
                price *= 0.7;
            } else {
                System.out.print("You are studnet. You get a 10% discount.\n");
                price *= 0.9;

            }
        } else {
            if (isSenior) {
                System.out.print("You are a senior student. You get a 20% discount.\n");
                price *= 0.8;
            } else {
                price *= 1;
            }
        }
        System.out.printf("Your final price is: $ %.2f\n", price);
        sc.close();
    }
}
