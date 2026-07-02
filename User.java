import java.util.Scanner;
public class User{
    public static void main(String[] args){
       /* Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Hello, " + name + "!" + "\n");
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("You are " + age + " years old." + "\n");
        System.out.print("Enter your GPA: ");
        double gpa = scanner.nextDouble();
        System.out.print("Your GPA is " + gpa + "\n");
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();
        if(isStudent){
            System.out.print("You are enrolled as a student");
            }
        else{
            System.out.print("You are not enrolled as a student");
            }

        scanner.close();
*/
   /* Scanner scanner = new Scanner(System.in);
    System.out.print("Emter age");
    int age = scanner.nextInt();
    System.out.print("Your Birth year");
    int year = scanner.nextInt();
    System.out.print("Enter name");
    String name = scanner.next();

    System.out.print("GPA");
    float gpa = scanner.nextFloat();

    System.out.print("your age is : " + age + " for birth year: " + year + " \nStudent named " + name + " has GPA of : " + gpa);

    System.out.print("\nAre you a student? (true/false)");
    boolean isStudent = scanner.nextBoolean();
    if(isStudent = true){
        System.out.print(name + " is a student");}
    else {
             System.out.print(name + " is not a Student");
    }*/
 /*  Scanner scanner = new Scanner(System.in);
   System.out.print("your age: ");
   int age = scanner.nextInt();
   scanner.nextLine();
   System.out.print("favourate color :");
   String color = scanner.nextLine();

   System.out.print("You are" + age + " years old.");
   System.out.print("\nYour favourite color is" + color);
*/
Scanner scanner = new Scanner(System.in);

//Area of rectangle
double width = 0;
double height = 0;
double area = 0;

System.out.print("Enter the width: ");
width = scanner.nextDouble();

System.out.print("Enter the height: ");
height = scanner.nextDouble();

area = width * height;

System.out.print(" Area is: " + area + "cm\n");


scanner.close();
    }
}