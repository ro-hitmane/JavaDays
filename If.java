import java.util.Scanner;
public class If {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        boolean isIndian;

        System.out.println("Enter your name");
        name = sc.nextLine();

        System.out.println("Enter your age: ");
        age = sc.nextInt();

        System.out.println("Are you citizen of India? (true/false)");
        isIndian = sc.nextBoolean();

        //group1
        if(name.isEmpty()){
            System.out.println("Please enter your name*");
        }
        else{
            System.out.println("Hello " + name + "! Welcome to voter site");
        }

        //Group2
         if(age >= 18){
            System.out.println("You are eligible to vote!");
         }
         else if(age < 0){
            System.out.println("What are you doing here, can you even type?");
         }
         else{
            System.out.println("You are not eligible!");
         }

         //Group3

         if(isIndian){
            System.out.println("You are citizen of India!");
         }
         else{
            System.out.println("Why????????");
         }
    sc.close();
    }
}