import java.util.Scanner;

public class Mathc {
    public static void main(String[] args) {
       /*System.out.println(Math.PI);
        //System.out.println(Math.E);

        double result;

        result = Math.pow(2, 5);
        result = Math.abs(-5);
        result = Math.sqrt(9);
        result = Math.round(3.14);
        result = Math.ceil(3.14);
        result = Math.floor(3.14);
        result = Math.max(10, 20);
        result = Math.min(10, 20);

        System.out.print(result);*/

// Hypothenuse c = Math.sqrt(a^2 + b^2)
   /*     Scanner sc = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("Enter the length of side a: ");
        a = sc.nextDouble();

        System.out.print("Enter the length of side b: ");
        b = sc.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("The hypotenuse of side c is: " + c + "cm");

        sc.close();*/

        //circumference = 2 * Math.PI * radius;
        //area = math.PI *Math.pow(radius, 2);
        //volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3)
Scanner sc = new Scanner(System.in);
        double rad;
        double cir;
        double area;
        double vol;

        System.out.println("Enter the Radius: ");
        rad = sc.nextDouble();

        cir = 2 * Math.PI * rad;
        area = Math.PI * Math.pow(rad, 2);
        vol = (4.0 / 3.0) * Math.PI * Math.pow(rad, 3);

        System.out.printf("The circumference is: %.1fcm\n", cir);
        System.out.printf("The area is : %.1fcm^2\n", area);
        System.out.printf("The volume is : %.1fcm^3\n", vol);
        sc.close();
    }
}