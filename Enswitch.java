
import java.util.Scanner;

public class Enswitch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Enhancemennt Switch = A replacement to amny if else statement

        //String day;
        //Added first letter capitalization for lowercase input
        System.out.print("Today is: ");
        String input = sc.nextLine();
        String day = input.substring(0, 1).toUpperCase() + input.substring(1);

        switch (day) {
            case "Monday" ->
                System.out.print("Its a Weekday");
            case "Tuesday" ->
                System.out.print("Its a Weekday");
            case "Wednesday" ->
                System.out.print("Its a Weekday");
            case "Thursday" ->
                System.out.print("Its a Weekday");
            case "Friday" ->
                System.out.print("Its a Weekday");
            case "Saturday" ->
                System.out.print("Its a Weekend");
            case "Sunday" ->
                System.out.print("Its a Weekdend");

        }

        sc.close();
    }
}
