
import java.util.Scanner;

public class Substring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*       
        String email = "abc@gmail.com";
        String username = email.substring(0, email.indexOf("@"));
        String domain = email.substring(email.indexOf("@") + 1);

        System.out.println(username);
        System.out.println(domain); 
         */
        String email;
        String username;
        String domain;

        System.out.print("Enter your email: ");

        email = sc.nextLine();
        username = email.substring(0, email.indexOf("@"));
        domain = email.substring(email.indexOf("@") + 1);

        System.out.println(username);
        System.out.println(domain);
        sc.close();

    }
}
