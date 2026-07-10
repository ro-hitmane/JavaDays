
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean validOperator = true;

        System.out.print("Enter the first number: ");
        num1 = sc.nextDouble();

        System.out.print("Enter the second number: ");
        num2 = sc.nextDouble();

        System.out.print("Enter the operator(+, -, *, /, ^): ");
        operator = sc.next().charAt(0);

        switch (operator) {
            case '+' ->
                result = num1 + num2;
            case '-' ->
                result = num1 - num2;
            case '*' ->
                result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.print("cannot divide by zero");
                    validOperator = false;
                } else {
                    result = num1 / num2;
                }
            }
            case '^' ->
                result = Math.pow(num1, num2);
            default -> {
                System.out.print("Invalid operator!");
                validOperator = false;
            }
        }

        if (validOperator) {
            System.out.println(result);
        }

        sc.close();

    }
}
