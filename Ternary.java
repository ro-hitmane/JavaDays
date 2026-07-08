
import java.util.Scanner;

public class Ternary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //ternery operator ?= Return 1 if true and 0 if true`
        //variable = (condition) ? value if true : value if false
        int score = 55;
        /*if (score <= 60) {
            System.out.print("Fail");
        } else {
            System.out.print("Pass");
        }*/
 /* String passOrFail = (score >= 60) ? "Pass" : "Fail";

        System.out.println(passOrFail);*/

 /*int number = 3;
        String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";

        System.out.println(evenOrOdd);
         */
 /* int hour = 13;

        String timeOfDay = (hour < 12) ? "A.M." : "P.M.";
        System.out.println(timeOfDay);
         */
        double income = 1200000;
        double taxRate = (income <= 60000) ? 00 : 8;
        System.out.println(taxRate);

        sc.close();

    }
}
