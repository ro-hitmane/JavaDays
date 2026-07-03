import java.util.Scanner;
public class Compint {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //compound interest calculator
        double principle;
        double rate;
        int timeCompounded;
        int years;
        double amount;

    
        System.out.print("Enter the principal amount: ");
        principle = sc.nextDouble();

        System.out.print("Enter the annual interest rate (in %): ");
        rate = sc.nextDouble() / 100;

        System.out.print("Enter the number of times interest is compounded per year: ");
        timeCompounded = sc.nextInt();

        System.out.print("Enter the number of years: ");
        years = sc.nextInt();

        amount = principle * Math.pow(1 + rate / timeCompounded, timeCompounded * years);

        System.out.printf("The compound interest after %d is %.2f", years, amount);

        sc.close();
    }
}