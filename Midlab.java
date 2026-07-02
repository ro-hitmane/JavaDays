import java.util.Scanner;

public class Midlab{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String adjective;
        String noun;
        String adjective2;
        String verb;
        String adjective3;

        System.out.print("Enter an adjective (desciption): ");
        adjective = scanner.nextLine();
        System.out.print("Enter the Noun (animal or person ): ");
        noun = scanner.nextLine();
        System.out.print("Enter the second adjective: ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter the verb (-ing action): ");
        verb = scanner.nextLine();
        System.out.print("Enter the third Adjective: ");
        adjective3 = scanner.nextLine();


        System.out.print(" Today I went to a " + adjective + " zoo.\n" + " In i saw a " + noun + " was " + adjective2 + " and " + verb + "!\n" + "I was " + adjective3 + "!");
    }


}